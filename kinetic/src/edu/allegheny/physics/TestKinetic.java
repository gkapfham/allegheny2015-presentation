package edu.allegheny.physics;

// import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestKinetic {
    // extends TestCase {

    // public TestKinetic(String name) {
    //     super(name);
    // }

    // public static Test suite() {
    //     return new TestSuite(TestKinetic.class);
    // }

    @Test
    public void testOne() {
        String expected = new String("Undefined");
        String actual = Kinetic.computeVelocity(5,0);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo() {
        String expected = new String("0");
        String actual = Kinetic.computeVelocity(0,5);
        assertEquals(expected, actual);
    }

    @Test
    public void testThree() {
        String expected = new String("4");
        String actual = Kinetic.computeVelocity(8,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testFour() {
        String expected = new String("20");
        String actual = Kinetic.computeVelocity(1000,5);
        assertEquals(expected, actual);
    }

}
