import java.util.Scanner;
public class CF_677A_Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = 0;
        for(int i = 1 ; i<= n ; i++){
            int H = sc.nextInt();
            if(H>h){
                width+=2;
            }else{
                width+=1;
            }
        }
        System.out.println(width);
        sc.close();
    }
    
}
