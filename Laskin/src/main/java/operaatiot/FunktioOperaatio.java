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
    
    public FunktioOperaatio(){
        
    }
    public FunktioOperaatio(String syote){
        
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
        return Math.pow(param1, param2);
    }

    public double nelio(double param1) {
        return Math.pow(param1, 2);
    }

    public double kertoma(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public double log(double param1) {
        return Math.log10(param1);
    }

    public double sqrt(double param1) {
        return Math.sqrt(param1);
    }

    public double ln(double param1) {
        return Math.log(param1);
    }
    public double ops(double param1) {
        return (-1) * param1;
    }
}
