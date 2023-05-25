package OOPSPart2.Composition.Challenge;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishMaster;
    private Refrigerator iceBox;

    //Constructor
    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishMaster = new DishWasher();
        iceBox = new Refrigerator();
    }

    //Getter
    public CoffeeMaker getBrewMaster() {

        return brewMaster;
    }

    //Getter
    public DishWasher getDishMaster() {

        return dishMaster;
    }

    //Getter
    public Refrigerator getIceBox() {

        return iceBox;
    }

    public void kitchenState(boolean coffeeFlag, boolean dishFlag, boolean fridgeFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishMaster.setHasWorkToDo(dishFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishMaster.doDishes();
        iceBox.orderFood();
    }
}

class Refrigerator {
    private boolean hasWorkToDo;


    //Setter
    public void setHasWorkToDo(boolean hasWorkToDo) {

        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;


    //Setter
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Do Dishes");
            hasWorkToDo = false;

        }
    }
}

//We have not used extend here as we not using property of parent class
class CoffeeMaker {

    private boolean hasWorkToDo;

    //Setter

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;

        }
    }

}