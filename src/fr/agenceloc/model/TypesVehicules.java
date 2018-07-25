package fr.agenceloc.model;

public abstract class TypesVehicules {
	protected String types;
	protected String marque;
	protected String modele;
	protected double prixJour;
	protected int nbVehicule;
	protected int dureeLoc;
	
	
	public TypesVehicules(String type, String marque, String modele, double prixJour, int nbVehicule, int dureeLoc) {
		super();
		this.types = type;
		this.marque = marque;
		this.modele = modele;
		this.prixJour = prixJour;
		this.nbVehicule = nbVehicule;
		this.dureeLoc = dureeLoc;
	}
	@Override
	public String toString() {
		return "TypesVehicules [type=" + types + ", marque=" + marque + ", modele=" + modele + ", prixJour=" + prixJour
				+ ", nbVehicule=" + nbVehicule + ", dureeLoc=" + dureeLoc + "]";
	}
	
	abstract String getType();
	
	public String getTypes() {
		return types;
	}
	public void setTypes(String type) {
		this.types = type;
	}
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
