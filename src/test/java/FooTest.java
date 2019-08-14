import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class FooTest {

    private Foo spiedFoo/* = new Foo()*/;

    @Before
    public void setUp() {
        spiedFoo = spy(new Foo());
    }

    @Test
    public void testfoo() {
//        // setup
//        Foo spiedFoo = spy(mFoo);

        // actuate
        spiedFoo.print();

        // verify
        verify(spiedFoo).foo();
    }
}