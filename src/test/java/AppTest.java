import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void testShouldBePassed() {
        assertTrue(true);
    }


    @Ignore("Not implemented yet")
    @Test
    public void testShouldBeSKipped() {
        assertTrue(true);
    }

    @Test
    public void testAnotherMethod() {
        App.doNothing();
    }

    @Test
    public void testAnotherClass() {
        EmptyClass.emptyMethod();
    }
}
