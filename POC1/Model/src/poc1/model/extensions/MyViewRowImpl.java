package poc1.model.extensions;

import oracle.jbo.server.ViewRowImpl;

public class MyViewRowImpl extends ViewRowImpl {
    public MyViewRowImpl() {
        super();
        System.out.println("MyViewRowImpl");
    }
}
