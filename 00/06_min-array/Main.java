import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	    int n = 0;
      final int N_MAX = 100;
	    int a[] = new int[N_MAX];
	    int min = Integer.MAX_VALUE;

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try {
          do {
              System.out.println("Inserisci n");
              n = Integer.parseInt(reader.readLine());
              if(n > N_MAX) {
                  System.out.println("Inserisci n <= 100");
              }
          } while (n > N_MAX);

          // caricamento array
          for (int i = 0; i < n; i++) {
              System.out.println("Inserisci l'elemento a[" + i + "]");
              a[i] = Integer.parseInt(reader.readLine());
              // per risparmiare un ciclo for
              /*
              if(a[i] < min) {
                  min = a[i];
              }
              */
          }

          for (int i = 0; i < n; i++) {
              if(a[i] < min) {
                  min = a[i];
              }
          }

          System.out.println("Il minimo e' " + min);

      } catch (IOException e) {
          e.printStackTrace();
      }
    }
}
