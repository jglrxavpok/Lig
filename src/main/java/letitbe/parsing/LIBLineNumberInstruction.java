package letitbe.parsing;

public class LIBLineNumberInstruction extends LIBInstruction {
    private final int line;

    public LIBLineNumberInstruction(int line) {
        super();
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof LIBLineNumberInstruction)
            return ((LIBLineNumberInstruction) obj).line == line;
        return false;
    }
}
