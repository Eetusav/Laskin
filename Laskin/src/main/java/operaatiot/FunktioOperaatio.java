/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaatiot;

/**
 *
 * @author Matti
 */
public class FunktioOperaatio {

    public FunktioOperaatio() {

    }

    public double cos(double param1) {
        return Math.cos(param1);
    }

    public double sin(double param1) {
        return Math.sin(param1);
    }

    public double tan(double param1) {
        return Math.tan(param1);
    }

    public double potenssi(double param1, double param2) {
        return Math.round((Math.pow(param1, param2)) * 100000000.00000001) / 100000000.0d;

    }

    public double nelio(double param1) {
        return Math.round((Math.pow(param1, 2)) * 100000000.00000001) / 100000000.0d;

    }

    public double kertoma(int n) {
        
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return Math.round((fact) * 100000000.00000001) / 100000000.0d;
    }

    public double log(double param1) {
        return Math.round((Math.log10(param1)) * 100000000.00000001) / 100000000.0d;
    }

    public double sqrt(double param1) {
        return Math.round((Math.sqrt(param1)) * 100000000.00000001) / 100000000.0d;
    }

    public double ln(double param1) {
        return Math.round((Math.log(param1)) * 100000000.00000001) / 100000000.0d;
    }

    public double ops(double param1) {
        return (-1) * param1;
    }
}
