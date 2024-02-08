public class State {
    private String name;
    private boolean start;
    private boolean end;

    public State(String name, boolean start, boolean end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public boolean isStart() {
        return start;
    }

    public boolean isEnd() {
        return end;
    }
}
