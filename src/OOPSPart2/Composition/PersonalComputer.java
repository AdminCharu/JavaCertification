package OOPSPart2.Composition;

import OOPSPart2.Composition.ComputerCase;
import OOPSPart2.Composition.Monitor;
import OOPSPart2.Composition.MotherBoard;

public class PersonalComputer extends Product {

    /* If you're using the extends  option to inherit, Java only lets you
     inherit from one class at a time. But here using composition we can use 3 classes at a time and even more*/
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase,
                            Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(10, 20, "Red");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
