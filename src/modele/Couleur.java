package modele;

public abstract class Couleur {
	
	public static final int ROUGE=0;
	public static final int JAUNE=1;
	public static final int VERT=2;
	public static final int BLEU=3;
	public static final int ORANGE=4;
	public static final int BLANC=5;
	public static final int VIOLET=6;
	public static final int FUCHSIA=7;
	public static final int VIDE=8;
	
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
