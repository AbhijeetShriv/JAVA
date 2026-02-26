
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the Starting Value : ");
        int v1 = inp.nextInt();

        System.out.print("Enter the Ending Value :");
        int v2 = inp.nextInt();

        while(v1 <= v2){
            if(v1 % 2 == 0 ){
                System.out.println("Even Values :" +v1);

            }
            
                v1++;
        }
    }
}