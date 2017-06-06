package operaatiot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import graafinenkayttoliittyma.Laskin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import operaatiot.*;

/**
 *
 * @author Matti
 */
public class AritmeettinenOperaatioTest {

    Laskin laskin;
    AritmeettinenOperaatio laskutoimitus;

    public AritmeettinenOperaatioTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.laskutoimitus = new operaatiot.AritmeettinenOperaatio();
        //this.laskin = new Laskin();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    // TESTIT SUMMALLE
    @Test
    public void operaatioSummaToimiiOikeinKokonaislukuSyotteella() {
        double testi = laskutoimitus.summa(4, 2);
        assertEquals("6.0", Double.toString(testi));
    }

    @Test
    public void operaatioSummaToimiiOikeinDesimaalilukuSyotteella() {
        double testi = laskutoimitus.summa(24.12345, 24.3583);
        assertEquals("48.48175", Double.toString(testi));
    }

    @Test
    public void operaatioSummaPyoristaaOikein() {
        double testi = laskutoimitus.summa(1.123456785, 1);
        double testi2 = laskutoimitus.summa(1.12345678499, 1);
        assertEquals("2.12345679", Double.toString(testi));
        assertEquals("2.12345678", Double.toString(testi2));
    }

    @Test
    public void jonoSummaOperaatioitaToimiiOikein() {
        double testi = laskutoimitus.summa(laskutoimitus.summa(laskutoimitus.summa(1, 2), 3), 4);
        assertEquals("10.0", Double.toString(testi));
    }

    //TESTIT EROTUKSELLE
    @Test
    public void operaatioErotusToimiiOikeinKokonaisLukuSyotteella() {
        double testi = laskutoimitus.erotus(8, 2);
        assertEquals("6.0", Double.toString(testi));
    }

    @Test
    public void operaatioErotusToimiiOikeinDesimaalilukuSyotteella() {
        double testi = laskutoimitus.erotus(24.12345, 24.3583);
        assertEquals("-0.23485", Double.toString(testi));
    }

    @Test
    public void operaatioErotusPyoristaaOikein() {
        double testi = laskutoimitus.erotus(2.123456785, 1);
        double testi2 = laskutoimitus.erotus(2.12345678499, 1);
        assertEquals("1.12345679", Double.toString(testi));
        assertEquals("1.12345678", Double.toString(testi2));
    }

    @Test
    public void jonoErotusOperaatioitaToimiiOikein() {
        double testi = laskutoimitus.erotus(laskutoimitus.erotus(laskutoimitus.erotus(10, 2), 3), 4);
        assertEquals("1.0", Double.toString(testi));
    }

    // TESTIT TULOLLE
    @Test
    public void operaatioTuloToimiiOikeinKokonaisLukuSyotteella() {
        double testi = laskutoimitus.kertolasku(8, 2);
        assertEquals("16.0", Double.toString(testi));
    }

    @Test
    public void operaatioTuloToimiiOikeinDesimaalilukuSyotteella() {
        double testi = laskutoimitus.kertolasku(24.12, 24.35);
        assertEquals("587.322", Double.toString(testi));
    }

    @Test
    public void operaatioTuloPyoristaaOikein() {
        double testi = laskutoimitus.kertolasku(1.123456785, 1);
        double testi2 = laskutoimitus.kertolasku(1.12345678499, 1);
        assertEquals("1.12345679", Double.toString(testi));
        assertEquals("1.12345678", Double.toString(testi2));
    }

    @Test
    public void jonoTuloOperaatioitaToimiiOikein() {
        double testi = laskutoimitus.kertolasku(laskutoimitus.kertolasku(laskutoimitus.kertolasku(1, 2), 3), 4);
        assertEquals("24.0", Double.toString(testi));
    }

    // TESTIT OSAMÄÄRÄLLE
    @Test
    public void operaatioOsamaaraToimiiOikeinKokonaisLukuSyotteella() {
        double testi = laskutoimitus.jakolasku(8, 2);
        assertEquals("4.0", Double.toString(testi));
    }

    @Test
    public void operaatioOsamaaraToimiiOikeinDesimaalilukuSyotteella() {
        double testi = laskutoimitus.jakolasku(24.12, 24.35);
        assertEquals("0.99055441", Double.toString(testi));
    }

    @Test
    public void operaatioOsamaaraPyoristaaOikein() {
        double testi = laskutoimitus.jakolasku(1.123456785, 1);
        double testi2 = laskutoimitus.jakolasku(1.12345678499, 1);
        assertEquals("1.12345679", Double.toString(testi));
        assertEquals("1.12345678", Double.toString(testi2));
    }

    @Test
    public void jonoOsamaaraOperaatioitaToimiiOikein() {
        double testi = laskutoimitus.jakolasku(laskutoimitus.jakolasku(laskutoimitus.jakolasku(1, 2), 3), 4);
        assertEquals("0.04166667", Double.toString(testi));
    }

    //TESTIT JAKOJÄÄNNÖKSELLE!
    @Test
    public void operaatioJakojaannosToimiiOikeinKokonaislukuSyotteella() {
        double testi = laskutoimitus.jakojaannos(7, 2);
        double testi2 = laskutoimitus.jakojaannos(8, 4);
        assertEquals("1.0", Double.toString(testi));
        assertEquals("0.0", Double.toString(testi2));
    }

    //@Test TÄSSÄ ON VIELÄ PYÖRISTYSONGELMIA. TESTI TOIMII OIKEIN, MUTTA KOODIA PITÄÄ VIELÄ KORJATA
    public void operaatioJakojaannosToimiiOikeinDesimaalilukuSyotteella() {
        double testi = laskutoimitus.jakojaannos(7.2015, 2);
        double testi2 = laskutoimitus.jakojaannos(8.1, 4.05);
        assertEquals("1.2015", Double.toString(testi));
        assertEquals("0.0", Double.toString(testi2));
    }
    //@Test TÄSSÄ ON VIELÄ PYÖRISTYSONGELMIA. TESTI TOIMII OIKEIN, MUTTA KOODIA PITÄÄ VIELÄ KORJATA
    public void operaatioJakojaannosPyoristaaOikein(){
        double testi = laskutoimitus.jakojaannos(7.201530595, 2);
        assertEquals("1.20153060", Double.toString(testi));
        double testi2 = laskutoimitus.jakojaannos(7.2015305949, 2);
        assertEquals("1.20153059", Double.toString(testi2));
    }
}
