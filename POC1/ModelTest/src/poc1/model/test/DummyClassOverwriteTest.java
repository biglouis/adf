package poc1.model.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DummyClassOverwriteTest {

    private static final int ID_TO_VERIFY = 1;

    private TestableDummyClass dc = new TestableDummyClass();

    public DummyClassOverwriteTest() {
    }

    /**
     * @see DummyClass#getId()
     */
    @Test
    public void testGetId() {
        assertEquals(ID_TO_VERIFY, dc.getId());
    }

    /**
     * To overwrite some internal classes instead of mocking them...
     */
    public class TestableDummyClass extends DummyClass {
        @Override
        protected int getIdInternal() {
            return ID_TO_VERIFY;
        }
    }
}
