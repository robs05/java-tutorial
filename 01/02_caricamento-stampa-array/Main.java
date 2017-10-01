import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	    int n = 0;
      final int N_MAX = 100;
	    int a[] = new int[N_MAX];

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try {
          do {
              System.out.println("Inserisci n");
              n = Integer.parseInt(reader.readLine());
              if(n > N_MAX) {
                  System.out.println("Inserisci n <= 100");
              }
          } while (n > N_MAX);

          // caricamento vettore
          for (int i = 0; i < n; i++) {
              System.out.println("Inserisci l'elemento a[" + i + "]");
              a[i] = Integer.parseInt(reader.readLine());
          }

          // stampa vettore
          for (int i = 0; i < n; i++) {
              System.out.print(a[i] + " ");
          }
          System.out.println();

      } catch (IOException e) {
          e.printStackTrace();
      }
    }
}
