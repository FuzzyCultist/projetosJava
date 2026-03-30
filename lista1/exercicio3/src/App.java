//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("digite o valor a ser convertido");
    Double dolar = entrada.nextDouble();
    double reais = dolar*4.95;
    System.out.println( String.format("o valor em dolares $%.2f  \n o valor em reais R$%.2f ",dolar, reais ));
        entrada.close();
    }
}
