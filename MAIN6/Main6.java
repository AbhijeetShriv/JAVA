class Exercise{
    void medicine(){
        System.out.println("Medicine Time : Exercise.");
    }
}
class Sleep extends Exercise{
    void medicine(){
        System.out.println("Medicine Time : Sleep.");
    }
}
public class Main6{
    public static void main(String[] args) {
        Exercise p ;

        p = new Sleep();
        p.medicine();

        p = new Exercise();
        p.medicine();
    }
}