package letitbe.parsing;

public class LIBConstantInstruction extends LIBInstruction {
    private final Object value;

    public LIBConstantInstruction(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof LIBConstantInstruction)
            return ((LIBConstantInstruction) obj).getValue().equals(getValue());
        return false;
    }
}
