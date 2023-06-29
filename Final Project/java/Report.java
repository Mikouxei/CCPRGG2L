package com.maxi.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Report extends AppCompatActivity {

    TextView TxtFirstname;
    TextView TxtLastname;
    TextView TxtEmail;
    TextView TxtGender;
    TextView TxtPhone;
    TextView TxtHeight;
    TextView TxtWeight;
    TextView TxtCivilstatus;
    TextView TxtName;
    TextView TxtContact;
    TextView TxtPagibig;
    TextView TxtTin;
    TextView TxtPhilhealth;
    TextView TxtGsis;
    TextView TxtRelationship;
    TextView TxtElemSchool, TxtElemCourse;
    TextView TxtSecSchool, TxtSecCourse;
    TextView TxtVocSchool, TxtVocCourse;
    TextView TxtColSchool, TxtColCourse;
    TextView TxtGradSchool, TxtGradCourse;
    TextView TxtAns1, TxtAns1Detail;
    TextView TxtAns2, TxtAns2Detail;
    TextView TxtAns3, TxtAns3Detail;
    TextView TxtAns4a, TxtAns4aDetail;
    TextView TxtAns4b, TxtAns4bDetail;
    TextView TxtAns4c, TxtAns4cDetail;
    ImageView imageview;
    Button BtnReturn;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        TxtFirstname = findViewById(R.id.rep_firstName);
        TxtLastname = findViewById(R.id.rep_lastName);
        TxtEmail = findViewById(R.id.rep_email);
        TxtGender = findViewById(R.id.rep_gender);
        TxtPhone = findViewById(R.id.rep_phone);
        TxtHeight = findViewById(R.id.rep_height);
        TxtWeight = findViewById(R.id.rep_weight);
        TxtCivilstatus = findViewById(R.id.rep_civilStatus);
        TxtContact = findViewById(R.id.rep_contact);
        TxtName = findViewById(R.id.rep_name);
        TxtPhilhealth = findViewById(R.id.rep_philhealth);
        TxtTin = findViewById(R.id.rep_tin);
        TxtGsis = findViewById(R.id.rep_gsis);
        TxtPagibig = findViewById(R.id.rep_pagibig);
        TxtRelationship = findViewById(R.id.rep_relationship);

        TxtElemSchool = findViewById(R.id.rep_elementary_school);
        TxtElemCourse = findViewById(R.id.rep_elementary_course);
        TxtSecSchool = findViewById(R.id.rep_secondary_school);
        TxtSecCourse = findViewById(R.id.rep_secondary_course);
        TxtVocSchool = findViewById(R.id.rep_vocational_school);
        TxtVocCourse = findViewById(R.id.rep_vocational_course);
        TxtColSchool = findViewById(R.id.rep_college_school);
        TxtColCourse = findViewById(R.id.rep_college_course);
        TxtGradSchool = findViewById(R.id.rep_graduate_school);
        TxtGradCourse = findViewById(R.id.rep_graduate_course);

        TxtAns1 = findViewById(R.id.rep_cb_1);
        TxtAns2 = findViewById(R.id.rep_cb_2);
        TxtAns3 = findViewById(R.id.rep_cb_3);
        TxtAns4a = findViewById(R.id.rep_cb_4a);
        TxtAns4b = findViewById(R.id.rep_cb_4b);
        TxtAns4c = findViewById(R.id.rep_cb_4c);

        TxtAns1Detail = findViewById(R.id.rep_cb_1_detail);
        TxtAns2Detail = findViewById(R.id.rep_cb_2_detail);
        TxtAns3Detail = findViewById(R.id.rep_cb_3_detail);
        TxtAns4aDetail = findViewById(R.id.rep_cb_4a_detail);
        TxtAns4bDetail = findViewById(R.id.rep_cb_4b_detail);
        TxtAns4cDetail = findViewById(R.id.rep_cb_4c_detail);

        BtnReturn = findViewById(R.id.rep_return);

        imageview = findViewById(R.id.imageView);

        Intent activityIntent = getIntent();

        String firstname = activityIntent.getStringExtra("PBfirstname");
        String lastname = activityIntent.getStringExtra("PBlastname");
        String email = activityIntent.getStringExtra("PBemail");
        String gender = activityIntent.getStringExtra("PBgender");
        String phone = activityIntent.getStringExtra("PBphone");
        String height = activityIntent.getStringExtra("PBheight");
        String weight = activityIntent.getStringExtra("PBweight");
        String civilStatus = activityIntent.getStringExtra("PBcivilStatus");
        String name = activityIntent.getStringExtra("PBname");
        String contact = activityIntent.getStringExtra("PBcontact");
        String pagibig = activityIntent.getStringExtra("PBpagibig");
        String tin = activityIntent.getStringExtra("PBtin");
        String philhealth = activityIntent.getStringExtra("PBphilhealth");
        String gsis = activityIntent.getStringExtra("PBgsis");
        String relationships = activityIntent.getStringExtra("PBrelationships");

        String elemSchool = activityIntent.getStringExtra("EBelemNoS");
        String elemCourse = activityIntent.getStringExtra("EBelemBE");
        String secSchool = activityIntent.getStringExtra("EBsecNoS");
        String secCourse = activityIntent.getStringExtra("EBsecBE");
        String vocSchool = activityIntent.getStringExtra("EBvocNoS");
        String vocCourse = activityIntent.getStringExtra("EBvocBE");
        String colSchool = activityIntent.getStringExtra("EBcolNoS");
        String colCourse = activityIntent.getStringExtra("EBcolBE");
        String gradSchool = activityIntent.getStringExtra("EBgradNoS");
        String gradCourse = activityIntent.getStringExtra("EBgradBE");

        String answer1 = activityIntent.getStringExtra("ans1");
        String answer2 = activityIntent.getStringExtra("ans2");
        String answer3 = activityIntent.getStringExtra("ans3");
        String answer4a = activityIntent.getStringExtra("ans4a");
        String answer4b = activityIntent.getStringExtra("ans4b");
        String answer4c = activityIntent.getStringExtra("ans4c");

        String answer1detail = activityIntent.getStringExtra("ans1detail");
        String answer2detail = activityIntent.getStringExtra("ans2detail");
        String answer3detail = activityIntent.getStringExtra("ans3detail");
        String answer4adetail = activityIntent.getStringExtra("ans4adetail");
        String answer4bdetail = activityIntent.getStringExtra("ans4bdetail");
        String answer4cdetail = activityIntent.getStringExtra("ans4cdetail");

        String imageUriString = activityIntent.getStringExtra("PBimageUri");
        if (imageUriString != null) {
            imageUri = Uri.parse(imageUriString);
        }

        TxtFirstname.setText(firstname);
        TxtLastname.setText(lastname);
        TxtEmail.setText(email);
        TxtGender.setText(gender);
        TxtPhone.setText(phone);
        TxtHeight.setText(height);
        TxtWeight.setText(weight);
        TxtCivilstatus.setText(civilStatus);
        TxtName.setText(name);
        TxtContact.setText(contact);
        TxtPagibig.setText(pagibig);
        TxtTin.setText(tin);
        TxtPhilhealth.setText(philhealth);
        TxtGsis.setText(gsis);
        TxtRelationship.setText(relationships);

        TxtElemSchool.setText(elemSchool);
        TxtElemCourse.setText(elemCourse);
        TxtSecSchool.setText(secSchool);
        TxtSecCourse.setText(secCourse);
        TxtVocSchool.setText(vocSchool);
        TxtVocCourse.setText(vocCourse);
        TxtColSchool.setText(colSchool);
        TxtColCourse.setText(colCourse);
        TxtGradSchool.setText(gradSchool);
        TxtGradCourse.setText(gradCourse);

        TxtAns1.setText(answer1);
        TxtAns2.setText(answer2);
        TxtAns3.setText(answer3);
        TxtAns4a.setText(answer4a);
        TxtAns4b.setText(answer4b);
        TxtAns4c.setText(answer4c);

        if (answer1detail.equals("N/A")) {
            TxtAns1Detail.setVisibility(View.INVISIBLE);
        } else {
            TxtAns1Detail.setText("Details: " + answer1detail);
            TxtAns1Detail.setVisibility(View.VISIBLE);
        }

        if (answer2detail.equals("N/A")) {
            TxtAns2Detail.setVisibility(View.INVISIBLE);
        } else {
            TxtAns2Detail.setText("Details: " + answer2detail);
            TxtAns2Detail.setVisibility(View.VISIBLE);
        }

        if (answer3detail.equals("N/A")) {
            TxtAns3Detail.setVisibility(View.INVISIBLE);
        } else {
            TxtAns3Detail.setText("Details: " + answer3detail);
            TxtAns3Detail.setVisibility(View.VISIBLE);
        }

        if (answer4adetail.equals("N/A")) {
            TxtAns4aDetail.setVisibility(View.INVISIBLE);
        } else {
            TxtAns4aDetail.setText("Details: " + answer4adetail);
            TxtAns4aDetail.setVisibility(View.VISIBLE);
        }

        if (answer4bdetail.equals("N/A")) {
            TxtAns4bDetail.setVisibility(View.INVISIBLE);
        } else {
            TxtAns4bDetail.setText("Details: " + answer4bdetail);
            TxtAns4bDetail.setVisibility(View.VISIBLE);
        }

        if (answer4cdetail.equals("N/A")) {
            TxtAns4cDetail.setVisibility(View.INVISIBLE);
        } else {
            TxtAns4cDetail.setText("Details: " + answer4cdetail);
            TxtAns4cDetail.setVisibility(View.VISIBLE);
        }

        imageview.setImageURI(imageUri);

        BtnReturn.setOnClickListener(view -> {
            Intent report = new Intent(this, PersonalBackground.class);
            startActivity(report);
        });

    }
}