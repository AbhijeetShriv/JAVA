class Minecraf{
    private void Villager(){
        System.out.println("Hmm........!!!\nMending You Will Never Get Hm hm hm hm hm................ !!!");
    }
    void Trading(){
        Villager();
    }
}

class Player{

    private class Emeralds{
        
        void IronGolem(){
            System.out.println("Im Iron Golem Only Spawns When Villagers Got Scared.!!!");
        }
    }

    void Blacksmith(){
        Emeralds e = new Emeralds();

        e.IronGolem();
    }
}
public class Main7{
    public static void main(String[] args) {
        Minecraf m = new Minecraf();
        Player p = new Player();

        m.Trading(); //I was Calling Villager for Trading Guess What, That Villager Said ? 
        p.Blacksmith(); //BlackSmith Knows Iron Golem.
    }
}