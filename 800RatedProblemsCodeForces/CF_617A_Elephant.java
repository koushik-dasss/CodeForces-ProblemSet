import java.util.Scanner;
public class CF_617A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt() ;
        int steps = 0;
        if (x%5==0){
            steps = x/5;
        }else{
            steps = (x+5)/5; // precedence of / > + 
        }
        System.out.println(steps);
        sc.close();
    }
}




















