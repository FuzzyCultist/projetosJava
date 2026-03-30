//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro numero ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo numero ");
        double n2 = entrada.nextInt();
        double soma = n1+n2;
        double sub = n1-n2;
        double mul = n1*n2;
        double div = n1/n2;
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A subtração dos números digitados é: "+sub);
        System.out.println("A multiplicação dos números digitados é: "+mul);
        System.out.println("A divisão dos números digitados é: "+div);
        entrada.close();






    }
}
