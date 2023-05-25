package OOPSPart2.Encapsulation.Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = 0;
        this.pagesPrinted =(tonerLevel>=0 && tonerLevel <=100)?tonerLevel:-1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int amount =tonerAmount+tonerLevel;
        if ((amount < 0) || (amount> 100)) {
            return -1;
        } else {
             tonerLevel = tonerLevel + tonerAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pagesToPrint) {
        int jobPages = (duplex) ? (pagesToPrint / 2) + (pagesToPrint % 2) : pagesToPrint;
        pagesPrinted = pagesPrinted + jobPages;
        return jobPages;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
