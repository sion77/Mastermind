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
	
	public Partie(boolean multi, int nbCouleurs, int nbLignes, int nbTrous){
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
	
	public void nouvelEssai(ArrayList<Integer> s1){
		Serie s2 = new Serie(s1);
		Essai essai = new Essai(s2);
		essai.soumettre(serieMere);
		essais.add(essai);
		if(essai.getSerieJuste()) partieGagnee=true;
		if(essais.size()==nbLignes) partiePerdue=true;
	}
	
	public boolean getPartieGagnee(){
		return partieGagnee;
	}
	
	public boolean getPartiePerdue(){
		return partiePerdue;
	}
	
	public ArrayList<Integer> getDerniersPions(){
		return essais.get(essais.size()-1).getPions();
	}
	
}
