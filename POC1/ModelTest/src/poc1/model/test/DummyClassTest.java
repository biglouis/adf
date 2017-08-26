package poc1.model.test;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mockito;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(DummyClass.class)
public class DummyClassTest {

    private static final int ID_TO_VERIFY = 1;
    private static final String MOCKED_ID_METHOD = "getIdToMockInternal";
    private TestFixture tf = new TestFixture();

    private TestableDummyClass tdc = new TestableDummyClass();
    private DummyClass mdc = PowerMockito.spy(new DummyClass());

    public DummyClassTest() {
    }

    /**
     * @see DummyClass#getIdToOverwrite()
     */
    @Test
    public void getIdToOverwrite_should_deliver_id() {
        assertEquals(tdc.getIdToOverwrite(), ID_TO_VERIFY);
    }

    /**
     * @see DummyClass#getIdToMock()
     */
    @Test
    public void getIdToMock_should_deliver_id() {
        assertEquals(mdc.getIdToMock(), ID_TO_VERIFY);
    }

    @Before
    public void setUp() throws Exception {
        tf.setUp();
        PowerMockito.doReturn(ID_TO_VERIFY).when(mdc, MOCKED_ID_METHOD);
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
            return ID_TO_VERIFY;
        }
    }
}
