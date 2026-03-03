public class Main5{
    public static void main(String[] args) {
        Minecraft minecraft = new Mobile();
        Minecraft minecraft1 = new Tablet();

        minecraft.play();
        minecraft1.play();
        
    }
}


abstract class Minecraft{
    abstract void play(); //RULES Made By Parent (Minecraft).Using Abstract we create rules with the Method name and no need to add logic in Parent class, they made rules to follow only and childs has to follow it else they will kick out an error in the terminal.
}

class Mobile extends Minecraft{
    @Override
    void play(){           //RULES FOLLOWED By Child (Mobile).When the Parent Class Creates a method with abstract keyword, it counts as Rule that each child has to follow (I was only talking about the inherited Parent class ).

        System.out.println("I will Play Minecraft in Mobile");
    }

}
class Tablet extends Minecraft{
    @Override
    void play(){            //RULES FOLLOWED By Child (Tablet).As you Can we have created one more child class that was inheriting Minecraft Class (Parent Class) Basically Abstract Allows class of child to work as parent made the rules.
        System.out.println("I will Play Minecraft in Tablet");
    }
}