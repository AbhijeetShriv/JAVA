import java.util.Scanner;

class Faculty{
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


class College extends Faculty{

    void College() {

        System.out.println("UID :"+ this.fid);
        System.out.println("NAME : " + this.fname);
        System.out.println("HAPPY WITH SALARY :" + this.salary);
        System.out.println("I Know You are Happy With Your Salary (I know you are not !! )");
    }
    
    
}

public class Main3{
    public static void main(String[] args) {
        College f = new College();
        f.teacher();
        f.College();
       
        
    }
}