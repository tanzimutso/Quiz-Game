package com.example.utso.quizgame;

public class Questions {

    public String myQuestions[] = {
            "What is the capital of Bangladesh?",
            "Which of these is the currency of Bangladesh?",
            "What is the national flower of Bangladesh?",
            "What is the national fruit of Bangladesh?",
            "What is the national animal of Bangladesh?",
            "What is the national game of Bangladesh?",
            "What is the national tree of Bangladesh?"
    };

    private String myChoice [][] = {
            {"New Delhi", "Islamabad", "Dhaka", "Colombo"},
            {"Dollar","Pound","Taka","Rupi"},
            {"Rose","Lilly","Lotus","Belly"},
            {"Mango","JackFruit","Guava","Apple"},
            {"Cow","Horse","Tiger","Lion"},
            {"Cricket","Football","Ha-do-do","Basketball"},
            {"Coconut Tree","Mango Tree","JackFruit Tree","Palm Tree"}

    };

    private String myCorrectAnswers[] = {
            "Dhaka", "Taka", "Lilly", "JackFruit", "Tiger", "Ha-do-do", "Mango Tree"
    };

    public String getQuestion(int a){
        String question = myQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice1 = myChoice[a][0];
        return  choice1;
    }

    public String getChoice2(int a){
        String choice2 = myChoice[a][1];
        return  choice2;
    }

    public String getChoice3(int a){
        String choice3 = myChoice[a][2];
        return  choice3;
    }

    public String getChoice4(int a){
        String choice4 = myChoice[a][3];
        return  choice4;
    }

    public String getCorrectAnswer(int a){
        String answer = myCorrectAnswers[a];
        return answer;
    }


}
