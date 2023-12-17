import java.util.Scanner ;
public class CF_977A_Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i<=k ; i++)
            if ((num%10) != 0){
                num-=1;

            }else{
                num/=10;
            }
        System.out.println(num);

       sc.close();
    }
}







