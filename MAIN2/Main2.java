import java.util.Scanner;


public class Main2{
    public static void main(String[] args) {
        Damn d = new Damn();
        Scanner s = new Scanner(System.in);

        System.out.print("Pizza Name :");
        String name=s.nextLine();

        System.out.print("Pizza Price:");
        int pri=s.nextInt();

        d.smargreta(pri, name);
        d.gmargreta();
    }
}


class Damn{
    
    private String pizza;  // I didn't Ordered Pizza Im Using it only as Example Dont Judge Me  !! 
    private int price;     // Dont Judge Me !!  

    public void smargreta(int amount,String pizza){
        this.pizza = pizza;
        this.price = amount;

    }


    public void gmargreta(){
        System.out.println("PIZZA ORDERED : " + pizza);
        System.out.println("TOTAL PRICE : \t" + price);
        
        
    }



    

}