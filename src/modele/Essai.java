package modele;

import java.util.ArrayList;

public class Essai {
	
	private Serie serie;
	private ArrayList<Integer> pions;
	private boolean serieJuste;
	
	public Essai(Serie s){
		this.serie=s;
		serieJuste=false;
	}
	
	public void soumettre(Serie s){
		pions=Serie.compareSeries(serie,  s);
		if(!pions.contains(1)&&!pions.contains(0)) serieJuste=true;
	}
	
	public Serie getSerie(){
		return serie;
	}
	
	public ArrayList<Integer> getPions(){
		return pions;
	}
	
	public boolean getSerieJuste(){
		return serieJuste;
	}
	
	

}
