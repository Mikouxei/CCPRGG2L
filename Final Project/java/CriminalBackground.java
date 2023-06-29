package com.maxi.finalproject;

import static com.maxi.finalproject.Notification.Notification_Channel;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class CriminalBackground extends AppCompatActivity {
    private NotificationManagerCompat notification_manager;
    RadioGroup RG1, RG2, RG3, RG4a, RG4b, RG4c;
    RadioButton RG1Selected, RG2Selected, RG3Selected, RG4aSelected, RG4bSelected, RG4cSelected;
    Button BtnNext;
    EditText Txt1Detail, Txt2Detail, Txt3Detail, Txt4aDetail, Txt4bDetail, Txt4cDetail;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_background);

        RG1 = findViewById(R.id.cb_1_radioGroup);
        RG2 = findViewById(R.id.cb_2_radioGroup);
        RG3 = findViewById(R.id.cb_3_radioGroup);
        RG4a = findViewById(R.id.cb_4a_radioGroup);
        RG4b = findViewById(R.id.cb_4b_radioGroup);
        RG4c = findViewById(R.id.cb_4c_radioGroup);
        BtnNext = findViewById(R.id.cb_next);
        Txt1Detail = findViewById(R.id.cb_1_detail);
        Txt2Detail = findViewById(R.id.cb_2_detail);
        Txt3Detail = findViewById(R.id.cb_3_detail);
        Txt4aDetail = findViewById(R.id.cb_4a_detail);
        Txt4bDetail = findViewById(R.id.cb_4b_detail);
        Txt4cDetail = findViewById(R.id.cb_4c_detail);

        BtnNext.setOnClickListener(view -> {
            if (RG1.getCheckedRadioButtonId() == -1 || RG2.getCheckedRadioButtonId() == -1 || RG3.getCheckedRadioButtonId() == -1 || RG4a.getCheckedRadioButtonId() == -1 || RG4b.getCheckedRadioButtonId() == -1 || RG4c.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Please fill in the Required Fields", Toast.LENGTH_SHORT).show();
            } else {
                boolean one = false;
                boolean two = false;
                boolean three = false;
                boolean fourA = false;
                boolean fourB = false;
                boolean fourC = false;

                switch (RG1Selected.getText().toString()) {
                    case "Yes":
                        if (Txt1Detail.getText().toString().isEmpty()) {
                            one = true;
                        }
                        break;
                }
                switch (RG2Selected.getText().toString()) {
                    case "Yes":
                        if (Txt2Detail.getText().toString().isEmpty()) {
                            two = true;
                        }
                }
                switch (RG3Selected.getText().toString()) {
                    case "Yes":
                        if (Txt3Detail.getText().toString().isEmpty()) {
                            three = true;
                        }
                }
                switch (RG4aSelected.getText().toString()) {
                    case "Yes":
                        if (Txt4aDetail.getText().toString().isEmpty()) {
                            fourA = true;
                        }
                }
                switch (RG4bSelected.getText().toString()) {
                    case "Yes":
                        if (Txt4bDetail.getText().toString().isEmpty()) {
                            fourB = true;
                        }
                }
                switch (RG4cSelected.getText().toString()) {
                    case "Yes":
                        if (Txt4cDetail.getText().toString().isEmpty()) {
                            fourC = true;
                        }
                }

                if (!one && !two && !three && !fourA && !fourB && !fourC) {
                    if (RG1.getCheckedRadioButtonId() == -1 || RG2.getCheckedRadioButtonId() == -1 || RG3.getCheckedRadioButtonId() == -1 || RG4a.getCheckedRadioButtonId() == -1 || RG4b.getCheckedRadioButtonId() == -1 || RG4c.getCheckedRadioButtonId() == -1) {
                        Toast.makeText(this, "Please fill in the Required Fields", Toast.LENGTH_SHORT).show();
                    } else {
                        pushNotification();
                    }
                } else {
                    Toast.makeText(this, "Please fill in the Required Fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void pushNotification() {
        Intent EducationalBackground = getIntent();

        String firstname = EducationalBackground.getStringExtra("PBfirstname");
        String lastname = EducationalBackground.getStringExtra("PBlastname");
        String email = EducationalBackground.getStringExtra("PBemail");
        String gender = EducationalBackground.getStringExtra("PBgender");
        String phone = EducationalBackground.getStringExtra("PBphone");
        String height = EducationalBackground.getStringExtra("PBheight");
        String weight = EducationalBackground.getStringExtra("PBweight");
        String civilStatus = EducationalBackground.getStringExtra("PBcivilStatus");
        String name = EducationalBackground.getStringExtra("PBname");
        String contact = EducationalBackground.getStringExtra("PBcontact");
        String pagibig = EducationalBackground.getStringExtra("PBpagibig");
        String tin = EducationalBackground.getStringExtra("PBtin");
        String philhealth = EducationalBackground.getStringExtra("PBphilhealth");
        String gsis = EducationalBackground.getStringExtra("PBgsis");
        String relationships = EducationalBackground.getStringExtra("PBrelationships");

        String elemSchool = EducationalBackground.getStringExtra("EBelemNoS");
        String elemCourse = EducationalBackground.getStringExtra("EBelemBE");
        String secSchool = EducationalBackground.getStringExtra("EBsecNoS");
        String secCourse = EducationalBackground.getStringExtra("EBsecBE");
        String vocSchool = EducationalBackground.getStringExtra("EBvocNoS");
        String vocCourse = EducationalBackground.getStringExtra("EBvocBE");
        String colSchool = EducationalBackground.getStringExtra("EBcolNoS");
        String colCourse = EducationalBackground.getStringExtra("EBcolBE");
        String gradSchool = EducationalBackground.getStringExtra("EBgradNoS");
        String gradCourse = EducationalBackground.getStringExtra("EBgradBE");

        String imageUriString = EducationalBackground.getStringExtra("PBimageUri");
        if (imageUriString != null) {
            imageUri = Uri.parse(imageUriString);
        }


        Intent activityIntent = new Intent(this, Report.class);

        activityIntent.putExtra("PBfirstname", firstname);
        activityIntent.putExtra("PBlastname", lastname);
        activityIntent.putExtra("PBemail", email);
        activityIntent.putExtra("PBgender", gender);
        activityIntent.putExtra("PBphone", phone);
        activityIntent.putExtra("PBheight", height);
        activityIntent.putExtra("PBweight", weight);
        activityIntent.putExtra("PBcivilStatus", civilStatus);
        activityIntent.putExtra("PBname", name);
        activityIntent.putExtra("PBcontact", contact);
        activityIntent.putExtra("PBpagibig", pagibig);
        activityIntent.putExtra("PBtin", tin);
        activityIntent.putExtra("PBphilhealth", philhealth);
        activityIntent.putExtra("PBgsis", gsis);
        activityIntent.putExtra("PBrelationships", relationships);

        activityIntent.putExtra("EBelemNoS", elemSchool);
        activityIntent.putExtra("EBelemBE", elemCourse);
        activityIntent.putExtra("EBsecNoS", secSchool);
        activityIntent.putExtra("EBsecBE", secCourse);
        activityIntent.putExtra("EBvocNoS", vocSchool);
        activityIntent.putExtra("EBvocBE", vocCourse);
        activityIntent.putExtra("EBcolNoS", colSchool);
        activityIntent.putExtra("EBcolBE", colCourse);
        activityIntent.putExtra("EBgradNoS", gradSchool);
        activityIntent.putExtra("EBgradBE", gradCourse);

        String answer1 = RG1Selected.getText().toString();
        String answer1detail = Txt1Detail.getText().toString();
        String answer2 = RG2Selected.getText().toString();
        String answer2detail = Txt2Detail.getText().toString();
        String answer3 = RG3Selected.getText().toString();
        String answer3detail = Txt3Detail.getText().toString();
        String answer4a = RG4aSelected.getText().toString();
        String answer4adetail = Txt4aDetail.getText().toString();
        String answer4b = RG4bSelected.getText().toString();
        String answer4bdetail = Txt4bDetail.getText().toString();
        String answer4c = RG4cSelected.getText().toString();
        String answer4cdetail = Txt4cDetail.getText().toString();

        activityIntent.putExtra("ans1", answer1);
        activityIntent.putExtra("ans2", answer2);
        activityIntent.putExtra("ans3", answer3);
        activityIntent.putExtra("ans4a", answer4a);
        activityIntent.putExtra("ans4b", answer4b);
        activityIntent.putExtra("ans4c", answer4c);

        activityIntent.putExtra("ans1detail", !answer1detail.isEmpty() ? answer1detail : "N/A");
        activityIntent.putExtra("ans2detail", !answer2detail.isEmpty() ? answer2detail : "N/A");
        activityIntent.putExtra("ans3detail", !answer3detail.isEmpty() ? answer3detail : "N/A");
        activityIntent.putExtra("ans4adetail", !answer4adetail.isEmpty() ? answer4adetail : "N/A");
        activityIntent.putExtra("ans4bdetail", !answer4bdetail.isEmpty() ? answer4bdetail : "N/A");
        activityIntent.putExtra("ans4cdetail", !answer4cdetail.isEmpty() ? answer4cdetail : "N/A");

        activityIntent.putExtra("PBimageUri", imageUri.toString());

        PendingIntent contentIntent = PendingIntent.getActivity(this,
                0, activityIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        android.app.Notification notification = new NotificationCompat.Builder(this, Notification_Channel)
                .setSmallIcon(R.drawable.baseline_complete)
                .setContentTitle("Report")
                .setContentText("Your information is ready")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(contentIntent)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .build();

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        notification_manager = NotificationManagerCompat.from(this);
        notification_manager.notify(1, notification);
    }

    public void check1(View v) {
        int radioId = RG1.getCheckedRadioButtonId();
        RG1Selected = findViewById(radioId);

        if (RG1Selected.getText().toString().equals("No")) {
            Txt1Detail.setVisibility(View.GONE);
        } else {
            Txt1Detail.setVisibility(View.VISIBLE);
        }
    }

    public void check2(View v) {
        int radioId = RG2.getCheckedRadioButtonId();
        RG2Selected = findViewById(radioId);

        if (RG2Selected.getText().toString().equals("No")) {
            Txt2Detail.setVisibility(View.GONE);
        } else {
            Txt2Detail.setVisibility(View.VISIBLE);
        }
    }

    public void check3(View v) {
        int radioId = RG3.getCheckedRadioButtonId();
        RG3Selected = findViewById(radioId);

        if (RG3Selected.getText().toString().equals("No")) {
            Txt3Detail.setVisibility(View.GONE);
        } else {
            Txt3Detail.setVisibility(View.VISIBLE);
        }
    }

    public void check4a(View v) {
        int radioId = RG4a.getCheckedRadioButtonId();
        RG4aSelected = findViewById(radioId);

        if (RG4aSelected.getText().toString().equals("No")) {
            Txt4aDetail.setVisibility(View.GONE);
        } else {
            Txt4aDetail.setVisibility(View.VISIBLE);
        }
    }

    public void check4b(View v) {
        int radioId = RG4b.getCheckedRadioButtonId();
        RG4bSelected = findViewById(radioId);

        if (RG4bSelected.getText().toString().equals("No")) {
            Txt4bDetail.setVisibility(View.GONE);
        } else {
            Txt4bDetail.setVisibility(View.VISIBLE);
        }
    }

    public void check4c(View v) {
        int radioId = RG4c.getCheckedRadioButtonId();
        RG4cSelected = findViewById(radioId);

        if (RG4cSelected.getText().toString().equals("No")) {
            Txt4cDetail.setVisibility(View.GONE);
        } else {
            Txt4cDetail.setVisibility(View.VISIBLE);
        }
    }

}