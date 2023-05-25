package OOPSPart2.Composition;

import OOPSPart2.Composition.ComputerCase;
import OOPSPart2.Composition.Monitor;
import OOPSPart2.Composition.MotherBoard;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("78X", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");
        MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus",
                4, 6, "v2.44");
        PersonalComputer thePc = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        //Composition -> Calling other class method by using object of one class.
//        thePc.getMonitor().drawPixelAt(10, 20, "Red");
//        thePc.getMotherBoard().loadProgram("Windows OS");
//        thePc.getComputerCase().pressPowerButton();

        thePc.powerUp();
    }

}
