//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = entrada.nextInt();
        int resto = n1%n2;
        System.out.println( String.format("O resto de divisão entre %d e %d é de: %d ", n1, n2, resto ));
        entrada.close();
    }
}
