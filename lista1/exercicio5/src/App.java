//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira sua primeira nota ");
        double n1 = entrada.nextDouble();
        System.out.println("insira sua segunda nota");
        double n2 = entrada.nextDouble();
        System.out.println("insira sua terceira nota");
        double n3 = entrada.nextDouble();
        double media = (n1+n2+n3)/3;
        System.out.println(String.format("as notas: \n %.2f \n %.2f\n %.2f\n possuem como media: %.2f",n1,n2,n3,media));
        entrada.close();
    }
}
