import java.util.HashMap;
/*
Class for multiple choice questions
 */
public class MultipleChoice extends Question{

    HashMap<String, String> userAnswers = new HashMap<String, String>();

    //Adds student and answer to hashmap to account for multiple student submissions
    public void insertAnswer(String UID, String ans) {
        userAnswers.put(UID, ans);
    }

    //After all the students are added to the hashmap, sends data to the voting service class
        public void uploadAnswer(VotingService obj) {
        for (String s : userAnswers.values()) {
            for (char c : s.toCharArray()) {
                if (c == 'A') {
                    obj.setA(obj.getA() + 1);
                }
                if (c == 'B') {
                    obj.setB(obj.getB() + 1);
                }
                if (c == 'C') {
                    obj.setC(obj.getC() + 1);
                }
                if (c == 'D') {
                    obj.setD(obj.getD() + 1);
                }
                if (c == 'E') {
                    obj.setE(obj.getE() + 1);
                }
            }
        }
    }
}
