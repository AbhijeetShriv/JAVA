import java.util.Scanner;

class Facult{
    int fid;
    String fname;
    boolean salary;

    Scanner sc = new Scanner(System.in);
    void teacher(){
        System.out.print("Kindly Enter Your Faculty ID : ");
        this.fid=sc.nextInt();
        sc.nextLine();
        System.out.print("You Have To Also Enter Your Name : ");
        this.fname=sc.nextLine();

        System.out.print("Received Salary ? ( Be Honest !!) : ");
        this.salary=sc.nextBoolean();

    }

}
interface Student{
    int students = 40;
}

interface Hacker{
    default void d(){
        Scanner hac = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int haci = hac.nextInt();

        System.out.println("You Have Entered : " + haci + "\nIgnore My Number ( Dont Call Me ) !!");
    }

}

class Colleg extends Facult implements Student,Hacker{

    void College() {

        System.out.println("UID :"+ this.fid);
        System.out.println("NAME : " + this.fname);
        System.out.println("HAPPY WITH SALARY :" + this.salary);
        System.out.println("I Know You are Happy With Your Salary (I know you are not !! )");
    }
    
    void stud(){
        System.out.println("Total Students in the Canteen : "  + students);
    }
    
}

public class Main4{
    public static void main(String[] args) {
        Colleg f = new Colleg();
        f.teacher();
        f.d();
        f.College();
        f.stud();
        
    }
}