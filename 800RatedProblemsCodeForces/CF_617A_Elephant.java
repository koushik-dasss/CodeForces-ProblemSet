import java.util.Scanner;

public class CF_617A_Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cf = sc.nextInt() , steps = 0;
        if (cf%5 == 0){
            steps = cf/5;
        }else{
            steps = (cf+5)/5; // adding 5 to the co-ordinate point  then dividing by 5 , gets the number of minimal steps
        }
        System.out.println(steps);
        
        sc.close();
    }
}




















