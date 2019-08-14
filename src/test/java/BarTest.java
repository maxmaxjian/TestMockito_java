import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.MockitoAnnotations.initMocks;

public class BarTest {

    @Mock
    private Bar mockBar;

    @Before
    public void setUp() {
        initMocks(this);
//        mockBar = spy(new Bar());
    }

    @Test
    public void testbar() {
        mockBar.bar();
    }
}