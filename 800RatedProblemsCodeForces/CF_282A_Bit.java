import java.util.Scanner;
public class CF_282A_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x  = 0 , n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            String st = sc.next();
            if (st.equals("X++")|| st.equals("++X")){
                x+=1;
            }else if (st.equals("X--")|| st.equals("--X")){
                x-=1;

            }



        }
        System.out.println(x);


        sc.close();
    }
}













