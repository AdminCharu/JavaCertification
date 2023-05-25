package OOPSPart2.Encapsulation;

public class EnhancedPlayer_WithEncaps {
    private String name;  //Private modifier used.
    private int health;
    private String weapon;

    public EnhancedPlayer_WithEncaps(String name, int health, String weapon) {
        this.name = name;
        if (health <= 100) {
            this.health = 1;
            System.out.println("Player knocked out of Game");
        } else if (health > 100) {
            this.health = 100;
            System.out.println("Player is fit");
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public EnhancedPlayer_WithEncaps(String name) {
        this(name, 100, "Sword");
    }

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
