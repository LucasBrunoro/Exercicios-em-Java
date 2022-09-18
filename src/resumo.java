import java.util.Scanner;

public class resumo {

  public static void main(String[] args) {

    

    System.out.println("Estruturas de Repetição");



    // Declação de Vetores em Java

    int numeros[] = new int [5];



    numeros[0] = 5;

    numeros[1] = 10;

    numeros[2] = 15;

    numeros[3] = 20;

    numeros[4] = 25;

    

    System.out.println(numeros[0]);

    System.out.println(numeros[1]);

    System.out.println(numeros[2]);

    System.out.println(numeros[3]);

    System.out.println(numeros[4]);



    // Laço de repetição for = PARA

    for (int i = 1; i <=10; i++ ) {

      System.out.println(" A variavel interia i agora vale " + i );

    }



    int tamanho = 10; 

    // Declaração de Vetor

    int v[] = new int [tamanho];



    // Entrada de dados para o vetor

    for ( int i=0; i < tamanho; i++){

      v[i] = i;

    }



    // Saida de dados para o vetor

    for ( int i=0; i < tamanho; i++){

      System.out.println(v[i]);

    }



    Scanner in = new Scanner(System.in);

    int numero = -1;



    // Laço de Repetição WHILE = ENQUANTO

    while ( numero != 10 ) {

      System.out.println("Digito um número: ");

      numero = in.nextInt();

      

      if (numero == 10 ) { 

        System.out.println("Acertou");

      } 

      else { 

        System.out.println("Errou");

      }   

    }

 

  }

}