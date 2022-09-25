/*
Voting service class to count up answer choices and display results
 */
public class VotingService {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;

    public VotingService(){
        A = 0;
        B = 0;
        C = 0;
        D = 0;
        E = 0;
    }

    public VotingService(int a, int b, int c, int d, int e) {
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
    }

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
    public void setA(int x) { A = x; }

    public void setB(int b) { B = b; }

    public void setC(int c) {
        C = c;
    }

    public void setD(int d) {
        D = d;
    }

    public void setE(int e) {
        E = e;
    }

    //Display the results of all the student answer choices
    public void displayResults() {
        System.out.println("A : " + A + ", B : " + B + ", C : " + C + ", D : " + D + ", E : " + E);
    }
}
