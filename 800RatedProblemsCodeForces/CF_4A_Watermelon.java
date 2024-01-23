import java.util.Scanner;
public class CF_4A_Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if (w%2 == 0 && w>2 ){  // w>2 or w!=2 
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();

        /*  Using Ternary Operator (Conditional):-
        String result = (w%2==0 && w!=2)? "YES" : "NO"; 
        System.out.println(result);

        */

    }
}
    