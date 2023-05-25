package OOPSPart2.Composition.Challenge;

public class Main2 {
    public static void main(String[] args) {

        SmartKitchen myKitchen = new SmartKitchen();

        //Accessing using getter setting value using setter.
//        myKitchen.getBrewMaster().setHasWorkToDo(true);
//        myKitchen.getDishMaster().setHasWorkToDo(false);
//        myKitchen.getIceBox().setHasWorkToDo(true);
//
//        myKitchen.getBrewMaster().brewCoffee();
//        myKitchen.getDishMaster().doDishes();
//        myKitchen.getIceBox().orderFood();


        //These 2 lines will also do thr same things just 2 functions are created in SmartKitchen
        myKitchen.kitchenState(true, false, true);
        myKitchen.doKitchenWork();
    }
}
