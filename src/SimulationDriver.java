import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/*
Class to test functionality of entire program
 */
public class SimulationDriver {
    //Tests for multiple-choice questions
    public static void multipleChoiceTest() {
        Random rand = new Random();
        String uniqueID;
        String answers;
        MultipleChoice mC = new MultipleChoice();
        VotingService vS = new VotingService();
        int y = rand.nextInt(40);
        for (int i = 0; i < y; i++) {
            uniqueID = Integer.toString(rand.nextInt(89999)+10000);
            answers = generateAnswerChoices();
            System.out.println(uniqueID + " " + answers);
            Student adam = new Student(uniqueID, answers);
            adam.submitAnswer(mC);
        }
        mC.uploadAnswer(vS);
        vS.displayResults();
    }

    //Tests for single-choice questions
    public static void singleChoiceTest() {
        Random rand = new Random();
        String uniqueID;
        String answers;
        SingleChoice sC = new SingleChoice();
        VotingService vS = new VotingService();
        int y = rand.nextInt(40);
        for (int i = 0; i < y; i++) {
            uniqueID = Integer.toString(rand.nextInt(89999)+10000);
            answers = generateAnswerChoices();
            System.out.println(uniqueID + " " + answers);
            Student adam = new Student(uniqueID, answers);
            adam.submitAnswer(sC);
        }
        sC.uploadAnswer(vS);
        vS.displayResults();
    }

    //Generates random student submissions for answers (does not allow multiple of the same answer ex. AABBC --> ABC)
    private static String generateAnswerChoices() {
        Random rand = new Random();
        int y = rand.nextInt(4)+1;
        Set<String> choices = new HashSet<String>();
        for (int i = 0; i < y; i++)  {
            choices.add("" + (char)(rand.nextInt(5)+65));
        }
        return choices.toString();
    }

    //Tests if a single student submits answers more than one time
    private static void testStudentMultipleSubmissions() {
        Student adam = new Student("12376", "ABC");
        SingleChoice sC = new SingleChoice();
        VotingService vS = new VotingService();
        adam.submitAnswer(sC);
        adam.setAnswerChoice("BCDE");
        adam.submitAnswer(sC);
        sC.uploadAnswer(vS);
        vS.displayResults();
    }

    public static void main(String[] args) {
        multipleChoiceTest();
        singleChoiceTest();
        testStudentMultipleSubmissions();
    }
}