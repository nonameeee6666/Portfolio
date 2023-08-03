
import java.util.Scanner;

public class bombom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c1 = in.nextLine(); //naipe dominante +4
        String c2 = in.nextLine();
        String c3 = in.nextLine();
        String c4 = in.nextLine();
        String c5 = in.nextLine();
        String c6 = in.nextLine();
        String c7 = in.nextLine();
        String[] arrayc1 = c1.split("(?!^)");
        String[] arrayc2 = c2.split("(?!^)");
        String[] arrayc3 = c3.split("(?!^)");
        String[] arrayc4 = c4.split("(?!^)");
        String[] arrayc5 = c5.split("(?!^)");
        String[] arrayc6 = c6.split("(?!^)");
        String[] arrayc7 = c7.split("(?!^)");
        //cartas 2, 3, 4 = luana 5, 6 e 7 edu

        String[] numslu = {arrayc2[0], arrayc3[0], arrayc4[0]}; //cartas de num da lu
        String[] naipelu = {arrayc2[1], arrayc3[1], arrayc4[1]}; //naipe da lu

        String[] numsed = {arrayc5[0], arrayc6[0], arrayc7[0]}; //cartas edu
        String[] naiped = {arrayc5[1], arrayc6[1], arrayc7[1]}; //naipe edu


        int pontluana = 0;
        int pontedu = 0;
        int cont = 0; //conta qual carta é
        int cont2 = 0; //var para cada vez
        String dom = arrayc1[1]; //1° naipe é o dominante
        String[] naipe = {"A", "J", "Q", "K"};
        int valnaipe = 0;

        while (cont <= 3) {
            if ("A".equals(naipe[cont])) {
                valnaipe = 10;
            }
            if ("J".equals(naipe[cont])) {
                valnaipe = 11;
            }
            if ("Q".equals(naipe[cont])) {
                valnaipe = 12;
            }
            if ("K".equals(naipe[cont])) {
                valnaipe = 13;
            }
            if (dom.equals(naiped[cont2])) {
                        pontedu = pontedu + 4;
                    }
             if (dom.equals(naipelu[cont2])) {
                        pontluana = pontluana + 4;
                    }
            while (cont2 <= 2) {
                if (naipe[cont].equals(numslu[cont2])) {
                    pontluana = pontluana + valnaipe;
                }

                if (naipe[cont].equals(numsed[cont2])) {
                    pontedu = pontedu + valnaipe;
                }
                cont2++;
            }
            cont++;
            cont2 = 0;
        }

        String vencedor = null;
        if (pontedu > pontluana) {
            vencedor = "Edu";
        }

        if (pontedu == pontluana) {
            vencedor = "empate";
        }

        if (pontedu < pontluana) {
            vencedor = "Luana";
        }

        System.out.println(vencedor);
        System.out.println(pontedu);
        System.out.println(pontluana);
    }
}
