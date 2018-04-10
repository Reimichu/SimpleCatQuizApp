package com.example.android.meow;

import android.content.Context;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    /**
     * Variable to hold the amount of correct answers.
     */

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Question one. Checks if correct
     */

    public void questionOne(){
        RadioButton questionOne = findViewById(R.id.question_1_right);

        if (questionOne.isChecked()) {
            score++;
        }
    }

    /**
     * Question two. Checks if correct
     */

    public void questionTwo(){
        RadioButton questionTwo = findViewById(R.id.question_2_right);

        if (questionTwo.isChecked()) {
            score++;
        }
    }

    /**
     * Question three. Checks if correct
     */

    public void questionThree(){
        RadioButton questionThree = findViewById(R.id.question_3_right);

        if (questionThree.isChecked()) {
            score++;
        }
    }

    /**
     * Question four. Checks if correct
     */

    public void questionFour(){
        RadioButton questionFour = findViewById(R.id.question_4_right);

        if (questionFour.isChecked()) {
            score++;
        }
    }

    /**
     * Question five. Checks if correct
     */

    public void questionFive(){

        CheckBox chocolate = findViewById(R.id.chocolate);
        CheckBox grapes = findViewById(R.id.grapes);
        CheckBox raisins = findViewById(R.id.raisins);
        CheckBox onion = findViewById(R.id.onion);
        CheckBox garlic = findViewById(R.id.garlic);

        if (chocolate.isChecked() && grapes.isChecked() && raisins.isChecked() && onion.isChecked() && garlic.isChecked()) {
            score++;
        }
    }

    /**
     * Question six. Checks if correct
     */

    public void questionSix(){
        RadioButton questionSix = findViewById(R.id.question_6_right);

        if (questionSix.isChecked()) {
            score++;
        }
    }

    /**
     * This method displays the given text on the screen.
     */

    private void displayMessage(String message) {
        TextView scoreSummaryTextView = (TextView) findViewById(R.id.score_text_view);
        scoreSummaryTextView.setText(message);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void thankYou (String thanks) {
        TextView scoreSummaryTextView = (TextView) findViewById(R.id.thank_you);
        scoreSummaryTextView.setText(thanks);
    }

    /**
     * Scores answers.
     */

    public void scoreAnswers(){
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
    }

    /**
     * Method to display score, thank you text and toast message
     */
    public void submitScore(View view) {

        score = 0;
        scoreAnswers();


        EditText userName = findViewById(R.id.name_Input);
        String name = userName.getText().toString();

        String resultsMessage = "" + score + "/6";
        displayMessage(resultsMessage);

        String thankyou = name + ", thanks for playing!";
        thankYou(thankyou);

        String toastMessage = "You got " + score + " out of 6 answers correct";
        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();

    }

}
