import java.util.Random;
import java.util.Scanner;
public class ModificaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        System.out.println("Array iniziale:");
        stampaArray(array);

        int posizione;
        do {
            try {
                System.out.print("\nInserisci la posizione da modificare (1-5, 0 per uscire): ");
                posizione = scanner.nextInt();

                if (posizione == 0) {
                    break;
                }

                if (posizione < 1 || posizione > 5) {
                    System.out.println("Inserisci un numero tra 1 e 5 o 0 per uscire.");
                    continue;
                }

                System.out.print("Inserisci il nuovo valore: ");
                int nuovoValore = scanner.nextInt();

                array[posizione - 1] = nuovoValore;

                System.out.println("Nuovo stato dell'array:");
                stampaArray(array);
            } catch (Exception e) {
                System.out.println("Errore: Input non valido!");
                scanner.nextLine();
            }
        } while (true);

        System.out.println("Programma terminato.");
    }
    private static void stampaArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
