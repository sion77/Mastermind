package modele;

import java.util.ArrayList;

public class Serie {
	
	private ArrayList<Integer> couleurs;
	
	public Serie(Integer[] couleurs, int taille){
		this.couleurs=new ArrayList<Integer>();
		for(int i=0; i<taille; i++){
			this.couleurs.add(couleurs[i]);
		}
	}
	
	public int getCouleur(int NumCouleur){
		return couleurs.get(NumCouleur);
	}
	
	public ArrayList<Integer> getCouleurs(){
		return couleurs;
	}
	
	public int getTaille(){
		return couleurs.size();
	}
	
	public static ArrayList<Integer> compareSeries(Serie s1, Serie s2){
		ArrayList<Integer> pions = new ArrayList<Integer>();
		ArrayList<Integer> pions2 = new ArrayList<Integer>();
		ArrayList<Integer> pions3 = new ArrayList<Integer>();
		
		for(int i=0; i<s1.getTaille(); i++){
			if(s1.getCouleur(i)==s2.getCouleur(i)) pions.add(2);
			else if(s2.getCouleurs().contains(s1.getCouleur(i))) pions2.add(1);
			else pions3.add(0);
		}
		pions.addAll(pions2);
		pions.addAll(pions3);
		
		return pions;
	}

}
