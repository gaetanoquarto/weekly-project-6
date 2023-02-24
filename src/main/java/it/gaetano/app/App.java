package it.gaetano.app;

import java.util.Arrays;
import java.util.Random;

import it.gaetano.models.ProcessoDiControllo;
import it.gaetano.models.Proxy;
import it.gaetano.models.Sonda;

public class App {

	public static void main(String[] args) {

Random random = new Random();
		
		Sonda s1 = new Sonda(1, random.nextLong(), random.nextLong(), random.nextInt(1,11));
		Sonda s2 = new Sonda(2, random.nextLong(), random.nextLong(), random.nextInt(1,11));
		Sonda s3 = new Sonda(3, random.nextLong(), random.nextLong(), random.nextInt(1,11));
		Sonda s4 = new Sonda(4, random.nextLong(), random.nextLong(), random.nextInt(1,11));
		Sonda s5 = new Sonda(5, random.nextLong(), random.nextLong(), random.nextInt(1,11));
		ProcessoDiControllo p = new Proxy();
		p.comunicazioneAllarme(Arrays.asList(s1, s2, s3, s4, s5));
	}

}
