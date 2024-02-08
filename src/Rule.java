public class Rule {
    private State currentState;
    private String readSymbol;
    private State nextState;
    private String writeSymbol;
    private TapeOperation operation;

    public Rule(State currentState, String readSymbol, State nextState,
                String writeSymbol, TapeOperation operation) {
        this.currentState = currentState;
        this.readSymbol = readSymbol;
        this.nextState = nextState;
        this.writeSymbol = writeSymbol;
        this.operation = operation;
    }

    public State getCurrentState() {
        return currentState;
    }

    public String getReadSymbol() {
        return readSymbol;
    }

    public State getNextState() {
        return nextState;
    }

    public String getWriteSymbol() {
        return writeSymbol;
    }

    public TapeOperation getOperation() {
        return operation;
    }
}
