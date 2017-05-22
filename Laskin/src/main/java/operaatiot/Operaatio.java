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
public class Operaatio {

    public double summa(double param1, double param2) {
        double result = Math.round((param1 + param2) * 100000000.00001) / 100000000.0d;
        return result;
    }

    public double erotus(double param1, double param2) {
        double result = Math.round((param1 - param2) * 100000000.00001) / 100000000.0d;
        return result;
    }

    public double jakolasku(double param1, double param2) {
        double result = Math.round((param1 / param2) * 100000000.00001) / 100000000.0d;
        return result;
    }

    public double kertolasku(double param1, double param2) {
        double result = Math.round((param1 * param2) * 100000000.00001) / 100000000.0d;
        return result;
    }
}
