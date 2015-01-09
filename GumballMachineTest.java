

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    private GumballMachine m1;

    /**
     * Default constructor for test class GumballMachineTest
     */
    public GumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        m1 = new GumballMachine(5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
        m1.insertQuarter();
        m1.turnCrank();
        assertEquals(false, m1.isGumballInSlot());
    }

    @Test
    public void test2()
    {
        m1.insertQuarter();
        m1.insertDime();
        m1.insertQuarter();
        m1.turnCrank();
        assertEquals(true, m1.isGumballInSlot());
    }

    @Test
    public void test3()
    {
        m1.insertQuarter();
        m1.insertQuarter();
        m1.insertNickel();
        m1.turnCrank();
        m1.takeGumballFromSlot();
        assertEquals(false, m1.isGumballInSlot());
    }

    @Test
    public void test4()
    {
        m1.insertDime();
        m1.insertQuarter();
        m1.turnCrank();
        m1.insertNickel();
        assertEquals(false, m1.isGumballInSlot());
    }

    @Test
    public void test5()
    {
        m1.insertDime();
        m1.insertQuarter();
        m1.insertNickel();
        m1.insertQuarter();
        m1.turnCrank();
        m1.turnCrank();
        assertEquals(true, m1.isGumballInSlot());
    }


  
}








