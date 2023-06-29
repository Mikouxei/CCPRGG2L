package com.maxi.finalproject;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersonalBackground extends AppCompatActivity {

    public static final int cameraPermissionCode = 101;
    public static final int cameraRequestCode = 102;
    EditText TxtFirstName;
    EditText TxtLastName;
    EditText TxtEmail;
    EditText TxtPhone;
    EditText TxtHeight;
    EditText TxtWeight;
    EditText TxtPagibig;
    EditText TxtTin;
    EditText TxtPhilhealth;
    EditText TxtGsis;
    EditText TxtName;
    EditText TxtContact;
    RadioGroup RGGender;
    RadioGroup RGCS;
    RadioButton RGGenderSelected;
    RadioButton RGCSSelected;
    ImageView SelectedImage;
    Button BtnCapture;
    Button BtnNext;
    Boolean imageComplete = false;
    Uri imageUri;
    Spinner SpnrRelationship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalbackground);

        Spinner relationship = findViewById(R.id.pb_ec_relationship);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.relationships, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        relationship.setAdapter(adapter);


        TxtFirstName = findViewById(R.id.pb_firstname);
        TxtLastName = findViewById(R.id.pb_lastname);
        TxtEmail = findViewById(R.id.pb_email);
        RGGender = findViewById(R.id.pb_gender_radioGroup);
        TxtPhone = findViewById(R.id.pb_phone);
        TxtHeight = findViewById(R.id.pb_height);
        TxtWeight = findViewById(R.id.pb_weight);
        RGCS = findViewById(R.id.pb_cs_radioGroup);
        TxtPagibig = findViewById(R.id.pb_pagibig);
        TxtTin = findViewById(R.id.pb_tin);
        TxtPhilhealth = findViewById(R.id.pb_philhealth);
        TxtGsis = findViewById(R.id.pb_gsis);
        TxtName = findViewById(R.id.pb_ec_name);
        TxtContact = findViewById(R.id.pb_ec_contact);
        SelectedImage = findViewById(R.id.pb_photo);
        BtnCapture = findViewById(R.id.pb_capture);
        BtnNext = findViewById(R.id.pb_next);
        SpnrRelationship = findViewById(R.id.pb_ec_relationship);

        BtnCapture.setOnClickListener(view -> askCameraPermission());

        BtnNext.setOnClickListener(view -> {
            boolean isAnyFieldEmpty = isAnyFieldEmpty(TxtFirstName, TxtLastName, TxtEmail, TxtPhone, TxtHeight, TxtWeight, TxtName, TxtContact);

            if (isAnyFieldEmpty || RGGender.getCheckedRadioButtonId() == -1 || RGCS.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Please fill in the required fields", Toast.LENGTH_SHORT).show();
            } else {
                String firstname = TxtFirstName.getText().toString();
                String lastname = TxtLastName.getText().toString();
                String email = TxtEmail.getText().toString();
                String gender = RGGenderSelected.getText().toString();
                String phone = TxtPhone.getText().toString();
                String height = TxtHeight.getText().toString();
                String weight = TxtWeight.getText().toString();
                String civilStatus = RGCSSelected.getText().toString();
                String pagibig = TxtPagibig.getText().toString();
                String tin = TxtTin.getText().toString();
                String philhealth = TxtPhilhealth.getText().toString();
                String gsis = TxtGsis.getText().toString();
                String name = TxtName.getText().toString();
                String contact = TxtContact.getText().toString();
                String relationships = SpnrRelationship.getSelectedItem().toString();

                Intent personalBackground = new Intent(this, EducationalBackground.class);

                personalBackground.putExtra("PBfirstname", firstname);
                personalBackground.putExtra("PBlastname", lastname);
                personalBackground.putExtra("PBemail", email);
                personalBackground.putExtra("PBgender", gender);
                personalBackground.putExtra("PBphone", phone);
                personalBackground.putExtra("PBheight", height);
                personalBackground.putExtra("PBweight", weight);
                personalBackground.putExtra("PBcivilStatus", civilStatus);
                personalBackground.putExtra("PBname", name);
                personalBackground.putExtra("PBcontact", contact);
                personalBackground.putExtra("PBrelationships", relationships);

                personalBackground.putExtra("PBpagibig", !TxtPagibig.getText().toString().isEmpty() ? pagibig : "N/A");
                personalBackground.putExtra("PBtin", !TxtTin.getText().toString().isEmpty() ? tin : "N/A");
                personalBackground.putExtra("PBphilhealth", !TxtPhilhealth.getText().toString().isEmpty() ? philhealth : "N/A");
                personalBackground.putExtra("PBgsis", !TxtGsis.getText().toString().isEmpty() ? gsis : "N/A");

                if (imageUri != null) {
                    personalBackground.putExtra("PBimageUri", imageUri.toString());
                }
                startActivity(personalBackground);
            }
        });

    }

    private boolean isAnyFieldEmpty(EditText... editTexts) {
        for (EditText editText : editTexts) {
            if (editText.getText().toString().isEmpty()){
                return true;
            }
        }
        return false;
    }

    private void askCameraPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, cameraPermissionCode);
        } else {
            openCamera();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            openCamera();
        } else {
            Toast.makeText(this, "Camera Permission is Required to Use the Camera", Toast.LENGTH_SHORT).show();
        }
    }

    private void openCamera() {
        Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camera, cameraRequestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == cameraRequestCode && resultCode == RESULT_OK) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            SelectedImage.setImageBitmap(image);

            imageUri = saveImageToStorage(image);

            imageComplete = true;
        }
    }

    public void checkGender(View v) {
        int radioId = RGGender.getCheckedRadioButtonId();
        RGGenderSelected = findViewById(radioId);
    }

    public void checkCS(View v) {
        int radioId = RGCS.getCheckedRadioButtonId();
        RGCSSelected = findViewById(radioId);
    }

    private Uri saveImageToStorage(Bitmap image) {

        File directory = new File(getFilesDir(), "images");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        String fileName = "image_" + System.currentTimeMillis() + ".jpg";

        File imageFile = new File(directory, fileName);

        try {
            FileOutputStream outputStream = new FileOutputStream(imageFile);
            image.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
            outputStream.flush();
            outputStream.close();

            return Uri.fromFile(imageFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}