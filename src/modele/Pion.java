package modele;

public abstract class Pion {
	
	public static final int VIDE=0;
	public static final int BLANC=1;
	public static final int NOIR=2;
	
	public static String getPion(int pion){
		String code;
		switch(pion){
		case VIDE :
			code="#888888";
		case BLANC :
			code="#FFFFFF";
		case NOIR :
			code="#000000";
		default :
			code="#888888";
		}
		return code;
	}

}
