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
public class OperaatioTest {
    Operaatio operaatio;
    public OperaatioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        this.operaatio = new Operaatio("");
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
    public void operoiAMetodiToimiiPlusSyotteella(){
        this.operaatio = new Operaatio("+");
        String testi1 = operaatio.operoiA(2,4);
        String testi2 = operaatio.operoiA(5.2345,-4);
        assertEquals("6.0",testi1);
        assertEquals("1.2345",testi2);
    }
    @Test
    public void operoiAMetodiToimiiErotusSyotteella(){
        this.operaatio = new Operaatio("-");
        String testi1 = operaatio.operoiA(2,4);
        String testi2 = operaatio.operoiA(5.2345,-4);
        assertEquals("-2.0",testi1);
        assertEquals("9.2345",testi2);
    }
    @Test
    public void operoiAMetodiToimiiTuloSyotteella(){
        this.operaatio = new Operaatio("*");
        String testi1 = operaatio.operoiA(2,4);
        String testi2 = operaatio.operoiA(5.2345,-4);
        assertEquals("8.0",testi1);
        assertEquals("-20.938",testi2);
    }
    @Test
    public void operoiAMetodiToimiiOsamaaraSyotteella(){
        this.operaatio = new Operaatio("/");
        String testi1 = operaatio.operoiA(2,4);
        String testi2 = operaatio.operoiA(5.2345,-4);
        assertEquals("0.5",testi1);
        assertEquals("-1.308625",testi2);
    }
    @Test
    public void operoiAMetodiToimiiJakojaannosSyotteella(){
        this.operaatio = new Operaatio("%");
        String testi1 = operaatio.operoiA(5,4);
        String testi2 = operaatio.operoiA(5.4,2);
        assertEquals("1.0",testi1);
        assertEquals("1.4",testi2);
    }
    @Test
    public void operoiAMetodiToimiiPotenssiSyotteella(){
        this.operaatio = new Operaatio("^");
        String testi1 = operaatio.operoiA(2,4);
        String testi2 = operaatio.operoiA(5.2,2);
        assertEquals("16.0",testi1);
        assertEquals("27.04",testi2);
    }
    @Test
    public void operoiAMetodiToimiiTyhjallaSyotteella(){
        this.operaatio = new Operaatio("");
        String testi1 = operaatio.operoiA(2,4);
        String testi2 = operaatio.operoiA(5.2345,-4);
        assertEquals("Operaatiota ei ole annettu",testi1);
        assertEquals("Operaatiota ei ole annettu",testi2);
    }
}
