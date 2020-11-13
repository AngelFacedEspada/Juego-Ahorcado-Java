import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		int vidas = 6;
		String palabra = "hola";
		String palabra2 = "";
		String subpalabra[] = new String[4];
		String subpalabra2[] = new String[4];
		subpalabra2[0] = "";
		subpalabra2[1] = "";
		subpalabra2[2] = "";
		subpalabra2[3] = "";
		String vLetra[] = new String[6];
		subpalabra[0] = "h";
		subpalabra[1] = "o";
		subpalabra[2] = "l";
		subpalabra[3] = "a";
		System.out.println("tienes 6 vidas para acertar la palabra");
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < vidas;) {
			do {
				System.out.println("dime una letra");
				vLetra[i] = leer.next();
				if (vLetra[i].equals(subpalabra[0]) || vLetra[i].equals(subpalabra[1]) || vLetra[i].equals(subpalabra[2]) || vLetra[i].equals(subpalabra[3]) ) {
					System.out.println("la letra " + vLetra[i] + " esta en la palabra, tienes " + vidas + " vidas restantes");
					palabra2 = subpalabra2[0] + subpalabra2[1] + subpalabra2[2] + subpalabra[3];
					if (vLetra[i].equals(subpalabra[0])) {
						subpalabra2[0] = vLetra[i];
						System.out.println(vLetra[i]);
						System.out.println("- - - -");
						System.out.println(palabra2);
					}
					if (vLetra[i].equals(subpalabra[1])) {
						subpalabra2[1] = vLetra[i];
						System.out.println("  " + vLetra[i]);
						System.out.println("- - - -");
						System.out.println(palabra2);
					}
					if (vLetra[i].equals(subpalabra[2])) {
						subpalabra2[2] = vLetra[i];
						System.out.println("    " + vLetra[i]);
						System.out.println("- - - -");
						System.out.println(palabra2);
					}
					if (vLetra[i].equals(subpalabra[3])) {
						subpalabra2[3] = vLetra[i];
						System.out.println("      " + vLetra[i]);
						System.out.println("- - - -");
						System.out.println(palabra2);
					}
				} else {
					vidas = vidas - 1;
					System.out.println("la letra " + vLetra[i] + " no esta en la palabra,  tienes " + vidas + " vidas restantes\"");
				}	
			} while ( !palabra2.equals(palabra) && vidas != 0 );
	
		if (vidas == 0) {
			System.out.println("GAME OVER");
		} else {
			System.out.println("Felicidades has acertado la palabra secreta (" + palabra + ")");
		}
		}
			
		
	}

}
