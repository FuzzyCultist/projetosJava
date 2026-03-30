//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira a base de seu retangulo");
        double base = entrada.nextDouble();
        System.out.println("insira a altura de seu retangulo");
        double altura = entrada.nextDouble();
        double area = (base*altura);
        System.out.print(String.format("a area do triangulo se mede com o valor da base %.2f vezes a altura %.2f\n a area do seu retangulo é %.2f", base, altura, area ));
        entrada.close();
    }
}
