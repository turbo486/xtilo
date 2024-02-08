import java.util.Scanner;

public class Machine {
    private Rule[] rules;
    private Tape tape;
    private int head;
    private State[] states;
    private State lastState;
    StringBuffer stringBuffer = new StringBuffer();

    public Machine(Rule[] rules, Tape tape, State[] states) {
        this.rules = rules;
        this.tape = tape;
        this.states = states;

        for (int i = 0; i < tape.getLength(); i++)
            if (!tape.getSymbolOnPositon(i).equals("#")) {
                head = i;
                break;
            }

        for (int i = 0; i < states.length; i++)
            if (states[i].isStart()) {
                lastState = states[i];
                break;
            }
    }

    public void run() {
        int cycleCounter = 0;
        String startTape = "";

        for (int i = 0; i < tape.getLength(); i++)
            startTape = startTape + tape.getSymbolOnPositon(i);

        System.out.println("Počáteční stav pásky: " + tape.print() + " | pozice hlavy: " + head + " | poslední stav: " + lastState.getName());
        stringBuffer.append("111");

        while (!lastState.isEnd()) {
            oneCycle();
            head = tape.upgrade(head);

            System.out.println("Stav pásky: " + tape.print() + " | pozice hlavy: " + head + " | poslední stav: " + lastState.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            cycleCounter++;
        }

        stringBuffer.append("1");
        stringBuffer.append(startTape);

        System.out.println("\nČasová složitost " + cycleCounter);
        System.out.println("\nKód Turingova stroje: ");
        System.out.println(stringBuffer.toString());
    }

    private void oneCycle() {
        for (int i = 0; i < rules.length; i ++)
            if (rules[i].getCurrentState().getName() == lastState.getName())

                if(rules[i].getReadSymbol().equals(tape.getSymbolOnPositon(head)) ||
                        rules[i].getReadSymbol().equals("*")) {

                    if (!rules[i].getWriteSymbol().equals("*"))
                        tape.setSymbolsOnPosition(head, rules[i].getWriteSymbol());

                    if (rules[i].getOperation() == TapeOperation.L) {
                        head--;
                    } else if (rules[i].getOperation() == TapeOperation.R) {
                        head++;
                    }

                    lastState = rules[i].getNextState();
                    int len = Integer.valueOf(rules[i].getCurrentState().getName().replace("q", ""));

                    stringBuffer.append("0".repeat(len));
                    stringBuffer.append("1");
                    if (rules[i].getReadSymbol().equals("0"))
                        stringBuffer.append("0");
                    else if (rules[i].getReadSymbol().equals("1"))
                        stringBuffer.append("00");
                    else
                        stringBuffer.append("000");
                    stringBuffer.append("1");

                    len = Integer.valueOf(rules[i].getNextState().getName().replace("q", ""));

                    stringBuffer.append("0".repeat(len));
                    stringBuffer.append("1");
                    if (rules[i].getReadSymbol().equals("0"))
                        stringBuffer.append("0");
                    else if (rules[i].getReadSymbol().equals("1"))
                        stringBuffer.append("00");
                    else
                        stringBuffer.append("000");
                    stringBuffer.append("1");
                    if (rules[i].getReadSymbol().equals("R"))
                        stringBuffer.append("0");
                    else if (rules[i].getReadSymbol().equals("L"))
                        stringBuffer.append("00");
                    else
                        stringBuffer.append("000");
                    stringBuffer.append("1");

                    break;
                }
    }
}
