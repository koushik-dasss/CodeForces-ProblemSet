import java.util.Scanner;
public class CF_791A_Bear_and_big_brother{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int years = 0;
        while (a<=b){
            a*=3;
            b*=2;
            years+=1;
        }
        System.out.println(years);
        sc.close();
    }
}