package letitbe.types;

public class LIBType {

    public static final LIBType REAL = new LIBType("Real");
    public static final LIBType RATIONAL = new LIBType("Rational", REAL);
    public static final LIBType INTEGER = new LIBType("Integer", RATIONAL);
    public static final LIBType NATURAL = new LIBType("Natural", INTEGER);
    private final String name;
    private final LIBType[] supertypes;

    public LIBType(String name, LIBType... supertypes) {
        this.name = name;
        this.supertypes = supertypes;
    }

    public boolean isSubtypeOf(LIBType other) {
        if(equals(other))
            return true;
        for(LIBType t : supertypes) {
            if(t.equals(other))
                return true;
            if(other.isSubtypeOf(t))
                return true;
        }
        return false;
    }

    public LIBType[] getSupertypes() {
        return supertypes;
    }

    public String getName() {
        return name;
    }
}
