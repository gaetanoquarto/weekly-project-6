package tests;

import org.junit.Before;
import org.junit.Test;

import it.gaetano.models.CentroControllo;
import it.gaetano.models.ProcessoDiControllo;
import it.gaetano.models.Proxy;
import it.gaetano.models.Sonda;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
public class AppTests {
	
    private ProcessoDiControllo p;

    @Before
    public void setUp() {
        p = new Proxy();
    }
    
    @Test
    public void testComunicazioneBassoLivello() {
    	Sonda s1 = new Sonda(1, 0, 0, 4);
    	List<Sonda> sonda = Arrays.asList(s1);
    	p.comunicazioneAllarme(sonda);
    	
    	CentroControllo ca = ((Proxy) p).getCentroControllo();
    	assertEquals(0, ca.getNumComunicazioni());
    }
    @Test
    public void testComunicazioneAltoLivello() {
    	Sonda s1 = new Sonda(1, 0, 0, 10);
    	List<Sonda> sonda = Arrays.asList(s1);
    	p.comunicazioneAllarme(sonda);
    	
    	CentroControllo ca = ((Proxy) p).getCentroControllo();
    	assertEquals(1, ca.getNumComunicazioni());
    }

    @Test
    public void testComunicazioniMultiple() {
    	Sonda s1 = new Sonda(1, 0, 0, 3);
    	Sonda s2 = new Sonda(2, 0, 0, 4);
    	Sonda s3 = new Sonda(3, 0, 0, 5);
    	List<Sonda> sondeFumoBasso = Arrays.asList(s1, s2, s3);
    	
        Sonda s4 = new Sonda(4, 0, 0, 6);
        Sonda s5 = new Sonda(5, 0, 0, 9);
        Sonda s6 = new Sonda(6, 0, 0, 11);
        List<Sonda> sondeFumoAlto = Arrays.asList(s4, s5, s6);

        p.comunicazioneAllarme(sondeFumoBasso);

        CentroControllo ca = ((Proxy) p).getCentroControllo();
        assertEquals(0, ca.getNumComunicazioni());
        
        p.comunicazioneAllarme(sondeFumoAlto);
        assertEquals(3, ca.getNumComunicazioni());

    }
    
    
	    
	    
}
