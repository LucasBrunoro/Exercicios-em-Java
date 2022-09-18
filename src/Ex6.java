import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1...VERDE....");
        System.out.println("2...AZUL.....");
        System.out.println("3...VERMELHO.");
        System.out.println("4...PRETO....");
        System.out.println("5...BRANCO...");
        System.out.println("6...CINZA....");
        System.out.print("Escolha uma cor de acordo com o numero: ");
        int nmr = sc.nextInt();

        switch(nmr){
        case 1: 
        System.out.print("Voce escolheu o verde");
        break;
        case 2: 
        System.out.print("Voce escolheu o azul");
        break;
        case 3: 
        System.out.print("Voce escolheu o vermelho");
        break;
        case 4: 
        System.out.print("Voce escolheu o preto");
        break;
        case 5: 
        System.out.print("Voce escolheu o branco");
        break;
        case 6: 
        System.out.print("Voce escolheu o cinza");
        break;       
        }
    }
}
