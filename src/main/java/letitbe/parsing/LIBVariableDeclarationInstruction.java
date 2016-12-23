package letitbe.parsing;

public class LIBVariableDeclarationInstruction extends LIBInstruction {
    private LIBExpression defaultValue;
    private String variableName;
    private String variableType;

    public LIBVariableDeclarationInstruction(String variableName, String variableType, LIBExpression defaultValue) {
        this.variableName = variableName;
        this.variableType = variableType;
        this.defaultValue = defaultValue;
    }

    public LIBExpression getDefaultValue() {
        return defaultValue;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getVariableType() {
        return variableType;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof LIBVariableDeclarationInstruction) {
            LIBVariableDeclarationInstruction other = ((LIBVariableDeclarationInstruction) obj);
            if(other.getDefaultValue() == null && getDefaultValue() != null)
                return false;
            else if(other.getDefaultValue() != null && getDefaultValue() == null)
                return false;
            else {
                if(other.getDefaultValue() != null && other.getDefaultValue().equals(getDefaultValue())) {
                    return getVariableName().equals(other.getVariableName()) && getVariableType().equals(other.getVariableType());
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
