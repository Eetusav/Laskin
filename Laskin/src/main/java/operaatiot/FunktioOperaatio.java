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
    /**
     * Laskee annetun luvun kosinin. Oletetaan, että annettu syöte on radiaaneina.
     * @param param1 Käyttäjän antama syöte. Luku käsitellään radiaaneina.
     * @return Palauttaa luvun kosinin.
     */
    public double cos(double param1) {
        return Math.cos(param1);
    }
    /**
     * Laskee annetun luvun sinin. Oletetaan, että annettu syöte on radiaaneina.
     * @param param1 Käyttäjän antama syöte. Luku käsitellään radiaaneina.
     * @return Palauttaa luvun sinin.
     */
    public double sin(double param1) {
        return Math.sin(param1);
    }
    /**
     * Laskee annetun luvun tangentin. Oletetaan, että annettu syöte on radiaaneina.
     * @param param1 Käyttäjän antama syöte. Luku käsitellään radiaaneina.
     * @return Palauttaa luvun tangentin.
     */
    public double tan(double param1) {
        return Math.tan(param1);
    }
    /**
     * Laskee käyttäjän
     * @param param1
     * @param param2
     * @return 
     */
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
