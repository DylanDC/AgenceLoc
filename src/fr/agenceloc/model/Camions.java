package fr.agenceloc.model;

public class Camions extends TypesVehicules {
	private int volumeM3;

	public Camions(String type, String marque, String modele, double prixJour, int nbVehicule, int dureeLoc, int volumeM3) {
		super(type, marque, modele, prixJour, nbVehicule, dureeLoc);
		// TODO Auto-generated constructor stub
		this.setVolumeM3(volumeM3);
	}

	public int getVolumeM3() {
		return volumeM3;
	}

	public void setVolumeM3(int volumeM3) {
		this.volumeM3 = volumeM3;
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "Camion";
	}

}
