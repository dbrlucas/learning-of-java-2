package tp2;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Exe4 {
	
	public static int entierAleatoire(int a, int b) {
		// Génére un nombre aléatoire.
		return ThreadLocalRandom.current().nextInt(a, b + 1);
	}

	public static void main(String[] args) {
		// Demande à l'utilisateur de deviner un nombre aléatoire entre 1 et 100.
		int r = entierAleatoire(1,100);
		System.out.print("Entrez un nombre entier entre 1 et 100 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		while (i != 1) {
			if (n < r) {
				System.out.println("Trop petit !");
				System.out.print("Entrez un nombre entier entre 1 et 100 : ");
				sc = new Scanner(System.in);
				n = sc.nextInt();
			}	
			if (n > r) {
				System.out.println("Trop grand !");
				System.out.print("Entrez un nombre entier entre 1 et 100 : ");
				sc = new Scanner(System.in);
				n = sc.nextInt();
			}
			if (n == r) {
				System.out.println("Gagné !");
				i = 1;
			}
		}
		sc.close();
	}
}