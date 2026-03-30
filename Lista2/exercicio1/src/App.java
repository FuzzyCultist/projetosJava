//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner entrada = new Scanner (System.in);
      System.out.println("Insira o numero a ser verificado");
      int numero = entrada.nextInt();
      if  (numero % 2 == 0) {
        System.out.println(String.format("o numero %d é par",numero));
      } else {
        System.out.println(String.format("o numero %d é impar", numero));
      };
     entrada.close();   
    }
}
