import java.util.Scanner;
public class CF_50A_Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(m*n/2);
        // division in JAVA = int division
        //  precedence & associativity of * and / are same , no need of (m*n)
        sc.close();
    }
}
