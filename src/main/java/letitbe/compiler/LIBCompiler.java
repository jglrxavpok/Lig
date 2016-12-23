package letitbe.compiler;

import letitbe.parsing.LIBCodeblock;
import letitbe.typeresolving.LIBTypeResolver;

public abstract class LIBCompiler<Result> {

    protected final LIBTypeResolver typeResolver;

    public LIBCompiler(LIBTypeResolver typeResolver) {
        this.typeResolver = typeResolver;
    }

    public abstract Result compile(LIBCodeblock codeblock);

}
