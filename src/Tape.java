public class Tape {
    private String[] symbols;

    public Tape(String[] symbols) {
        this.symbols = symbols;
    }

    public String print() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < symbols.length; i++) {
            stringBuffer.append(symbols[i]);
            if (i + 1 < symbols.length)
                stringBuffer.append(" ");
        }

        return stringBuffer.toString();
    }

    public String getSymbolOnPositon(int position) {
        return symbols[position];
    }

    public void setSymbolsOnPosition(int position, String symbol) {
        symbols[position] = symbol;
    }

    public int getLength() {
        return symbols.length;
    }

    public int upgrade(int headPosition) {
        while (!(symbols[0] + symbols[1]).equals("##")) {
            String[] temp = new String[symbols.length + 1];
            temp[0] = "#";
            for (int i = 0; i < symbols.length; i++)
                temp[i + 1] = symbols[i];

            headPosition++;

            symbols = temp;
        }

        while (!(symbols[symbols.length - 2] + symbols[symbols.length - 1]).equals("##")) {
            String[] temp = new String[symbols.length + 1];
            for (int i = 0; i < symbols.length; i++)
                temp[i] = symbols[i];
            temp[temp.length - 1] = "#";
            
            symbols = temp;
        }

        return headPosition;
    }
}
