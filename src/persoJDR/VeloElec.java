package persoJDR;

public class VeloElec extends Velo {
	  private static double DEFAULT_FACTEUR_PUISSANCE_MOTEUR = 15.0;

	    private double facteurPuissanceMoteur;

	    public static double getDEFAULT_FACTEUR_PUISSANCE_MOTEUR() {
	        return DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
	    }

	    public static void setDEFAULT_FACTEUR_PUISSANCE_MOTEUR(double value) {
	        DEFAULT_FACTEUR_PUISSANCE_MOTEUR = value;
	    }

	    public VeloElec(double braquet, double diamRoue, double facteurPuissance) {
	        super(braquet, diamRoue);
	        this.facteurPuissanceMoteur = facteurPuissance;
	    }

	    public VeloElec(double diamRoue, double facteurPuissance) {
	        super();
	        setDiamRoue(diamRoue);
	        this.facteurPuissanceMoteur = facteurPuissance;
	    }

	    public VeloElec() {
	        super();
	        this.facteurPuissanceMoteur = DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
	    }

	    // Getter / Setter
	    public double getFacteurPuissanceMoteur() {
	        return facteurPuissanceMoteur;
	    }

	    public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
	        this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	    }

	    @Override
	    public double getPuissance(double frequenceCoupsDePedale) {
	        return super.getPuissance(frequenceCoupsDePedale) * facteurPuissanceMoteur;
	    }

	    @Override
	    public String toString() {
	        return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "] "
	                + super.toString();
	    }
}

