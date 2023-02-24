package it.gaetano.models;

public class Sonda {
	
	private int id_sonda;
	private long latitudine;
	private long longitudine;
	private int livelloFumo;
	
	
	
	
	public Sonda(int id_sonda, long latitudine, long longitudine, int livelloFumo) {
		this.id_sonda = id_sonda;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.livelloFumo = livelloFumo;
	}
	
	
	public int getId_sonda() {
		return id_sonda;
	}
	public void setId_sonda(int id_sonda) {
		this.id_sonda = id_sonda;
	}
	public long getLatitudine() {
		return latitudine;
	}
	public void setLatitudine(long latitudine) {
		this.latitudine = latitudine;
	}
	public long getLongitudine() {
		return longitudine;
	}
	public void setLongitudine(long longitudine) {
		this.longitudine = longitudine;
	}
	public int getLivelloFumo() {
		return livelloFumo;
	}
	public void setLivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
	}
	

}
