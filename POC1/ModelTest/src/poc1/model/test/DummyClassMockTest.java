package poc1.model.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(DummyClass.class)
public class DummyClassMockTest {

    private static final int ID_TO_VERIFY = 1;
    private static final String MOCKED_ID_METHOD = "getIdInternal";

    private DummyClass dc = PowerMockito.spy(new DummyClass());

    public DummyClassMockTest() {
    }

    /**
     * @see DummyClass#getId()
     */
    @Test
    public void getId_should_deliver_id() {
        assertEquals(dc.getId(), ID_TO_VERIFY);
    }

    @Before
    public void setUp() throws Exception {
        PowerMockito.doReturn(ID_TO_VERIFY).when(dc, MOCKED_ID_METHOD);
    }
}
