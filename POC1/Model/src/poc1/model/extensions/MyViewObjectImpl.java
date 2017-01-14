package poc1.model.extensions;

import oracle.jbo.server.ViewDefImpl;
import oracle.jbo.server.ViewObjectImpl;

public class MyViewObjectImpl extends ViewObjectImpl {
    public MyViewObjectImpl(String string, ViewDefImpl viewDefImpl) {
        super(string, viewDefImpl);
        System.out.println(this.getClass().getName() + " string=" + string);
    }

    public MyViewObjectImpl() {
        super();
        System.out.println(this.getClass().getName());
    }
}
