package Cycle;


public class Main {
	 public static void main(String[] args) {
		 Velo();
	 }
	static void Velo() {
				// Test Velo classique
		        Velo velo = new Velo(14.0, 26.0);
		        double puissanceVelo = velo.getPuissance(2.5);

		        System.out.println("=== Test Velo ===");
		        System.out.println(velo);
		        System.out.println("Puissance : " + puissanceVelo);

		        // Test Velo électrique
		        VeloElec veloElec = new VeloElec(14.0, 26.0, 20.0);
		        double puissanceVeloElec = veloElec.getPuissance(2.5);

		        System.out.println("\n=== Test VeloElec ===");
		        System.out.println(veloElec);
		        System.out.println("Puissance : " + puissanceVeloElec);

		        // Test constructeur par défaut
		        VeloElec veloElecDefaut = new VeloElec();
		        System.out.println("\n=== Test VeloElec par défaut ===");
		        System.out.println(veloElecDefaut);
		        System.out.println("Puissance : " + veloElecDefaut.getPuissance(2.5));
	}
}

