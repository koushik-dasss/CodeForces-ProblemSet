import java.util.Scanner;
public class CF_427_A_Police_Recruits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Available_Officers = 0;
        int Untreated_Crimes = 0;
        for(int i = 1 ; i<=n ; i++){
            int event = sc.nextInt();
            if (event == -1){
                if (Available_Officers>0){
                    Available_Officers-=1;
                }else{
                    Untreated_Crimes+=1;
                }
            }else{
                Available_Officers+=event;
            }
        }
        System.out.println(Untreated_Crimes);

        sc.close();
    }
}