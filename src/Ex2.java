import java.util.Scanner;
public class Ex2{
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Escreva sua primeira nota: ");
      int n1 = sc.nextInt();
      System.out.print("Escreva o peso da primeira nota: ");
      int p1 = sc.nextInt();
      System.out.print("Escreva sua segunda nota: ");
      int n2 = sc.nextInt();
      System.out.print("Escreva o peso da segunda nota: ");
      int p2 = sc.nextInt();
      System.out.print("Escreva sua terceira nota: ");
      int n3 = sc.nextInt();
      System.out.print("Escreva o peso da terceira nota: ");
      int p3 = sc.nextInt();
      System.out.print("sua media final é: " + (n1*p1 + n2*p2 + n3*p3)/(p1 + p2 + p3));


    }
}

