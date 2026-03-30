//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("bem vindo a calculadora, insira o primeiro numero ");
        double numero1 = entrada.nextDouble();
        System.out.println("insisra o segundo numero da operação ");
        double numero2 = entrada.nextDouble();
        System.out.println("Selecione a operação desejada 1-Soma 2-Subtração 3-Divisão e 4-Multiplicação ");
        int operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                double soma = numero1 + numero2;
                System.out.println(String.format("a Soma dos numeros %.2f e %.2f resulta em %.2f",numero1, numero2, soma ));
                break;
            case 2:
                    double sub = numero1 - numero2;
                    System.out.println(String.format("A Subtração do numero %.2f do numero %.2f resulta em %.2f", numero1, numero2, sub));
                
                break;
            case 3: 
            if (numero1 == 0 ){
                System.out.println(String.format("o numero divisor nao pode ser 0"));
            }else{
                double divisao = numero1 / numero2;
                System.out.println(String.format("A Divisão do numero %.2f pelo numero %.2f resulta em %.2f",numero1, numero2, divisao));
            }
                break;
            case 4:
                double mult = numero1 * numero2;
                System.out.println(String.format("a Multiplicação dos numero %.2f e %.2f resulta em %.2f", numero1, numero2, mult));
                break;
            default:
                System.out.println("A opção selecionada é invalida ");
                break;
        }
        entrada.close();
    }
}