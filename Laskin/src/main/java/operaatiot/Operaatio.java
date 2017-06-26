/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaatiot;

import graafinenkayttoliittyma.Laskin;

/**
 * Suorittaa yhtäsuuruusmerkkiä painettaessa annetun operaation mukaisen
 * laskutoimituksen.
 *
 * @author Matti
 */
public class Operaatio {

    String operaatio = "";
    AritmeettinenOperaatio ao = new AritmeettinenOperaatio();
    FunktioOperaatio fo = new FunktioOperaatio();
    double result = 0;

    /**
     * Konstruktori, kun luodaan uusi Operaatio().
     *
     * @param operaatio Käyttäjän antama syöte. Esimerkiksi "+"-merkki
     */
    public Operaatio(String operaatio) {
        this.operaatio = operaatio;

    }

    /**
     * Suorittaa käyttäjän antamille luvuille operaation mukaisen
     * laskutoimituksen.
     *
     * @param param1 Käyttäjän antama syöte.
     * @param param2 Käyttäjän antama syöte.
     * @return Palauttaa operaation mukaisen tuloksen annetuille syötteille.
     */
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

    /**
     * Palauttaa operaation merkin.
     *
     * @return operaation merkki
     */
    @Override
    public String toString() {
        return this.operaatio;
    }

    /**
     * Tarkistaa jakolaskun yhteydessä, että ei jaeta nollalla.
     *
     * @param param2 Käyttöliittymä syöttää tämän käyttäjän syötteen
     * perusteella.
     * @return Palauttaa true, jos syöte oli 0, muulloin false.
     */
    public boolean tarkistaNollallaJako(double param2) {
        if (param2 == 0) {
            return true;
        }
        return false;
    }

}
