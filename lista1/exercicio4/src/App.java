//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Favor digite seu salario atual: ");
        double salario = entrada.nextInt();
        double ajuste = 1.07;
        double re = salario * ajuste;
        System.out.println( String.format("o valor em dolares $%.2f  o valor em reais R$%.2f ", salario, re ));
        entrada.close();
    } 
}
