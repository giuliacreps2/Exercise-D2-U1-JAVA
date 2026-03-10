package conditionals;
import java.util.Scanner;

public class IfElseEs2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un anno e vedi se è bisestile");

        int anno = Integer.parseInt(scanner.nextLine());
        if ((anno % 4 == 0) && (anno % 100 != 0 || anno % 400 == 0)){
//if (anno % 4 == 0 && anno % 400 == 0 && anno % 100 != 0){
    System.out.println("l'anno è bisestile");
} else {
    System.out.println("Puoi tirare un sospiro di sollievo: è un anno normale");
}
    }
    }
