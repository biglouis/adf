package poc1.model.extensions;

import oracle.jbo.server.ProgrammaticViewRowImpl;

public class MyProgrammaticViewRowImpl extends ProgrammaticViewRowImpl {
    public MyProgrammaticViewRowImpl() {
        super();
        System.out.println("MyProgrammaticViewRowImpl");
    }
}
