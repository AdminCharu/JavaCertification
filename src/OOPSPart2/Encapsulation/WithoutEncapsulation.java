package OOPSPart2.Encapsulation;

public class WithoutEncapsulation {
    public static void main(String[] args) {
        Player_WithoutEncaps player = new Player_WithoutEncaps();

        player.name = "Tim";

        player.health = 20;

        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health : " + player.healthRemaining());

        player.health = 200;
        /* Now, here, the main method has kind of gone wrong, because it's setting the player's health manually,
       outside of the normal game play method calls.This code actually takes control away from the  Player class,
        for managing the Player's health. It didn't call the restoreHealth method, which has the additional control
         in place,  that player health can never exceed 100.This is an example of the first problem, with  a class that's
          not encapsulated properly.

         -> Allowing direct access to data on an object, can potentially bypass checks,and additional processing, your
          class has in place to manage the data.By being able to access fields directly like this, we're really potentially opening up our application,
           to be accessed in ways that it shouldn't be.Maybe we don't ever want the code to be able to  change the health like that, because we really
            wanted the restoreHealth method to be called,  and the right set of conditions to be set. But because these fields are public to everyone,
            we can't control when they get accessed. */

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
