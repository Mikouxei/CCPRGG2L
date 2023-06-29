package com.maxi.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EducationalBackground extends AppCompatActivity {

    RadioGroup EducAttainment;
    RadioButton EducAttainmentSelected;
    TextView Elem, Sec, Voc, Col, Grad;
    EditText TxtElemNoS, TxtElemBE;
    TextView TxtElemNoSTV, TxtElemBETV;
    EditText TxtSecondNoS, TxtSecondBE;
    TextView TxtSecondNoSTV, TxtSecondBETV;
    EditText TxtVocNoS, TxtVocBE;
    TextView TxtVocNoSTV, TxtVocBETV;
    EditText TxtColNoS, TxtColBE;
    TextView TxtColNoSTV, TxtColBETV;
    EditText TxtGradNoS, TxtGradBE;
    TextView TxtGradNoSTV, TxtGradBETV;
    Button BtnNext;
    Uri imageUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_background);

        EducAttainment = findViewById(R.id.ed_educAttainment_radioGroup);
        Elem = findViewById(R.id.elem_txtView);
        Sec= findViewById(R.id.secondary_txtView);
        Voc = findViewById(R.id.vocational_txtView);
        Col = findViewById(R.id.college_txtView);
        Grad = findViewById(R.id.graduate_txtView);
        TxtElemNoS = findViewById(R.id.eb_Elem_NoS);
        TxtElemBE = findViewById(R.id.eb_Elem_BE);
        TxtElemNoSTV = findViewById(R.id.cb_1_txtView);
        TxtElemBETV = findViewById(R.id.elem_BE_txtView);
        TxtSecondNoS = findViewById(R.id.eb_Secondary_NoS);
        TxtSecondBE = findViewById(R.id.eb_Secondary_BE);
        TxtSecondNoSTV = findViewById(R.id.secondary_NoS_txtView);
        TxtSecondBETV = findViewById(R.id.secondary_BE_txtView);
        TxtVocNoS = findViewById(R.id.eb_Vocational_NoS);
        TxtVocBE = findViewById(R.id.eb_Vocational_BE);
        TxtVocNoSTV = findViewById(R.id.vocational_NoS_txtView);
        TxtVocBETV = findViewById(R.id.vocational_BE_txtView);
        TxtColNoS = findViewById(R.id.eb_College_NoS);
        TxtColBE = findViewById(R.id.eb_College_BE);
        TxtColNoSTV = findViewById(R.id.college_NoS_txtView);
        TxtColBETV = findViewById(R.id.college_BE_txtView);
        TxtGradNoS = findViewById(R.id.eb_Graduate_NoS);
        TxtGradBE = findViewById(R.id.eb_Graduate_BE);
        TxtGradNoSTV = findViewById(R.id.graduateStudies_NoS_txtView);
        TxtGradBETV = findViewById(R.id.graduateStudies_BE_txtView);
        BtnNext = findViewById(R.id.eb_next);

        BtnNext.setOnClickListener(view -> {

            if (EducAttainment.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Please select educational attainment", Toast.LENGTH_SHORT).show();
            } else {
                boolean isAnyFieldEmpty = false;

                switch (EducAttainmentSelected.getText().toString()) {
                    case "Elementary":
                        isAnyFieldEmpty = isAnyFieldEmpty(TxtElemNoS, TxtElemBE);
                        break;
                    case "Secondary":
                        isAnyFieldEmpty = isAnyFieldEmpty(TxtElemNoS, TxtElemBE, TxtSecondNoS, TxtSecondBE);
                        break;
                    case "Vocational":
                        isAnyFieldEmpty = isAnyFieldEmpty(TxtElemNoS, TxtElemBE, TxtSecondNoS, TxtSecondBE, TxtVocNoS, TxtVocBE);
                        break;
                    case "College":
                        isAnyFieldEmpty = isAnyFieldEmpty(TxtElemNoS, TxtElemBE, TxtSecondNoS, TxtSecondBE, TxtVocNoS, TxtVocBE, TxtColNoS, TxtColBE);
                        break;
                    case "Graduate Studies":
                        isAnyFieldEmpty = isAnyFieldEmpty(TxtElemNoS, TxtElemBE, TxtSecondNoS, TxtSecondBE, TxtVocNoS, TxtVocBE, TxtColNoS, TxtColBE, TxtGradNoS, TxtGradBE);
                        break;
                }

                if (isAnyFieldEmpty) {
                    Toast.makeText(this, "Please fill in the the Required Fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent personalBackground = getIntent();
//
                    String firstname = personalBackground.getStringExtra("PBfirstname");
                    String lastname = personalBackground.getStringExtra("PBlastname");
                    String email = personalBackground.getStringExtra("PBemail");
                    String gender = personalBackground.getStringExtra("PBgender");
                    String phone = personalBackground.getStringExtra("PBphone");
                    String height = personalBackground.getStringExtra("PBheight");
                    String weight = personalBackground.getStringExtra("PBweight");
                    String civilStatus = personalBackground.getStringExtra("PBcivilStatus");
                    String name = personalBackground.getStringExtra("PBname");
                    String contact = personalBackground.getStringExtra("PBcontact");
                    String pagibig = personalBackground.getStringExtra("PBpagibig");
                    String tin = personalBackground.getStringExtra("PBtin");
                    String philhealth = personalBackground.getStringExtra("PBphilhealth");
                    String gsis = personalBackground.getStringExtra("PBgsis");
                    String relationships = personalBackground.getStringExtra("PBrelationships");

                    String imageUriString = personalBackground.getStringExtra("PBimageUri");
                    if (imageUriString != null) {
                        imageUri = Uri.parse(imageUriString);
                    }

                    String elemSchool = TxtElemNoS.getText().toString();
                    String elemCourse = TxtElemBE.getText().toString();
                    String secSchool = TxtSecondNoS.getText().toString();
                    String secCourse = TxtSecondBE.getText().toString();
                    String vocSchool = TxtVocNoS.getText().toString();
                    String vocCourse = TxtVocBE.getText().toString();
                    String colSchool = TxtColNoS.getText().toString();
                    String colCourse = TxtColBE.getText().toString();
                    String gradSchool = TxtGradNoS.getText().toString();
                    String gradCourse = TxtGradBE.getText().toString();

                    Intent EducationalBackground = new Intent(this, CriminalBackground.class);

                    EducationalBackground.putExtra("PBfirstname", firstname);
                    EducationalBackground.putExtra("PBlastname", lastname);
                    EducationalBackground.putExtra("PBemail", email);
                    EducationalBackground.putExtra("PBgender", gender);
                    EducationalBackground.putExtra("PBphone", phone);
                    EducationalBackground.putExtra("PBheight", height);
                    EducationalBackground.putExtra("PBweight", weight);
                    EducationalBackground.putExtra("PBcivilStatus", civilStatus);
                    EducationalBackground.putExtra("PBname", name);
                    EducationalBackground.putExtra("PBcontact", contact);
                    EducationalBackground.putExtra("PBpagibig", pagibig);
                    EducationalBackground.putExtra("PBtin", tin);
                    EducationalBackground.putExtra("PBphilhealth", philhealth);
                    EducationalBackground.putExtra("PBgsis", gsis);
                    EducationalBackground.putExtra("PBrelationships", relationships);

                    EducationalBackground.putExtra("EBelemNoS", !elemSchool.isEmpty() ? elemSchool : "N/A");
                    EducationalBackground.putExtra("EBelemBE", !elemCourse.isEmpty() ? elemCourse : "N/A");
                    EducationalBackground.putExtra("EBsecNoS", !secSchool.isEmpty() ? secSchool : "N/A");
                    EducationalBackground.putExtra("EBsecBE", !secCourse.isEmpty() ? secCourse : "N/A");
                    EducationalBackground.putExtra("EBvocNoS", !vocSchool.isEmpty() ? vocSchool : "N/A");
                    EducationalBackground.putExtra("EBvocBE", !vocCourse.isEmpty() ? vocCourse : "N/A");
                    EducationalBackground.putExtra("EBcolNoS", !colSchool.isEmpty() ? colSchool : "N/A");
                    EducationalBackground.putExtra("EBcolBE", !colCourse.isEmpty() ? colCourse : "N/A");
                    EducationalBackground.putExtra("EBgradNoS", !gradSchool.isEmpty() ? gradSchool : "N/A");
                    EducationalBackground.putExtra("EBgradBE", !gradCourse.isEmpty() ? gradCourse : "N/A");

                    EducationalBackground.putExtra("PBimageUri", imageUri.toString());

                    startActivity(EducationalBackground);
                }
            }
        });

    }

    public void checkEducAttainment(View v){
        int radioId = EducAttainment.getCheckedRadioButtonId();
        EducAttainmentSelected = findViewById(radioId);

        if (EducAttainmentSelected.getText().toString().equals("Elementary")) {
            Elem.setVisibility(View.VISIBLE);
            Sec.setVisibility(View.GONE);
            Voc.setVisibility(View.GONE);
            Col.setVisibility(View.GONE);
            Grad.setVisibility(View.GONE);
            TxtElemNoS.setVisibility(View.VISIBLE);
            TxtElemBE.setVisibility(View.VISIBLE);
            TxtElemNoSTV.setVisibility(View.VISIBLE);
            TxtElemBETV.setVisibility(View.VISIBLE);
            TxtSecondNoS.setVisibility(View.GONE);
            TxtSecondBE.setVisibility(View.GONE);
            TxtSecondNoSTV.setVisibility(View.GONE);
            TxtSecondBETV.setVisibility(View.GONE);
            TxtVocNoS.setVisibility(View.GONE);
            TxtVocBE.setVisibility(View.GONE);
            TxtVocNoSTV.setVisibility(View.GONE);
            TxtVocBETV.setVisibility(View.GONE);
            TxtColNoS.setVisibility(View.GONE);
            TxtColBE.setVisibility(View.GONE);
            TxtColNoSTV.setVisibility(View.GONE);
            TxtColBETV.setVisibility(View.GONE);
            TxtGradNoS.setVisibility(View.GONE);
            TxtGradBE.setVisibility(View.GONE);
            TxtGradNoSTV.setVisibility(View.GONE);
            TxtGradBETV.setVisibility(View.GONE);
        } else if (EducAttainmentSelected.getText().toString().equals("Secondary")) {
            Elem.setVisibility(View.VISIBLE);
            Sec.setVisibility(View.VISIBLE);
            Voc.setVisibility(View.GONE);
            Col.setVisibility(View.GONE);
            Grad.setVisibility(View.GONE);
            TxtElemNoS.setVisibility(View.VISIBLE);
            TxtElemBE.setVisibility(View.VISIBLE);
            TxtElemNoSTV.setVisibility(View.VISIBLE);
            TxtElemBETV.setVisibility(View.VISIBLE);
            TxtSecondNoS.setVisibility(View.VISIBLE);
            TxtSecondBE.setVisibility(View.VISIBLE);
            TxtSecondNoSTV.setVisibility(View.VISIBLE);
            TxtSecondBETV.setVisibility(View.VISIBLE);
            TxtVocNoS.setVisibility(View.GONE);
            TxtVocBE.setVisibility(View.GONE);
            TxtVocNoSTV.setVisibility(View.GONE);
            TxtVocBETV.setVisibility(View.GONE);
            TxtColNoS.setVisibility(View.GONE);
            TxtColNoSTV.setVisibility(View.GONE);
            TxtColBETV.setVisibility(View.GONE);
            TxtColBE.setVisibility(View.GONE);
            TxtGradNoS.setVisibility(View.GONE);
            TxtGradBE.setVisibility(View.GONE);
            TxtGradNoSTV.setVisibility(View.GONE);
            TxtGradBETV.setVisibility(View.GONE);
        } else if (EducAttainmentSelected.getText().toString().equals("Vocational")) {
            Elem.setVisibility(View.VISIBLE);
            Sec.setVisibility(View.VISIBLE);
            Voc.setVisibility(View.VISIBLE);
            Col.setVisibility(View.GONE);
            Grad.setVisibility(View.GONE);
            TxtElemNoS.setVisibility(View.VISIBLE);
            TxtElemBE.setVisibility(View.VISIBLE);
            TxtElemNoSTV.setVisibility(View.VISIBLE);
            TxtElemBETV.setVisibility(View.VISIBLE);
            TxtSecondNoS.setVisibility(View.VISIBLE);
            TxtSecondBE.setVisibility(View.VISIBLE);
            TxtSecondNoSTV.setVisibility(View.VISIBLE);
            TxtSecondBETV.setVisibility(View.VISIBLE);
            TxtVocNoS.setVisibility(View.VISIBLE);
            TxtVocBE.setVisibility(View.VISIBLE);
            TxtVocNoSTV.setVisibility(View.VISIBLE);
            TxtVocBETV.setVisibility(View.VISIBLE);
            TxtColNoS.setVisibility(View.GONE);
            TxtColBE.setVisibility(View.GONE);
            TxtColNoSTV.setVisibility(View.GONE);
            TxtColBETV.setVisibility(View.GONE);
            TxtGradNoS.setVisibility(View.GONE);
            TxtGradBE.setVisibility(View.GONE);
            TxtGradNoSTV.setVisibility(View.GONE);
            TxtGradBETV.setVisibility(View.GONE);
        } else if (EducAttainmentSelected.getText().toString().equals("College")) {
            Elem.setVisibility(View.VISIBLE);
            Sec.setVisibility(View.VISIBLE);
            Voc.setVisibility(View.VISIBLE);
            Col.setVisibility(View.VISIBLE);
            Grad.setVisibility(View.GONE);
            TxtElemNoS.setVisibility(View.VISIBLE);
            TxtElemBE.setVisibility(View.VISIBLE);
            TxtElemNoSTV.setVisibility(View.VISIBLE);
            TxtElemBETV.setVisibility(View.VISIBLE);
            TxtSecondNoS.setVisibility(View.VISIBLE);
            TxtSecondBE.setVisibility(View.VISIBLE);
            TxtSecondNoSTV.setVisibility(View.VISIBLE);
            TxtSecondBETV.setVisibility(View.VISIBLE);
            TxtVocNoS.setVisibility(View.VISIBLE);
            TxtVocBE.setVisibility(View.VISIBLE);
            TxtVocNoSTV.setVisibility(View.VISIBLE);
            TxtVocBETV.setVisibility(View.VISIBLE);
            TxtColNoS.setVisibility(View.VISIBLE);
            TxtColBE.setVisibility(View.VISIBLE);
            TxtColNoSTV.setVisibility(View.VISIBLE);
            TxtColBETV.setVisibility(View.VISIBLE);
            TxtGradNoS.setVisibility(View.GONE);
            TxtGradBE.setVisibility(View.GONE);
            TxtGradNoSTV.setVisibility(View.GONE);
            TxtGradBETV.setVisibility(View.GONE);
        } else if (EducAttainmentSelected.getText().toString().equals("Graduate Studies")) {
            Elem.setVisibility(View.VISIBLE);
            Sec.setVisibility(View.VISIBLE);
            Voc.setVisibility(View.VISIBLE);
            Col.setVisibility(View.VISIBLE);
            Grad.setVisibility(View.VISIBLE);
            TxtElemNoS.setVisibility(View.VISIBLE);
            TxtElemBE.setVisibility(View.VISIBLE);
            TxtElemNoSTV.setVisibility(View.VISIBLE);
            TxtElemBETV.setVisibility(View.VISIBLE);
            TxtSecondNoS.setVisibility(View.VISIBLE);
            TxtSecondBE.setVisibility(View.VISIBLE);
            TxtSecondNoSTV.setVisibility(View.VISIBLE);
            TxtSecondBETV.setVisibility(View.VISIBLE);
            TxtVocNoS.setVisibility(View.VISIBLE);
            TxtVocBE.setVisibility(View.VISIBLE);
            TxtVocNoSTV.setVisibility(View.VISIBLE);
            TxtVocBETV.setVisibility(View.VISIBLE);
            TxtColNoS.setVisibility(View.VISIBLE);
            TxtColBE.setVisibility(View.VISIBLE);
            TxtColNoSTV.setVisibility(View.VISIBLE);
            TxtColBETV.setVisibility(View.VISIBLE);
            TxtGradNoS.setVisibility(View.VISIBLE);
            TxtGradBE.setVisibility(View.VISIBLE);
            TxtGradNoSTV.setVisibility(View.VISIBLE);
            TxtGradBETV.setVisibility(View.VISIBLE);
        }
    }

    private boolean isAnyFieldEmpty(EditText... editTexts) {
        for (EditText editText : editTexts) {
            if (editText.getText().toString().isEmpty()){
                return true;
            }
        }
        return false;
    }

}