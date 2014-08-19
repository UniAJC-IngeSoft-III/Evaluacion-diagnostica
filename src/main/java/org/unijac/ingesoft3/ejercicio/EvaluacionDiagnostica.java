package org.unijac.ingesoft3.ejercicio;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by alexhd on 19/08/14.
 */
public class EvaluacionDiagnostica {
    private Integer valor;
    private BigDecimal resultado;

    public EvaluacionDiagnostica() {
    }

    public EvaluacionDiagnostica eval(int numero ) {
        this.valor = numero;
        ArrayList<Short> numeros = new ArrayList<Short>();
        do{
            numeros.add((short) (numero % 10));
            numero /= 10;
        }while (numero > 0);
        this.resultado = valor % 3 == 0 ? factorial(valor) : sumarray(numeros);
        return this;
    }

    public static BigDecimal factorial( int arg ) {
        BigDecimal result = BigDecimal.ONE;
        do{
            result = result.multiply(BigDecimal.valueOf(arg--));
        }while (arg>0);
        return result;
    }

    private static BigDecimal sumarray(ArrayList<Short> arg) {
        int result = 0;
        for( int i = 0; i< arg.size(); i++)
            result += arg.get(i);
        return BigDecimal.valueOf( result );
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        eval(valor);
    }

    @Override
    public String toString() {
        return String.format("Eval (%d) = %s%n", this.valor, this.resultado);
    }
}
