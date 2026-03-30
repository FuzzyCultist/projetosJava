//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insisra um numero (digite 0 para encerrar)");
        int numero = entrada.nextInt();
        int base  = 0;
        while (numero !=0 ) {
        base += numero;
        System.out.println("insisra um numero (digite 0 para encerrar)");
        numero = entrada.nextInt();
                
        }
        System.out.println("a soma dos numeros é "+ base);
entrada.close();    
    }

}