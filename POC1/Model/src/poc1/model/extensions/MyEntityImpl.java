package poc1.model.extensions;

import oracle.jbo.server.EntityImpl;

public class MyEntityImpl extends EntityImpl {
    public MyEntityImpl() {
        super();
        System.out.println("MyEntityImpl");
    }
}
