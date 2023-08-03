
import java.util.Scanner;

public class hotel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();//diÃ¡ria dia 1
        int A = in.nextInt();//aumento
        int N = in.nextInt();//chegada
        int estadia = 32 - N;//32 pq a diaria do dia tbm conta
        int diaria = 0;
        int valor = 0;
        int dia = 0;
        while (dia <= 16) {
            diaria = D + 14 * A;
            dia++;
        }
        valor = diaria * estadia;
        if (N == 1) {
            valor = D * estadia;
        }   
        System.out.println(valor);
    }
}
