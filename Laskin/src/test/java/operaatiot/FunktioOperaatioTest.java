/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaatiot;

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
public class FunktioOperaatioTest {
    FunktioOperaatio fo;
    
    public FunktioOperaatioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.fo = new FunktioOperaatio();
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
    public void cosToimiiOikein(){
        double testi1 = fo.cos(0);
        double testi2 = fo.cos(1);
        assertEquals("1.0",String.valueOf(testi1));
        assertEquals("0.5403023058681398",String.valueOf(testi2));
    }
    @Test
    public void sinToimiiOikein(){
       double testi1 = fo.sin(0);
        double testi2 = fo.sin(1);
        assertEquals("0.0",String.valueOf(testi1));
        assertEquals("0.8414709848078965",String.valueOf(testi2)); 
    }
    @Test
    public void tanToimiiOikein(){
       double testi1 = fo.tan(0);
        double testi2 = fo.tan(1);
        assertEquals("0.0",String.valueOf(testi1));
        assertEquals("1.5574077246549023",String.valueOf(testi2)); 
    }
    @Test
    public void nelioToimiiOikein(){
        double testi1 = fo.nelio(157.234);
        double testi2 = fo.nelio(0);
        assertEquals("24722.530756",String.valueOf(testi1));
        assertEquals("0.0",String.valueOf(testi2));
    }
    @Test //Oikealla pyöristyksellä korjaantuu
    public void potenssiToimiiOikein(){
        double testi1 = fo.potenssi(4.2356, 6);
        double testi2 = fo.potenssi(5, 0);
        assertEquals("5774.17095463",String.valueOf(testi1));
        assertEquals("1.0",String.valueOf(testi2));
    }
    @Test
    public void kertomaToimiiOikein(){
        double testi1 = fo.kertoma(10);
        double testi2 = fo.kertoma(0);
        double testi3 = fo.kertoma(-2);
        assertEquals("3628800.0",String.valueOf(testi1));
        assertEquals("1.0",String.valueOf(testi2));
        assertEquals("1.0",String.valueOf(testi3));
    }
    @Test
    public void logToimiiOikein(){
        double testi1 = fo.log(1000000);
        double testi2 = fo.log(1);
        assertEquals("6.0",String.valueOf(testi1));
        assertEquals("0.0",String.valueOf(testi2));
    }
    @Test
    public void sqrtToimiiOikein(){
        double testi1 = fo.log(10000000);
        double testi2 = fo.log(378653854);
        assertEquals("7.0",String.valueOf(testi1));
        assertEquals("8.57824238",String.valueOf(testi2));
    }
    @Test
    public void lnToimiiOikein(){
        double testi1 = fo.ln(1);
        double testi2 = fo.ln(27);
        assertEquals("0.0",String.valueOf(testi1));
        assertEquals("3.29583687",String.valueOf(testi2));
    }
    @Test
    public void opsToimiiOikein(){
        double testi1 = fo.ops(4938762);
        double testi2 = fo.ops(-0.6498539);
        assertEquals("-4938762.0",String.valueOf(testi1));
        assertEquals("0.6498539",String.valueOf(testi2));
    }
    
}
