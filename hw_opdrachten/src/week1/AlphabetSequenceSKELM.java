import java.util.Scanner;

public class AlphabetSequence {
  public static void main(String[] args) {
    final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter the number of rows for the pattern: ");
      int rows = scanner.nextInt();

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j <= i; j++) {
          System.out.print(alphabet.charAt(j % 26)); // Bij > 26: wrap around
        }
        System.out.println();
      }

      System.out.println("Wil je nog een keer? J voor Ja, N voor Nee");
      char choice = scanner.next().charAt(0);
      if (choice == 'n' || choice == 'N') {
        break;
      }
    }
  }
}
