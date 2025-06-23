package LambdaExperssion;

@FunctionalInterface
interface Drivable {
    String drive(double speed);

}

public class Main {

    public static void main(String[] args) {

        Drivable car = speed -> "Driving at " + speed + " km/h";

        car.drive(120);

    }

}
