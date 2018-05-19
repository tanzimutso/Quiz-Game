package com.example.utso.quizgame;

public class Questions {

    public String myQuestions[] = {
            "What is the capital of Bangladesh?",
            "Which of these is the currency of Bangladesh?",
            "What is the national flower of Bangladesh?",
            "What is the national fruit of Bangladesh?",
            "What is the national animal of Bangladesh?",
            "What is the national game of Bangladesh?",
            "What is the national tree of Bangladesh?",
            "Which of these is used to make pudding?",
            "What is the date of the national independence day of Bangladesh?",
            "What is the name of the rocket that brings Bangabandhu-1 satellite in space?",
            "Bangladesh was divided into __ sectors during the independence war of 1971?",
            "Which one is the biggest river of Bangladesh?",
            "What is the name of the national fish of Bangladesh?",
            "What is the name of the national bird of Bangladesh?"
    };

    public String internationalQuestions[] = {
            "What is the national animal of India?",
            "Which of these is the most powerful country of the world?",
            "Which country the most populated country in the world?",
            "Which of these country has the most education rate?",
            "Which country is the largest country in South America?",
            "Which country is the smallest country of the world?",
            "The number of ocean in the world is?",
            "Hitlar was the leader of?",
            "I-Phone is the product of which company?",
            "Statue of Liberty was given to USA by which country?",
            "How many continents are there in the world?",
            "Which of these country is located in both asia and europe continent?",
            "What is name of the largest country of the world?",
            "What is the national game of USA?",
            "What is the name of the highest mountain of the world?"
    };
    public String sportsQuestions[] = {
            "Which club have won the UEFA CHAMPIONS LEAGUE 2016?",
            "Which batsman has the record of most centuries in cricket?",
            "Pele played for?",
            "Who is the top scorer of FIFA world cup?",
            "Which team has won the 1996 ICC cricket world cup?",
            "Which country has won the most number of FIFA world cup?",
            "Cristiano Ronaldo is the player of which country?",
            "Who is the captain of Bangladesh national cricket team?",
            "Which team has won the most number of ICC cricket world cup?",
            "Which bowler has the record of taking most wickets in the history of cricket?",
            "Which batsman has scored 400 runs in one innings in the hostory of test cricket?",
            "AB DE Villers is the player of which team?",
            "Who bowled the fastest ball in the history of cricket?",
            "How many times Brazil has won the FIFA world cup?"
    };

    private String myChoice [][] = {
            {"New Delhi", "Islamabad", "Dhaka", "Colombo"},
            {"Dollar","Pound","Taka","Rupi"},
            {"Rose","Lilly","Lotus","Belly"},
            {"Mango","JackFruit","Guava","Apple"},
            {"Cow","Horse","Tiger","Lion"},
            {"Cricket","Football","Ha-do-do","Basketball"},
            {"Coconut Tree","Mango Tree","JackFruit Tree","Palm Tree"},
            {"Egg","Flour","Oil","Vinegar"},
            {"26th December","26th March","16th December","16th March"},
            {"Apollo-11","Falcon-8","Falcon-9","Xoom-3"},
            {"9","10","11","12"},
            {"Jamuna","Meghna","Shurma","Padma"},
            {"Ruhi","Katla","Hilsha","CatFish"},
            {"Cuckoo","Crow","Magpie","PeaCock"}

    };

    private String internationalChoice [][] = {
            {"Cat","Lion","Fox","Tiger"},
            {"USA","France","China","Germany"},
            {"India","Bangladesh","China","Vietnam"},
            {"India","Bangladesh","Pakistan","SriLanka"},
            {"Argentina","Chili","Brazil","Peru"},
            {"Uganda","Maldivs","Vatican City","Panama"},
            {"4","5","6","7"},
            {"India","USA","Germany","France"},
            {"Samsung","Apple","Sony","Motorola"},
            {"Germany","Italy","Spain","France"},
            {"5","6","7","8"},
            {"Mongolia","Portugal","Albenia","Turkey"},
            {"China","Canada","Russia","Brazil"},
            {"Golf","Baseball","Basketball","Boxing"},
            {"Rocky","Everest","Andiz","Kilimanzaro"}
    };

    private String sportsChoice[][] = {
            {"Barcelona","Manchester United","Real Madrid","Chelsea"},
            {"Brian Lara","Sachin Tendulker","Virat Kohli","Ricky Ponting"},
            {"Argentina","Brazil","France","Germany"},
            {"Maradona","Ronaldo","Messi","Klose"},
            {"India","Australia","Pakistan","SriLanka"},
            {"Brazil","Argentina","Germany","Italy"},
            {"Brazil","Argentina","Spain","Portugal"},
            {"Shakib AL Hasan","Mushfiqur Rahim","Mahmudullah","Mashrafee"},
            {"India","Australia","Pakistan","England"},
            {"Shane Warne","Muralidharan","Wasim Akram","Glenn Megrath"},
            {"Sachin Tendulkar","Sayeed Anwar","Brian Lara","Viv Richards"},
            {"Australia","New Zealand","South Africa","England"},
            {"Shaun Tait","Lasith Malinga","Showeb Akhtar","Fidel Edwards"},
            {"3","4","5","6"}
    };

    private String myCorrectAnswers[] = {
            "Dhaka", "Taka", "Lilly", "JackFruit", "Tiger", "Ha-do-do", "Mango Tree", "Egg", "26th March","Falcon-9",
            "11","Padma","Hilsha","Magpie"
    };

    private String correctAnsForInternational[] = {"Fox","USA","China","SriLanka","Brazil","Vatican City","5","Germany",
            "Apple","France","7","Turkey","Russia","Baseball","Everest"
    };

    private String correctAnsForSports[] = {"Real Madrid","Sachin Tendulker","Brazil","Klose","Pakistan","Brazil","Portugal",
            "Mashrafee","Australia","Muralidharan","Brian Lara","South Africa","Showeb Akhtar","5"
    };

    public String getQuestion(int a){
        String question = myQuestions[a];
        return question;
    }

    public String getInternationalQuestion(int a){
        String question = internationalQuestions[a];
        return question;
    }

    public String getSportsQuestion(int a){
        String question = sportsQuestions[a];
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

    public String getInternationalChoice(int a){
        String choice1 = internationalChoice[a][0];
        return  choice1;
    }

    public String getInternationalChoice2(int a){
        String choice2 = internationalChoice[a][1];
        return  choice2;
    }

    public String getInternationalChoice3(int a){
        String choice3 = internationalChoice[a][2];
        return  choice3;
    }

    public String getInternationalChoice4(int a){
        String choice4 = internationalChoice[a][3];
        return  choice4;
    }


    public String getSportsChoice1(int a){
        String choice1 = sportsChoice[a][0];
        return  choice1;
    }

    public String getSportsChoice2(int a){
        String choice2 = sportsChoice[a][1];
        return  choice2;
    }

    public String getSportsChoice3(int a){
        String choice3 = sportsChoice[a][2];
        return  choice3;
    }

    public String getSportsChoice4(int a){
        String choice4 = sportsChoice[a][3];
        return  choice4;
    }


    public String getCorrectAnswer(int a){
        String answer = myCorrectAnswers[a];
        return answer;
    }

    public String getInternationalCorrectAnswer(int a){
        String answer = correctAnsForInternational[a];
        return answer;
    }

    public String getSportsCorrectAnswer(int a){
        String answer = correctAnsForSports[a];
        return answer;
    }

}
