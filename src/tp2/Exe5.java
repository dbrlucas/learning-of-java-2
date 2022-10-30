package tp2;
import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		// Demande à l'utilisateur de saisir un entier h >= 1 et affiche des figures dont la longueur et la largeur sont définis par h.
		System.out.print("Entrez un nombre entier h >= 1 : ");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		// Figure 1
		System.out.println("\nFigure 1 : ");
		for (int i = h;i>0;i--) {
			for (int j = 0;j<i;j++) {
				System.out.print("X");
			}
			System.out.println("");
		}
		// Figure 2
		System.out.println("\nFigure 2 : ");
		for (int i = h;i>0;i--) {
			System.out.print("X");
		}
		System.out.println("");
		for (int i = h-2;i>0;i--) {
			System.out.print("X");
			for (int j = h-2;j>0;j--) {
				System.out.print("...");
			}
			System.out.println("X");
		}
		for (int i = h;i>0;i--) {
			System.out.print("X");
		}
		// Figure 3
		System.out.println("\n\nFigure 3 : ");
		for (int i = h;i>0;i--) {
			System.out.print("X");
		}
		System.out.println("");
		int l = 1;
		for (int i = h-2;i>0;i--) {
			for (int j = i;j>0;j--) {
				System.out.print("...");
			}
			System.out.print("X");
			for (int k = 0;k<l;k++) {
				System.out.print("...");
			}
			System.out.println("");
			l += 1;
		}
		for (int i = h;i>0;i--) {
			System.out.print("X");
		}
		sc.close();
	}
}