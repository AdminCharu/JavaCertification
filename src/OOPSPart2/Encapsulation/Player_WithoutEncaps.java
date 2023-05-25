package OOPSPart2.Encapsulation;

public class Player_WithoutEncaps {
    //Using public here
    public String name;    //If we change name of variable here it will affect main class as well since the modifier is public here.

    public int health;

    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of Game");
        }
    }

    public int healthRemaining() {

        return health;

    }

    public void restoreHealth(int extraHealth) {

        health = health + extraHealth;
        if (health > 100) {
            health = 100;
            System.out.println("Player restored to 100%");
        }
    }
}
