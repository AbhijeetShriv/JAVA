class Minecrat {
    int villagers;
    String mob;
    int irongolem;

    Minecrat(int villagers,String mob,int irongolem) {
        this.villagers=villagers;
        this.mob=mob;
        this.irongolem=irongolem;
    }
   
    
}
public class Main8{
    public static void main(String args[]){
       
        
        Minecrat m = new Minecrat(23,"Skeleton",2);
        Minecrat m1 = new Minecrat(90,"Piglins",0);



        System.out.println("GREEN WORLD !!\n===============");
        System.out.println("TOTAL VILLAGERS ALIVE : " + m.villagers);
        System.out.println("MOB NEARBY VILLAGERS : " + m.mob);
        System.out.println("ALIVE IRON GOLEMS : " + m.irongolem);
        System.out.println("GOING TO NETHER WORLD FOR TRADING & BLAZE ROD !!\n===============\n\n");
        System.out.println("NETHER WORLD !!\n===============");
        System.out.println("MOB IN NETHER WORLD :" + m1.mob);
        System.out.println(m1.mob +" NEARBY PLAYER : " + m1.villagers);
        System.out.println("IRON GOLEMS IN NETHER WORLD : " + m1.irongolem + "\n===============");

        

       

    }
}