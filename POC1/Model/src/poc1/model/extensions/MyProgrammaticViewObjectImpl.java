package poc1.model.extensions;

import oracle.jbo.server.ProgrammaticViewObjectImpl;

public class MyProgrammaticViewObjectImpl extends ProgrammaticViewObjectImpl {
    public MyProgrammaticViewObjectImpl() {
        super();
        System.out.println(this.getClass().getName());
    }
}
