package conditionals;
import java.util.Scanner;

public class SwitchE3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");

        int numeroIntero = Integer.parseInt(scanner.nextLine());

        switch (numeroIntero) {
            case 1: {
                System.out.println("Uno");
				break;
            }
            case 2: {
                System.out.println("Due");
                break;
            }
            case 3: {
                System.out.println("Tre");
                break;
            }
            default: {
				System.out.println("Numero troppo lungo per essere scritto");
				break; // Se il default è messo per ultimo il break è opzionale
			}



        }

    }
}
