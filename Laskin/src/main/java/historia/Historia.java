/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historia;

import graafinenkayttoliittyma.Laskin;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 * Luokkaan sisältyy sovelluksen ulkopuolisen tekstitiedoston kirjoittamiseen ja
 * lukemiseen liittyvä logiikka.
 *
 * @author Matti
 */
public class Historia {

    /**
     * Kirjoittaa sovelluksen ulkopuoliseen tekstitiedostoon syötteen.
     *
     * @param history Metodille annettava syöte.
     * @throws IOException Virhetilanne.
     */
    public void writeHistory(String history) throws IOException {
        try {
            FileUtils.writeStringToFile(new File("HISTORY.txt"), history);

        } catch (IOException ex) {
            Logger.getLogger(Laskin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Lukee sovelluksen ulkopuolisen tekstitiedoston syötteen.
     *
     * @return Palauttaa tekstitiedoston sisällön String-merkkijonona.
     */
    public String readHistory() {
        try {
            File file = new File("HISTORY.txt");
            String history = FileUtils.readFileToString(file);
            return history;
        } catch (IOException ex) {
            Logger.getLogger(Laskin.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
