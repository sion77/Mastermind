package modele;

import java.util.ArrayList;

public class Essai {
	
	private Serie serie;
	private ArrayList<Integer> pions;
	
	public Essai(Serie s){
		this.serie=s;
	}
	
	public void soumettre(Serie s){
		pions=Serie.compareSeries(serie,  s);
	}
	
	public Serie getSerie(){
		return serie;
	}
	
	public ArrayList<Integer> getPions(){
		return pions;
	}
	
	

}
