import static org.junit.Assert.*;

/**
 * Created by goot on 7/26/16.
 */
public class SieveTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void calculateMax() throws Exception {
        String[] length = {"20"};
        int max = Sieve.calculateMax(length);
        assertEquals(max, 20);
    }


    @org.junit.Test
    public void calculateMax2() throws Exception {

        try {
            String[] length = {};
            int max = Sieve.calculateMax(length);
            fail("Illegal Argument Exception should be thrown.");
        } catch (IllegalArgumentException e) {
            return;
            //Invalid Argument was passed, so invalid Argument Exception was throw
        }





    }

}