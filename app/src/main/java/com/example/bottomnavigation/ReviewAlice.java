package com.example.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReviewAlice extends AppCompatActivity {

    private EditText courseNameEdt, courseTracksEdt, courseDescriptionEdt, courseDurationEdt ;
    private Button addCourseBtn, readCourseBtn;
    private DBHandler dbHandler;
    RatingBar ratingBar;
    float myRating=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_alice);

        ratingBar = findViewById(R.id.ratealice);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                int rating = (int) v;
                String message = null;

                myRating = ratingBar.getRating();

                switch (rating) {
                    case 1:
                        message = "Sangat Buruk";
                        break;
                    case 2:
                        message = "Buruk";
                        break;
                    case 3:
                        message = "Cukup Bagus";
                        break;
                    case 4:
                        message = "Bagus";
                        break;
                    case 5:
                        message = "Memuaskan";
                        break;
                }
                Toast.makeText(ReviewAlice.this, message, Toast.LENGTH_SHORT).show();
            }
        });
        courseNameEdt = findViewById(R.id.idEdtCourseName);
        courseTracksEdt = findViewById(R.id.idEdtCourseTracks);
        courseDurationEdt = findViewById(R.id.idEdtCourseDuration);
        courseDescriptionEdt =
                findViewById(R.id.idEdtCourseDescription);
        addCourseBtn = findViewById(R.id.idBtnAddCourse);
        readCourseBtn = findViewById(R.id.idBtnReadCourse);
        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(ReviewAlice.this);
        // below line is to add on click listener for our add course button.
        addCourseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // below line is to get data from all edit text fields.
                String courseName =
                        courseNameEdt.getText().toString();
                String courseTracks =
                        courseTracksEdt.getText().toString();
                String courseDuration =
                        courseDurationEdt.getText().toString();
                String courseDescription =
                        courseDescriptionEdt.getText().toString();
                // validating if the text fields are empty or not.
                if (courseName.isEmpty() && courseTracks.isEmpty() &&
                        courseDuration.isEmpty() && courseDescription.isEmpty()) {
                    Toast.makeText(ReviewAlice.this, "Data Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                    return;
                }
                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewCourse(courseName, courseDuration, courseDescription, courseTracks);
                // after adding the data we are displaying a toast message.
                Toast.makeText(ReviewAlice.this, "Review Telah Ditambahkan", Toast.LENGTH_SHORT).show();
                courseNameEdt.setText("");
                courseDurationEdt.setText("");
                courseTracksEdt.setText("");
                courseDescriptionEdt.setText("");
            }
        });

        readCourseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a new activity via a intent.
                Intent i = new Intent(ReviewAlice.this, ViewCourses.class);
                startActivity(i);
            }
        });
    }
}