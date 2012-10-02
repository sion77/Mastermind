package modele;

public abstract class Couleur {
	
	public static final int VIDE=0;
	public static final int ROUGE=1;
	public static final int JAUNE=2;
	public static final int VERT=3;
	public static final int BLEU=4;
	public static final int ORANGE=5;
	public static final int BLANC=6;
	public static final int VIOLET=7;
	public static final int FUCHSIA=8;
	
	public static String getCouleur(int couleur){
		String code;
		switch(couleur){
		case VIDE :
			code="#888888";
		case ROUGE :
			code="#000000";
		case JAUNE :
			code="#000000";
		case VERT :
			code="#000000";
		case BLEU :
			code="#000000";
		case ORANGE :
			code="#000000";
		case BLANC :
			code="#000000";
		case VIOLET :
			code="#000000";
		case FUCHSIA :
			code="#000000";
		default :
			code="#888888";
		}
		return code;
	}

}
