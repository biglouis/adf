package poc1.model.test;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.*;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

//@RunWith(PowerMockRunner.class)
//@PrepareForTest(DummyClass.class)
public class DummyClassTest {

    private int idToOverwrite;
    private TestFixture tf = new TestFixture();
    private TestableDummyClass dc;
    //    private DummyClass mockedDc;

    public DummyClassTest() {
    }

    /**
     * @see DummyClass#getIdToOverwrite()
     */
    @Test
    public void getIdToOverwrite_should_deliver_id() {
        idToOverwrite = 1;

        assertTrue(null, this.dc.getIdToOverwrite() == idToOverwrite);
    }

    @Before
    public void setUp() throws Exception {
        //        mockedDc = mock(DummyClass.class);
        dc = new TestableDummyClass();
        tf.setUp();
    }

    @After
    public void tearDown() throws Exception {
        tf.tearDown();
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
