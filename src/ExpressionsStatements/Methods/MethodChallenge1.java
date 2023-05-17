package ExpressionsStatements.Methods;

public class MethodChallenge1 {
    public static void main(String[] args) {
        int position = highScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = highScorePosition(1000);
        displayHighScorePosition("Bob", position);

        position = highScorePosition(500);
        displayHighScorePosition("Kelvin", position);

        position = highScorePosition(100);
        displayHighScorePosition("John", position);

        position = highScorePosition(25);
        displayHighScorePosition("Gilbert", position);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list. ");

    }

  /*  public static int highScorePosition(int playerScore) {
        if (playerScore >= 1000) {                         //Don't use ladder if here
            return  1;
        }
        if (playerScore >= 500 && playerScore < 1000) {  //Conditional operator is unnecessary is here
                                                         //Remove multiple return statement by declaring a variable
          return 2;
        }
        if (playerScore >= 100 && playerScore < 500) {
            return  3;
        }
        return 4; */

    public static int highScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        }
        else if (playerScore >= 500) {
            position = 2;
        }
        else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}


