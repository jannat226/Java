package practiceQues;

public class Ques3 {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        Ques3 q1 = new Ques3();

        int c = q1.add(4, 5);
        double d = q1.add(4, 5);
        System.out.println(c);
        System.out.println(d);
    }

}
