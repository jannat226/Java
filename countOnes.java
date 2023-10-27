import java.util.Scanner;

public class countOnes {
    public static void main(String[] args) {
        System.out.println("Enter the  initial number from which you want to count the number");
        Scanner n1 = new Scanner(System.in);
        int a = n1.nextInt();
        System.out.println("Enter the  end number from which you want to count the number");
        Scanner n2 = new Scanner(System.in);
        int b = n2.nextInt();
        n1.close();
        n2.close();
        int count = 0;
        int temp = 0;

        for (int i = a; i <= b; i++) {
            System.out.println(i);
            // while (i != 0) {
            // temp = i % 10;
            // if (temp == 1) {
            // count++;
            // }
            // temp = i / 10;
            // }
        }
        System.out.println(count);
    }
}
