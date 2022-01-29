package Studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<>());
        ArrayList<String> possibleAnswer1 = new ArrayList<>(Arrays.asList("Apple", "Google", "Samsung", "OnePlus"));
        ArrayList<Integer> correctAnswer1 = new ArrayList<>(Arrays.asList(1,3));
        Checkbox newQuestion1 = new Checkbox(2, "Who makes the best smartphones?", possibleAnswer1, correctAnswer1);
        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possibleAnswer2 = new ArrayList<>(Arrays.asList("Firefox", "Chrome", "Brave", "Safari"));
        MultipleChoice newQuestion2 = new MultipleChoice(1, "Which is the best browser?", 1, possibleAnswer2);
        myQuiz.addQuestion(newQuestion2);
        var newQuestion3 = new TrueOrFalse(1, "J Cole is better than Kendrick", true);
        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();

        myQuiz.gradeQuiz();

    }
}
