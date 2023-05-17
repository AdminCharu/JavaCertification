package OOPSPart1;

public class Car {
    private String model="XYZ";
    private String make="Audi";
    private String color="Black";
    private int doors=4;
    private boolean convertible=false;

    //Default values will be assigned by Java if we don't provide any values to variables.
//    public void describeCar() {
//        System.out.println("Door  " + doors + " "
//                + color + "   "
//                + make + "   "
//                + model + "  "
//                + (convertible ? "Convertible" : ""));

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        if(make==null)make="Unknown";
        String lowercase=make.toLowerCase();
        switch (lowercase){
            case "holden","porsche","audi"-> this.make=make;
            default ->
                this.make="Unsupported";

        }

    }

    public void setModel(String model) {
      this. model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println("Door  " + doors + " "
                + color + "   "
                + make + "   "
                + model + "  "
                + (convertible ? "Convertible" : ""));
    }
}
