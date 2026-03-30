//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
       System.out.println("insira seu numero para a contagem");
       int numero = entrada.nextInt();
       int base = 1;
       if (numero == 0){
        System.out.println(String.format("O numero %d é invalido para a contagem"));
       } else{
        while (base <= numero ) {
            System.out.print(base + ",");
            base ++;
        }
       }
       entrada.close();





    }
}
