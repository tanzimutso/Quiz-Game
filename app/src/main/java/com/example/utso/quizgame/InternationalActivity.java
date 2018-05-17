package com.example.utso.quizgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class InternationalActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score, question;

    private Questions myQuestions = new Questions();

    private String myAnswer;
    private int myScore = 0;
    private int myQuestionsLength = myQuestions.internationalQuestions.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Your Score: "+ myScore);

        updateQuestion(r.nextInt(myQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           if (answer1.getText() == myAnswer) {
                                               myScore++;
                                               score.setText("Your Score: "+ myScore);
                                               updateQuestion(r.nextInt(myQuestionsLength));
                                           }
                                           else{
                                               gameOver();
                                           }
                                       }
                                   }

        );

        answer2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           if (answer2.getText() == myAnswer) {
                                               myScore++;
                                               score.setText("Your Score: "+ myScore);
                                               updateQuestion(r.nextInt(myQuestionsLength));
                                           }
                                           else{
                                               gameOver();
                                           }
                                       }
                                   }

        );

        answer3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           if (answer3.getText() == myAnswer) {
                                               myScore++;
                                               score.setText("Your Score: "+ myScore);
                                               updateQuestion(r.nextInt(myQuestionsLength));
                                           }
                                           else{
                                               gameOver();
                                           }
                                       }
                                   }

        );

        answer4.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           if (answer4.getText() == myAnswer) {
                                               myScore++;
                                               score.setText("Your Score: "+ myScore);
                                               updateQuestion(r.nextInt(myQuestionsLength));
                                           }
                                           else{
                                               gameOver();
                                           }
                                       }
                                   }

        );

    }

    private void updateQuestion(int num){
        question.setText(myQuestions.getInternationalQuestion(num));
        answer1.setText(myQuestions.getInternationalChoice(num));
        answer2.setText(myQuestions.getInternationalChoice2(num));
        answer3.setText(myQuestions.getInternationalChoice3(num));
        answer4.setText(myQuestions.getInternationalChoice4(num));

        myAnswer = myQuestions.getInternationalCorrectAnswer(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(InternationalActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your Score is " + myScore +" points")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),InternationalActivity.class));
                            }
                        }
                )
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        }
                );
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
     }

    }
