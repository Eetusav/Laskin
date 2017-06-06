/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaatiot;

import graafinenkayttoliittyma.Laskin;

/**
 *
 * @author Matti
 */
public class Operaatio {

    String operaatio = "";
    AritmeettinenOperaatio ao = new AritmeettinenOperaatio();
    FunktioOperaatio fo = new FunktioOperaatio();
    double result = 0;

    public Operaatio(String operaatio) {
        this.operaatio = operaatio;

    }

    public String operoiA(double param1, double param2) {
        if ("+".equals(this.operaatio)) {
            result = ao.summa(param1, param2);
            return String.valueOf(result);
        }
        if ("-".equals(operaatio)) {
            result = ao.erotus(param1, param2);
            return String.valueOf(result);
        }
        if ("*".equals(operaatio)) {
           result = ao.kertolasku(param1, param2);
            return String.valueOf(result);
        }
        if ("/".equals(operaatio)) {
            result = ao.jakolasku(param1, param2);
            return String.valueOf(result);
        }
        if ("%".equals(operaatio)) {
            result = ao.jakojaannos(param1, param2);
            return String.valueOf(result);
        }
        if ("^".equals(this.operaatio)) {
            result = fo.potenssi(param1, param2);
            return String.valueOf(result);
        }
        return "Operaatiota ei ole annettu";
    }


}
