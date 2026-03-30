//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("insita a distancia percorrida em quilometros");
        double km = entrada.nextDouble();
        System.out.println("insira o valor gasto de gasolina em litros");
        double litros = entrada.nextDouble();
        double cm = km/litros;
        System.out.println(String.format("o consumo medio de seu veiculo nesta ultima viagem é de: %.2f",cm));
        entrada.close();



    }
}
