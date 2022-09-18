import java.util.Scanner;
public class Ex1{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Soma de 4 numeros");
        System.out.print("Escreva um numero: ");
        int n1 = sc.nextInt();
        System.out.print("Escreva um numero: ");
        int n2 = sc.nextInt();
        System.out.print("Escreva um numero: ");
        int n3 = sc.nextInt();
        System.out.print("Escreva um numero: ");
        int n4 = sc.nextInt();
        System.out.println("O valor da soma é " + (n1+n2+n3+n4));

    }
}
