//anderson vitorio dos santos pupo muniz 
//1261933588

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro lado do triangulo ");
        int lado1 = entrada.nextInt();
        System.out.println("insira o segundo lado do triangulo ");
        int lado2 = entrada.nextInt();
        System.out.println("insira o terceiro lado do triangulo ");
        int lado3 = entrada.nextInt();
        if (lado1 == lado2 && lado2 == lado3);{
            System.out.println("o triangulo é Equilatero");
        } if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3 ){
            System.out.println("este triangulo é Isoceles");
        }
        else{
            System.out.println("este triangulo é escaleno");
        }
        entrada.close();



    }
}
