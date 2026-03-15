//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("favor insira a distancia entre as duas cidades ");
          double distancia = entrada.nextDouble();
        System.out.println("agora insira a velocidade media do veiculo ");
          double velocidade = entrada.nextDouble();
          double media = distancia/velocidade;
          double horas = (int) media;
          double minutos = (int) ((media - horas ) *60);
          System.out.println(String.format("tempo estimado de viagem sera de %.0f horas e %.0f minutos!", horas, minutos));
          entrada.close();


    }
}
