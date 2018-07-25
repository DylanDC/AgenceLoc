package fr.agenceloc.model;

public abstract class TypesVehicules {
	private String marque;
	private String modele;
	private double prixJour;
	private int nbVehicule;
	private int dureeLoc;
	
	
	public TypesVehicules( String marque, String modele, double prixJour, int nbVehicule, int dureeLoc) {
		super();
		
		this.marque = marque;
		this.modele = modele;
		this.prixJour = prixJour;
		this.nbVehicule = nbVehicule;
		this.dureeLoc = dureeLoc;
	}
	@Override
	public String toString() {
		return "TypesVehicules [ marque=" + marque + ", modele=" + modele + ", prixJour=" + prixJour
				+ ", nbVehicule=" + nbVehicule + ", dureeLoc=" + dureeLoc + "]";
	}
	
	abstract String getType();
	
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public double getPrixJour() {
		return prixJour;
	}
	public void setPrixJour(double prixJour) {
		this.prixJour = prixJour;
	}
	public int getNbVehicule() {
		return nbVehicule;
	}
	public void setNbVehicule(int nbVehicule) {
		this.nbVehicule = nbVehicule;
	}
	public int getDureeLoc() {
		return dureeLoc;
	}
	public void setDureeLoc(int dureeLoc) {
		this.dureeLoc = dureeLoc;
	}
	
	
	
	

}
