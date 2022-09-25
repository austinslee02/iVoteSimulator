/*
Student class for unique ID and answer choice
 */
public class Student {
    private String uniqueID;
    private String answerChoice;

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String x) {
        uniqueID = x;
    }

    public String getAnswerChoice() {
        return answerChoice;
    }

    public void setAnswerChoice(String x) {
        answerChoice = x;
    }

    public Student(String UID, String AC) {
        uniqueID = UID;
        answerChoice = AC;
    }

    //Submits student's unique ID and answer to multiple choice class
    public void submitAnswer(MultipleChoice obj) {
        obj.insertAnswer(uniqueID, answerChoice);
    }

    //Submits student's unique ID and answer to single choice class
    public void submitAnswer(SingleChoice obj) {
        obj.insertAnswer(uniqueID, answerChoice);
    }
}