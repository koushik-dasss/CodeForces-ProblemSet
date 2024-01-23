import java.util.Scanner;
public class CF_231A_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , sum = 0 , ctr = 0;
        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
            sum = p+v+t;
            if (sum>=2){
                ctr+=1;
            }
        }
        System.out.println(ctr);
        sc.close();
    }
}




















