package poc1.model.extensions;

import oracle.jbo.server.ApplicationModuleDefImpl;

public class MyApplicationModuleDefImpl extends ApplicationModuleDefImpl {
    public MyApplicationModuleDefImpl(String string) {
        super(string);
        System.out.println("MyApplicationModuleDefImpl A");
    }

    public MyApplicationModuleDefImpl(int i, String string) {
        super(i, string);
        System.out.println("MyApplicationModuleDefImpl B");
    }

    public MyApplicationModuleDefImpl() {
        super();
        System.out.println("MyApplicationModuleDefImpl C");
    }
}
