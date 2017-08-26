package poc1.model.test;

public class DummyClass {
    public DummyClass() {
        super();
    }
    
    public int getIdToOverwrite(){
        return getIdToOverwriteInternal();
    }
    
    protected int getIdToOverwriteInternal(){
        return 0;
    }

    public int getIdToMock(){
        return getIdToMockInternal();
    }
    
    private int getIdToMockInternal(){
        return 0;
    }
}
