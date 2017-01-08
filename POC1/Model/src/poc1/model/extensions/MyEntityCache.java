package poc1.model.extensions;

import oracle.jbo.server.EntityCache;

public class MyEntityCache extends EntityCache {
    public MyEntityCache() {
        super();
        System.out.println("MyEntityCache");
    }
}
