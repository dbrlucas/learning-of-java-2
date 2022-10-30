package tp2;

public class Exe2 {
	
	public static void main(String[] args) {
		// Affiche la table de conversion entre les degrés Fahrenheit et Celsius de 250 à -20 degrés F, par palier de 10 degrés.
		double f = 250;
		double c = 0;
		while (f >= -20) {
			c = ((5.0/9.0)*f-160.0/9.0);
			System.out.println(f+" degrés F ---> "+c+" degrés C");
			f = f - 10;
		}
	}
}