/*
Question abstract class for multiple choice and single choice classes to extend
 */
abstract class Question {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;


    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public int getD() {
        return D;
    }

    public int getE() {
        return E;
    }
    public void setA(int x) {
        A = x;
    }

    public void setB(int b) {
        B = b;
    }

    public void setC(int c) {
        C = c;
    }

    public void setD(int d) {
        D = d;
    }

    public void setE(int e) {
        E = e;
    }

    //Optional answer choice display
    public void displayAnswers() {
        System.out.println("A B C D E");
    }
}
