Código feito em aula:

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {//Início do método main
		Scanner bofao = new Scanner(System.in);//Criação do Scanner
		System.out.println("Digite um número");//Mensagem para digitar algo
		int n = bofao.nextInt();//Variável 'n' recebe o valor digitado no Scanner
		int i = 0;//Variável 'i' recebe o valor '0'
		while(i < n){//Enquanto 'i' for menor do que 'n', faça:
		    int j = i;//Variável 'j' recebe o valor da variável 'i'
		    int d = 0;//Variável 'd' recebe o valor '0'
		    while(j > 0){//Enquanto 'j' for maior do que '0', faça:
		        if(i % j == 0){//Se o RESTO da divisão de 'i' por 'j' for 0, faça:
		            d++;//Adicione +1 ao valor da variável 'd'
		        }//Fim do if
		        j--;//Subtrai -1 ao valor da variável 'j'
		    }//Fim do while
		    if(d == 2){//Se o valor da variável 'd' for igual a '2', faça:
		        System.out.println(i);//Mensagem informando o valor de 'i'
		    }//Fim do if
		    i ++;//Adiciona +1 ao valor da variável 'i'
		}//Fim do while
	}//Fim do método main
}
