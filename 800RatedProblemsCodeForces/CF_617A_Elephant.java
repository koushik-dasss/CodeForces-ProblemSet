import java.util.Scanner;

public class CF_617A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cf = sc.nextInt(), ctr = 0;

        if (cf % 5 == 0) {
            ctr += (cf / 5);
        } else {
            ctr += ((int) (cf / 5) + (int) ((cf + 5) / 5) - (int) (cf / 5));
        }

        System.out.println(ctr);

        sc.close();
    }
}
