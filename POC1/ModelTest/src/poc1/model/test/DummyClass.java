package poc1.model.test;


public class DummyClass {
    public DummyClass() {
        super();
    }
    
    public int getId(){
        return getIdInternal();
    }
    
    protected int getIdInternal(){
        return 0;
    }
}
