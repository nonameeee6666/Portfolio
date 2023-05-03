package matrizes;

import java.util.Arrays;

public class Matrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, 
                          {4, 5, 6}, 
                          {7, 8, 9}};
        printlnM(matriz);
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                print(matriz[linha][coluna] + " ");
            }
            enter();
        }
        determinante(matriz);
    }    
    //classe determinante
    public static void determinante(int[] [] matriz){
    int resultado = ( (matriz[0][0]*matriz[1][1]*matriz[2][2])+
                      (matriz[0][1]*matriz[1][2]*matriz[2][0])+
                      (matriz[0][2]*matriz[1][0]*matriz[2][1]))-
                      ((matriz[2][0]*matriz[1][1]*matriz[0][2])+
                      (matriz[2][1]*matriz[1][2]*matriz[0][0])+
                      (matriz[2][2]*matriz[1][0]*matriz[0][1]));
    println(resultado);
    }
    
    //funções de redução
    public static void enter(){
    System.out.println();
    }
    public static void print(String msg){
    System.out.print(msg);
    }
    public static void println(int msg){
    System.out.println(msg);
    }
     public static void printlnM(int [][] msg){
    System.out.println(Arrays.toString(msg));
    }
}
