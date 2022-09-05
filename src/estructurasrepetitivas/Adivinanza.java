package estructurasrepetitivas;
import java.util.*;
public class Adivinanza {

	public static void main(String[] args) {
		//Generar un número aleatorio entre 0 y 10
		//Pedirle al usuario que adivine el número
		//Solo se le va a permitir 3 intentos
		Scanner lector = new Scanner(System.in);
		
		long num = Math.round(Math.random() * 10);//random genera un double, round genera un long
		System.out.print("Adivine un numero entre 0 y 10: ");
		int resp = lector.nextInt();
		
		int intentos = 1;
		
		while (num != resp) {
			System.out.println("Lo siento. Numero incorrecto. Vuelva a intentarlo.");
			System.out.print("Adivine un numero entre 0 y 10: ");
			resp = lector.nextInt();
			intentos++;
			
			if(intentos == 3) {
				System.out.println("Ha agotado sus intentos: "+intentos);
				System.exit(intentos);
				//if (num == resp) {
					//System.out.println("Felicidades, adivinaste. El numero es " + num);
					//break;
				}
				//System.out.println("Ha agotado todos los intentos permitidos: " + intentos);
				//break;
			}
		System.out.println("Fin del juego!");
		System.out.println("Has Ganado, la respuesta era: "+num);
		}		
		
	}

