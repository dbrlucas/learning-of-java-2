package tp2;

public class Exe1 {
	
	public static void main(String[] args) {
		// Initialise une variable x de type double à 0, ajoute 10 fois 0.1 à x et affiche le résultat intermédiaire à chaque itération.
		double x = 0;
		for (int i = 0;i < 10;i++) {
			x = x + 0.1;
			System.out.println(x);
		}
	}
}