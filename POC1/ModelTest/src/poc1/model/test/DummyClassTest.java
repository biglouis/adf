package poc1.model.test;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DummyClassTest {

    private int idToOverwrite;
    private TestFixture fixture = new TestFixture();

    public DummyClassTest() {
    }

    @Before
    public void setUp() throws Exception {
        fixture.setUp();
    }

    @After
    public void tearDown() throws Exception {
        fixture.tearDown();
    }

    /**
     * @see DummyClass#getIdToOverwrite()
     */
    @Test
    public void id_to_overwrite_shloud_deliver_1() {
        idToOverwrite = 1;
        DummyClass dc = new TestableDummyClass();
        int ret = dc.getIdToOverwrite();

        assertTrue("Id is 1", ret == 1);
    }

    /**
     * @see DummyClass#getIdToOverwrite()
     */
    @Test
    public void id_to_overwrite_should_deliver_2() {
        idToOverwrite = 2;
        DummyClass dc = new TestableDummyClass();
        int ret = dc.getIdToOverwrite();

        assertTrue("Id is 2", ret == 2);
    }

    /**
     * To overwrite some internal classes instead of mocking them...
     */
    public class TestableDummyClass extends DummyClass {
        @Override
        protected int getIdToOverwriteInternal() {
            return idToOverwrite;
        }
    }
}
