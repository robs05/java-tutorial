import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	    int n = 0;
      int tmp = 0;
      int somma = 0;

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      try {
          System.out.println("Inserisci n (il numero di elementi da sommare)");
          n = Integer.parseInt(reader.readLine());
          while(n > 0) {
              System.out.println("Inserisci un numero");
              tmp = Integer.parseInt(reader.readLine());
              somma = somma + tmp;
              n--;
          }
          System.out.println("La somma dei numeri inseriti e' " + somma);


      } catch (IOException e) {
          e.printStackTrace();
      }
    }
}
