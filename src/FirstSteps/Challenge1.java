package FirstSteps;

public class Challenge1 {
    public static void main(String[] args) {
        double firstVar=20.00,secondVar=80.00;
        double sum=firstVar+secondVar*100;
        //double sum=(firstVar+secondVar)*100; //output will change now
        double remainder=sum%40.00;
        boolean isZero=remainder==0?true:false;
        System.out.println(isZero);
        if(!isZero){
            System.out.println("got some remainder");

            int health=12;
            if((health<10)&&(health==20)){
                int score=health+200;
            }
        }
    }
}
