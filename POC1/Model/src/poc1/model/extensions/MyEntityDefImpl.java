package poc1.model.extensions;

import oracle.jbo.server.EntityDefImpl;

public class MyEntityDefImpl extends EntityDefImpl {
    public MyEntityDefImpl(int i, String string, String string1) {
        super(i, string, string1);
        System.out.println(this.getClass().getName() + " string=" + string + " i=" + i + " string1=" + string1);
    }

    public MyEntityDefImpl(String string) {
        super(string);
        System.out.println(this.getClass().getName() + " string=" + string);
    }

    public MyEntityDefImpl(int i, String string) {
        super(i, string);
        System.out.println(this.getClass().getName() + " string=" + string + " i=" + i);
    }

    public MyEntityDefImpl() {
        super();
        System.out.println(this.getClass().getName());
    }
}
