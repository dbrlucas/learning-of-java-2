package tp2;
import java.util.Scanner;

public class Exe3 {
	
	public static void main(String[] args) {
		// Demande à l'utilisateur de saisir un entier n >= 1 et affiche la somme des entiers de 1 à n.
		System.out.print("Entrez un nombre entier n >= 1 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String r = "1";
		int i = 1;
		int somme = 1;
		while (i != n) {
			i += 1;
			String c = " + "+i;
			r += c;
			somme += i;
		}
		r += (" = "+somme);
		System.out.println(r);
		sc.close();
	}
}