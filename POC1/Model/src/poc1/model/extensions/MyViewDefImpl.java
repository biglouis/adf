package poc1.model.extensions;

import oracle.jbo.server.ViewDefImpl;

public class MyViewDefImpl extends ViewDefImpl {
    public MyViewDefImpl(int i, String string, String string1) {
        super(i, string, string1);
        System.out.println(this.getClass().getName() + "string=" + string + " i=" + i + " string1=" + string1);
    }

    public MyViewDefImpl(String string) {
        super(string);
        System.out.println(this.getClass().getName() + " string=" + string);
    }

    public MyViewDefImpl(int i, String string) {
        super(i, string);
        System.out.println(this.getClass().getName() + " string=" + string + " i=" + i);
    }

    public MyViewDefImpl() {
        super();
        System.out.println(this.getClass().getName());
    }
}
