/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaatiot;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Matti
 *
 * Luokka sisältää tavalliset aritmeettiset operaatiot.
 */
public class AritmeettinenOperaatio {

    /**
     * Metodi laskee summan.
     *
     * @param param1 Käyttäjän antama syöte
     * @param param2 Käyttäjän antama syöte
     * @return palauttaa käyttäjän antamien syötteiden summan
     */
    public double summa(double param1, double param2) {
        double result = Math.round((param1 + param2) * 100000000d) / 100000000d;
        return result;
    }

    /**
     * Metodi laskee erotuksen.
     *
     * @param param1 Käyttäjän antama syöte
     * @param param2 Käyttäjän antama syöte
     * @return palauttaa käyttäjän antamien syötteiden erotuksen
     */
    public double erotus(double param1, double param2) {
        double result = Math.round((param1 - param2) * 100000000d) / 100000000d;
        return result;
    }

    /**
     * Metodi laskee osamäärän.
     *
     * @param param1 Käyttäjän antama syöte
     * @param param2 Käyttäjän antama syöte
     * @return palauttaa käyttäjän antamien syötteiden osamäärän
     */
    public double jakolasku(double param1, double param2) {
        double result = Math.round((param1 / param2) * 100000000.00001) / 100000000.0d;
        return result;
    }

    /**
     * Metodi laskee tulon.
     *
     * @param param1 Käyttäjän antama syöte
     * @param param2 Käyttäjän antama syöte
     * @return palauttaa käyttäjän antamien syötteiden tulon
     */
    public double kertolasku(double param1, double param2) {
        double result = Math.round((param1 * param2) * 100000000.00001) / 100000000.0d;
        return result;
    }

    /**
     * Metodi laskee jakojäännöksen.
     *
     * @param param1 Käyttäjän antama syöte
     * @param param2 Käyttäjän antama syöte
     * @return palauttaa käyttäjän antamien syötteiden välisen jakojäännöksen
     * muodossa: param1 modulo param2 = result
     */
    public double jakojaannos(double param1, double param2) {
        return Math.round(((param1 % param2)) * 100000000.00000001) / 100000000.0d;
    }

}
