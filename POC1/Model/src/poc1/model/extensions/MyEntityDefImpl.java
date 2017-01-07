package poc1.model.extensions;

import oracle.jbo.server.EntityDefImpl;

public class MyEntityDefImpl extends EntityDefImpl {
    public MyEntityDefImpl(int i, String string, String string1) {
        super(i, string, string1);
    }

    public MyEntityDefImpl(String string) {
        super(string);
    }

    public MyEntityDefImpl(int i, String string) {
        super(i, string);
    }

    public MyEntityDefImpl() {
        super();
    }
}
