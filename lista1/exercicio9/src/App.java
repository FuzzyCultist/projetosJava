//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Insira o valor do poduto: ");
        double valor = entrada.nextDouble();
       System.out.println("insira o valor entregue ao caixa");
        double pago = entrada.nextDouble();
        double troco = pago - valor;
       System.out.println(String.format("o troco a ser devolvido para o cliente seria de R$%.2f", troco));
       entrada.close();


    }
}
