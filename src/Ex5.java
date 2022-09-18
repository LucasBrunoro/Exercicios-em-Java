import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        int n1 = sc.nextInt();
        System.out.print("Digite sua segunda nota: ");
        int n2 = sc.nextInt();
        System.out.print("Digite sua terceira nota: ");
        int n3 = sc.nextInt();
        int media = (n1+n2+n3)/3;
        System.out.println("Sua media é " + media);
        if (media>=7&&media<10)
        {System.out.print("Voce foi aprovado");}
        else if (media<7&&media>=3)
        {System.out.print("Voce está de exame e precisa tirar: " + (12 - media));}
        else if (media>0&&media<3)
        {System.out.print("Voce foi reprovado");}
        

    }
}
