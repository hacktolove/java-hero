package SecondExcercise;

public class WashingMachine extends  Applience{

    public WashingMachine(String name) {
        super(name);
    }

    @Override
    public String start() {
        return "Washing Machine is operating";
    }
}
