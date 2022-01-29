package Studios.FunWithQuizzes;

// a question with a fixed set of possible answers; only one may be chosen and only one is correct

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(int pointValue, String text, int correctAnswer, ArrayList<String> possibleAnswers) {
        super(pointValue, text);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
        setPointValue(1);
    }

    @Override
    public void displayAnswers () {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
    }

    @Override
    public int checkAnswers(ArrayList<Integer> check) {
        return 0;
    }

    public boolean isCorrectAnswer (int possibleAnswerIndex) {
        if (possibleAnswerIndex == correctAnswer) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter the number of the answer you want to select. (ie: to select the first option, enter 1)");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)) {
            return 1;
        }
        else {
            return 0;
        }
    }

}