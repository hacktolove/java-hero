package SecondExcercise;

public class Fan extends  Applience{

    public Fan(String name) {
        super(name);
    }

    @Override
    public String start() {
        return "Fan is running";
    }
}
