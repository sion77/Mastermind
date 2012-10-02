package modele;

import java.util.ArrayList;

public class Partie {

	private boolean multi;
	private int nbCouleurs;
	private int nbLignes;
	private int nbTrous;
	
	private boolean partieGagnee;
	private boolean partiePerdue;
	
	private ArrayList<Essai> essais;
	private Serie serieMere;
	
	public Partie(boolean multi, boolean vide, int nbCouleurs, int nbLignes, int nbTrous){
		this.multi=multi;
		this.nbCouleurs=nbCouleurs;
		this.nbLignes=nbLignes;
		this.nbTrous=nbTrous;
		
		partieGagnee=false;
		partiePerdue=false;
		
		essais=new ArrayList<Essai>();
		
		serieMere=genereSerie();
	}
	
	private Serie genereSerie(){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i<nbCouleurs; i++){
			temp.add(i);
		}
		
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		for(int i=0; i<nbTrous; i++){
			int temp3=(int) (Math.random()*(nbCouleurs-i));
			temp2.add(temp.get(temp3));
			if(!multi) temp.remove(temp3);
		}
		
		Serie s = new Serie(temp2);
		return s;
	}
	
	public void nouvelEssai(Serie s){
		essais.add(new Essai(s));
		essais.get(essais.size()).soumettre(serieMere);
		if(essais.get(essais.size()).getSerieJuste()) partieGagnee=true;
		if(essais.size()==nbLignes) partiePerdue=true;
	}
	
	public boolean getPartieGagnee(){
		return partieGagnee;
	}
	
	public boolean getPartiePerdue(){
		return partiePerdue;
	}
	
}
