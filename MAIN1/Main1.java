import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        User r = new User();
        Con k = new Con();
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Your UID : ");
        r.uid=inp.nextInt();
        inp.nextLine();
        System.out.print("Enter Your Name : ");
        r.name=inp.nextLine();
        System.out.print("Do You Want to Make Calculations (Y/N): ");
        k.ques=inp.nextBoolean();
        k.damn();
        System.out.println("UID : " + r.uid);
        System.out.println("Name : " + r.name);
    }
}
class Con{
    boolean ques;
    
    void damn(){
        if(ques){
            System.out.println("Here We Go ! ");
        }
        else{
            System.out.println("We Need To Talk Bro !");

        }
        System.out.println("Hey There, I'm OutSide of The Method and Final OutPut !!");
    }

   

}
class User{
    int uid;
    String name;

}