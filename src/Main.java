import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] symbols = {"#", "#", "1", "0", "1", "#", "1", "0", "#", "#"};

        Machine machine = new Machine(Init.Rules(), new Tape(symbols), Init.States());
        machine.run();
    }
}
