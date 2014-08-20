package org.unijac.ingesoft3.ejercicio;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        EvaluacionDiagnostica ev = new EvaluacionDiagnostica();
        assertEquals("Eval (12) = 479001600", "479001600", ev.eval(12).getResultado().toString());
        assertEquals("Eval (24) = 620448401733239439360000", "620448401733239439360000", ev.eval(24).getResultado().toString());
        assertEquals("Eval (124) = 7", "7", ev.eval(124).getResultado().toString());
        assertEquals("Eval (67) = 13", "13", ev.eval(67).getResultado().toString());
        assertTrue( true );
    }
}
