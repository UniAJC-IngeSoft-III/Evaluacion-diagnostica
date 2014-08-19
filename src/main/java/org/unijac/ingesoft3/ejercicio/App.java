package org.unijac.ingesoft3.ejercicio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        EvaluacionDiagnostica ev = new EvaluacionDiagnostica();
        System.out.printf(ev.eval(12).toString());
        System.out.printf(ev.eval(67).toString());
        System.out.printf(ev.eval(24).toString());
        System.out.printf(ev.eval(124).toString());
    }
}
