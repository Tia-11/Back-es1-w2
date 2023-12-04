import java.util.Scanner;
public class CalcolaConsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci i chilometri percorsi: ");
            double kmPercorsi = scanner.nextDouble();

            System.out.print("Inserisci i litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();

            if (litriConsumati == 0) {
                throw new ArithmeticException("Errore: Impossibile dividere per zero (divisione per numero di litri = 0)");
            }

            double kmPerLitro = kmPercorsi / litriConsumati;

            System.out.println("I chilometri per litro percorsi sono: " + kmPerLitro);
        } catch (ArithmeticException e) {
            System.out.println("Errore: Impossibile dividere per zero (divisione per numero di litri = 0)");
        } catch (Exception e) {
            System.out.println("Errore: Input non valido!");
        }
    }
}
