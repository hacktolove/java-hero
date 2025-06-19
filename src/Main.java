//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    enum Color {
        RED,
        GREEN,
        BLUE;

        public String getName() {
            return switch (this) {
                case RED -> "Red";
                case GREEN -> "Green";
                case BLUE -> "Blue";
            };
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Color redColor = Color.RED;

        System.out.println(redColor.getName());

    }
}