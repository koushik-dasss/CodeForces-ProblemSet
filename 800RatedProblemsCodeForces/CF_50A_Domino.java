import java.util.Scanner;
public class CF_50A_Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() , n = sc.nextInt();
        System.out.println((m*n)/2); // No need of int typecasting , as the division will give the result in int data type only



        sc.close();
    }
}
