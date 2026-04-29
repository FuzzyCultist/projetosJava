//anderson vitorio dos santos pupo muniz 
//1261933588
import java.util.*;
public class App {
    public int imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 5; // Tamanho do array
        int[] array = new int[tamanho];
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }
        App app = new App();
        System.out.println("Elementos do array: ");
        app.imprimirArray(array);
    }
}
