package letitbe;

public class LIBCreateTupleInstruction extends LIBInstruction {
    private final LIBExpression left;
    private final LIBExpression right;

    public LIBCreateTupleInstruction(LIBExpression left, LIBExpression right) {
        super();
        this.left = left;
        this.right = right;
    }

    public LIBExpression getLeft() {
        return left;
    }

    public LIBExpression getRight() {
        return right;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof LIBCreateTupleInstruction)
            return ((LIBCreateTupleInstruction) obj).getLeft().equals(getLeft()) && ((LIBCreateTupleInstruction) obj).getRight().equals(getRight());
        return false;
    }
}
