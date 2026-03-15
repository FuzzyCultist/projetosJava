//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    System.out.println("digite sua temperatura em celcius");
    double c = entrada.nextDouble();
    double k = c + 273.15;
    double f = (c * 9/5) + 32;
    System.out.println(String.format("voce inseriu %.2f C°\n para Fahrenheit: %.2f F°\n para Kelvin %.2f K°",c,f,k));
entrada.close();






    }
}
