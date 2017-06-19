/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaatiot;

/**
 * Suorittaa funktio-operaatioita.
 * @author Matti
 */
public class FunktioOperaatio {



    /**
     * Laskee annetun luvun kosinin. Oletetaan, että annettu syöte on
     * radiaaneina.
     *
     * @param param1 Käyttäjän antama syöte. Luku käsitellään radiaaneina.
     * @return Palauttaa luvun(double) kosinin.
     */
    public double cos(double param1) {
        return Math.cos(param1);
    }

    /**
     * Laskee annetun luvun sinin. Oletetaan, että annettu syöte on radiaaneina.
     *
     * @param param1 Käyttäjän antama syöte. Luku käsitellään radiaaneina.
     * @return Palauttaa luvun(double) sinin.
     */
    public double sin(double param1) {
        return Math.sin(param1);
    }

    /**
     * Laskee annetun luvun tangentin. Oletetaan, että annettu syöte on
     * radiaaneina.
     *
     * @param param1 Käyttäjän antama syöte. Luku käsitellään radiaaneina.
     * @return Palauttaa luvun(double) tangentin.
     */
    public double tan(double param1) {
        return Math.tan(param1);
    }

    /**
     * Laskee annettujen lukujen potenssin muodossa ensimmäinen syöte potenssiin
     * toinen syöte.
     *
     * @param param1 Käyttäjän antama syöte.
     * @param param2 Käyttäjän antama syöte.
     * @return Palauttaa lasketun potenssin.
     */
    public double potenssi(double param1, double param2) {
        return Math.round((Math.pow(param1, param2)) * 100000000.00000000001) / 100000000.0d;

    }

    /**
     * Laskee annetun luvun neliön.
     *
     * @param param1 Käyttäjän antama syöte.
     * @return Palauttaa käyttäjän antaman syötteen neliön.
     */
    public double nelio(double param1) {
        return Math.round((Math.pow(param1, 2)) * 100000000.00000000001) / 100000000.0d;

    }

    /**
     * Laskee käyttäjän antaman kokonaisluvun kertoman. Eli esimerkiksi 4! = 4 *
     * 3 * 2 * 1.
     *
     * @param n Käyttäjän antama (kokonaisluku) syöte
     * @return Palauttaa annetun luvun kertoman.
     */
    public double kertoma(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return Math.round((fact) * 100000000.00000000001) / 100000000.0d;
    }

    /**
     * Laskee käyttäjän antaman syötteen kymmenkantaisen logaritmin.
     *
     * @param param1 Käyttäjän antama syöte.
     * @return Palauttaa annetun luvun kymmenkantaisen logaritmin.
     */
    public double log(double param1) {
        return Math.round((Math.log10(param1)) * 100000000.00000000001) / 100000000.0d;
    }

    /**
     * Laskee käyttäjän antaman syötteen neliöjuuren.
     *
     * @param param1 Käyttäjän antama syöte.
     * @return Palauttaa annetun luvun neliöjuuren.
     */
    public double sqrt(double param1) {
        return (Math.round((Math.sqrt(param1)) * 100000000.00000000001) / 100000000.0d);
    }

    /**
     * Laskee käyttäjän antaman syötteen logaritmin kantalukuna neperin luku e.
     *
     * @param param1 Käyttäjän antama syöte.
     * @return Palauttaa annetun luvun luonnollisen logaritmin.
     */
    public double ln(double param1) {
        return Math.round((Math.log(param1)) * 100000000.00000000001) / 100000000.0d;
    }

    /**
     * Laskee käyttäjän antaman syötteen vastaluvun. Eli esimerkiksi luvun 4
     * vastaluku on -4.
     *
     * @param param1 Käyttäjän antama syöte.
     * @return Palauttaa annetun luvun vastaluvun.
     */
    public double ops(double param1) {
        return (-1) * param1;
    }

    /**
     * Laskee käyttäjän antaman syötteen käänteisluvun. Esimerkiksi luvun 4
     * käänteisluku on 0.25.
     *
     * @param param1 Käyttäjän antama syöte.
     * @return Palauttaa annetun luvun käänteisluvun.
     */
    public double kaanteisluku(double param1) {
        return 1 / param1;
    }
}
