package poc1.model.extensions;

import oracle.jbo.server.ViewDefImpl;

public class MyViewDefImpl extends ViewDefImpl {
    public MyViewDefImpl(int i, String string, String string1) {
        super(i, string, string1);
        System.out.println("MyViewDefImpl A");
    }

    public MyViewDefImpl(String string) {
        super(string);
        System.out.println("MyViewDefImpl B");
    }

    public MyViewDefImpl(int i, String string) {
        super(i, string);
        System.out.println("MyViewDefImpl C");
    }

    public MyViewDefImpl() {
        super();
        System.out.println("MyViewDefImpl D");
    }
}
