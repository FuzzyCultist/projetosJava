//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("insira a sua nota (de 0 a 100)");
        int nota = entrada.nextInt();

        while (nota > 100 || nota < 0) {
            System.out.println("insira uma nota valida");
            int novanota = entrada.nextInt();
            
                if (novanota >= 90 && novanota <= 100){
                    System.out.println(String.format("A sua nota %d, possui o conceito: A, e voce esta aprovado ", novanota));
                }
                else if (novanota >= 75 && novanota<90){
                    System.out.println(String.format("A sua nota %d, possui o conceito B, e voce esta aprovado  ",novanota));
                }
                else if (novanota >= 60 && novanota < 75){
                    System.out.println(String.format("A sua nota %d, possui o conceito C, e voce foi aprovado por pouco ",novanota));
                }
                else if (novanota < 60 && novanota == 0 ){
                    System.out.println(String.format("A sua nota %d, possui o conceito D, e voce foi reprovado", novanota));
                    
                } 
            break;
        };
        entrada.close();

    }
}
