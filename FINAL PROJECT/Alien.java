public class Alien{
    protected int damagePoints;

    // 1 arg constructor
    public Alien(int damagePoints)
    {
        this.damagePoints = damagePoints;
    }

    // get/set methods for damagePoints
    public int getDamagePoints(){
        return this.damagePoints;
    }
    public void setDamagePoints (int damagePoints){
        this.damagePoints = damagePoints;
    }

    // toString method
    public String toString(){
        return "This Alien does " + this.damagePoints + " damage points.";
    }
}

public class RattlesnakeAlien extends Alien{
    private String sound;

    // 2 arg constructor
    public RattlesnakeAlien (int damagePoints, String sound){
        super (damagePoints);
        this.sound = sound;
    }

    // get/set methods for sound
    public String getSound(){
        return this.sound;
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    // toString method
    public String toString(){
        return "This Alien does " + this.damagePoints + " damage points. It goes " + this.sound;
    }
}

public class Main{
    public static void main(String[] args){
        // array of 3 aliens
Alien[] aliens = new Alien[3];

// 2 alien objects
aliens[0] = new Alien(3);
aliens[1] = new Alien(5);
// rattlesnakeAlien object
aliens[2] = new RattlesnakeAlien(10, "HISS!");
// alien object with no damage points
aliens[3] = new Alien(0);


// looping through the array and printing each object
for (Alien a : aliens){
    System.out.println(a);}
    }
}

// empty exception class
public class NoDamage extends Exception{
    public NoDamage(){
        super();
    }


// default constructor to Alien class
public Alien() throws NoDamage{
    throw new NoDamage();
}
}