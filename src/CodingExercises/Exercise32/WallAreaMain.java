package CodingExercises.Exercise32;


public class WallAreaMain {
    public static void main(String[] args) {
        WallArea area=new WallArea(14,13);
        System.out.println("Area of wall is first : "+ area.getArea());
        test(area);
        byValue(123.0,123.999);
    }





    //Not in exercise
    //This is pass or call by reference
    public static void test(WallArea area){
        System.out.println("Area of wall is second " + area.getArea());
    }
    //This is passed by value
    public static void byValue(Double area,Double width){
        WallArea area2=new WallArea(area,width);
        System.out.println("Area of wall is third   " + area2.getArea());
    }
}
