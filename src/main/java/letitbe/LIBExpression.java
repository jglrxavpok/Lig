package letitbe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LIBExpression {
    private List<LIBInstruction> instructions;

    public LIBExpression(LIBInstruction... insns) {
        instructions = new ArrayList<>();
        Collections.addAll(instructions, insns);
    }

    public List<LIBInstruction> getInstructions() {
        return instructions;
    }

    public void appendInstruction(LIBInstruction instruction) {
        instructions.add(instruction);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof LIBExpression) {
            LIBExpression other = ((LIBExpression) obj);
            int size = other.getInstructions().size();
            if(size != instructions.size())
                return false;
            for (int i = 0; i < size; i++) {
                LIBInstruction a = getInstructions().get(i);
                LIBInstruction b = other.getInstructions().get(i);
                if(!a.equals(b))
                    return false;
            }
            return true;
        }
        return false;
    }
}
