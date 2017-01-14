package poc1.model.extensions;

import oracle.jbo.server.ApplicationModuleDefImpl;

public class MyApplicationModuleDefImpl extends ApplicationModuleDefImpl {
    public MyApplicationModuleDefImpl(String string) {
        super(string);
        System.out.println(this.getClass().getName() + " string=" + string);
    }

    public MyApplicationModuleDefImpl(int i, String string) {
        super(i, string);
        System.out.println(this.getClass().getName() + "string=" + string + " i=" + i);
    }

    public MyApplicationModuleDefImpl() {
        super();
        System.out.println(this.getClass().getName());
    }
}
