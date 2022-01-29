package Studios.FunWithQuizzes;

import java.util.ArrayList;

public abstract class Question {

    private int pointValue;
    private String text;

    public Question(int points, String text){
        this.pointValue = points;
        this.text = text;
    }

    public void displayQuestion(){
        System.out.println(text);
    }

    public void setPointValue(int x){
        this.pointValue = x;
    }

    public int getPointValue(){
        return this.pointValue;
    }

    public abstract void displayAnswers();

    public abstract int checkAnswers(ArrayList<Integer> check);

    public abstract int getAnswers();
}
