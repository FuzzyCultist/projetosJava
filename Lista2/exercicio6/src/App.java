//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int base = 0;
        System.out.println("insira o numero para que seja montada a tabuada");
        int numero = entrada.nextInt();
        
        while (base <= 10 && base >= 0 ) {
            int result = base * numero;
            System.out.println(String.format("%d X %d = %d",base, numero, result));
            base ++;
        }
        


entrada.close();
    }
}
