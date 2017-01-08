package poc1.model.extensions;

import oracle.jbo.server.ViewDefImpl;
import oracle.jbo.server.ViewObjectImpl;

public class MyViewObjectImpl extends ViewObjectImpl {
    public MyViewObjectImpl(String string, ViewDefImpl viewDefImpl) {
        super(string, viewDefImpl);
        System.out.println("MyViewObjectImpl A");
    }

    public MyViewObjectImpl() {
        super();
        System.out.println("MyViewObjectImpl B");
    }
}
