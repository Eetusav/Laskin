/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historia;

import graafinenkayttoliittyma.Laskin;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matti
 */
public class HistoriaTest {

    public HistoriaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void writeHistoryToimii() throws IOException {
        try {
            Historia historia = new Historia();
            String history = "HISTORY";
            historia.writeHistory(history);
//        FileUtils.writeStringToFile(new File("HISTORY.txt"), history);
            File file = new File("HISTORY.txt");
            String testi = FileUtils.readFileToString(file);
            assertEquals("HISTORY", testi);
        } catch (IOException ex) {
            Logger.getLogger(Laskin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Test
    public void jonoWriteHistoryToimii() throws IOException {
        Historia historia = new Historia();
        historia.writeHistory("merkkijono");
        assertEquals("merkkijono", historia.readHistory());
        historia.writeHistory("merkkijono2");
        assertEquals("merkkijono2", historia.readHistory());
    }

    @Test
    public void readHistoryToimii() throws IOException {
        try {
            Historia historia = new Historia();
            String history = "HISTORY";
            FileUtils.writeStringToFile(new File("HISTORY.txt"), history);
            String testi = historia.readHistory();
            assertEquals("HISTORY", testi);
        } catch (IOException ex) {
            Logger.getLogger(Laskin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void readHistoryToimiiIlmanHistorya() throws IOException {
        Historia historia = new Historia();
        assertEquals("HISTORY", historia.readHistory());
        historia.writeHistory("testi");
        assertEquals("testi", historia.readHistory());
        FileUtils.writeStringToFile(new File("HISTORY.txt"), "HISTORY");
        assertEquals("HISTORY", historia.readHistory());
    }

//
//    @Test
//    public void writeHistoryThrowExceptionToimii() {
//        Historia historia = new Historia();
//        IOException testi = new IOException("Jotain meni vikaan.");
//        File file = null;
//        assertEquals(testi.getMessage(), historia.readHistory());
//
//    }
}
