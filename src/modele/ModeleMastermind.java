package modele;

import java.util.ArrayList;
import java.util.Scanner;

public class ModeleMastermind {

	private Partie p;
	
	private boolean multi;
	private int nbCouleurs;
	private int nbLignes;
	private int nbTrous;
	
	public ModeleMastermind(){
		multi=false;
		nbCouleurs=8;
		nbLignes=10;
		nbTrous=4;
		p=new Partie(multi, nbCouleurs, nbLignes, nbTrous);
	}
	
	public void nvllePartie(){
		p=new Partie(multi, nbCouleurs, nbLignes, nbTrous);
	}
	
	public void nvlleSerie(ArrayList<Integer> s){
		p.nouvelEssai(s);
	}
	
	public void setMulti(boolean multi){
		this.multi=multi;
	}
	
	public void setNbCouleurs(int nbCouleurs){
		this.nbCouleurs=nbCouleurs;
	}
	
	public void setNbLignes(int nbLignes){
		this.nbLignes=nbLignes;
	}
	
	public void setNbTrous(int nbTrous){
		this.nbTrous=nbTrous;
	}
	
	public boolean getMulti(){
		return multi;
	}
	
	public int getNbCouleurs(){
		return nbCouleurs;
	}
	
	public int getNbLignes(){
		return nbLignes;
	}
	
	public int getNbTrous(){
		return nbTrous;
	}
	
	public ArrayList<Integer> getDerniersPions(){
		return p.getDerniersPions();
	}
	
	public boolean getPartieTerminée(){
		return p.getPartieGagnee()||p.getPartiePerdue();
	}
	
	public static void main(String[] args){
		ModeleMastermind m = new ModeleMastermind();
		System.out.println("Début du jeu");
		do {
			ArrayList<Integer> tab = new ArrayList<Integer>();
			for(int i=0; i<m.getNbTrous(); i++){
				Scanner in = new Scanner(System.in);
				int k = in.nextInt();
				tab.add(k);
			}
			m.nvlleSerie(tab);
			ArrayList<Integer> tab2 = m.getDerniersPions();
			System.out.print("\t");
			do{
				System.out.print(tab2.get(0));
				tab2.remove(0);
			}while(!tab2.isEmpty());
			
		}while(m.getPartieTerminée());
	}
}
