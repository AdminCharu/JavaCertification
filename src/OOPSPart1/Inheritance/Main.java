package OOPSPart1.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal("Hybrid","Small",123);
        doAnimalStuff(animal,"12");
        System.out.println(animal);

        Dog dog=new Dog();
        doAnimalStuff(dog,"123");
        System.out.println(dog);
    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
    }

}
