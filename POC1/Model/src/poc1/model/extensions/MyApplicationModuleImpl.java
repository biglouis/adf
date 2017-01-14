package poc1.model.extensions;

import oracle.jbo.server.ApplicationModuleImpl;

public class MyApplicationModuleImpl extends ApplicationModuleImpl {
    public MyApplicationModuleImpl() {
        super();
        System.out.println(this.getClass().getName());
    }
}
