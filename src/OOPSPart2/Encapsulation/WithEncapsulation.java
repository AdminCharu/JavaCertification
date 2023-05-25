package OOPSPart2.Encapsulation;

public class WithEncapsulation {
    public static void main(String[] args) {
        EnhancedPlayer_WithEncaps player=new EnhancedPlayer_WithEncaps("Tim");
        EnhancedPlayer_WithEncaps playerTwo=new EnhancedPlayer_WithEncaps("Tim",300,"Gun");
        playerTwo.loseHealth(10);
        System.out.println("Initial health is : " + playerTwo.healthRemaining());

      /*  this is encapsulation.
        This is what we're doing, by making our fields private, we're making sure that the
        fields within the class aren't accessible to any classes that are outside.*/
    }
}
