package it.gaetano.models;

public class CentroControllo {
	
	int numComunicazioni = 0;

	public void comunicazione(Sonda sonda) {
			
		String urlAllarme = String.format("http://host/alarm?=idsonda=%d&lat=%d&lon=%d&smokelevel=%d",
				sonda.getId_sonda(), sonda.getLatitudine(), sonda.getLongitudine(), sonda.getLivelloFumo());
	
			System.out.println("Allarme incendio scattato alla sonda " + sonda.getId_sonda());
			System.out.println("URL ALLARME: " + urlAllarme);
			
			numComunicazioni++;
	}

	public int getNumComunicazioni() {
		return numComunicazioni;
	}

	
}
