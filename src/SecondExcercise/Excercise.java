package SecondExcercise;

public class Excercise {


    public static void main(String[] a){

        Machine fan = new Fan("fan");
        Machine washer = new WashingMachine("Washing Machine");

        System.out.println(fan.start());
        System.out.println(washer.start());
    }

}
