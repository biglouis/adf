package poc1.model.extensions;

import oracle.jbo.server.EntityDefImpl;

public class MyEntityDefImpl extends EntityDefImpl {
    public MyEntityDefImpl(int i, String string, String string1) {
        super(i, string, string1);
        System.out.println("MyEntityDefImpl A");
    }

    public MyEntityDefImpl(String string) {
        super(string);
        System.out.println("MyEntityDefImpl B");
    }

    public MyEntityDefImpl(int i, String string) {
        super(i, string);
        System.out.println("MyEntityDefImpl C");
    }

    public MyEntityDefImpl() {
        super();
        System.out.println("MyEntityDefImpl D");
    }
}
