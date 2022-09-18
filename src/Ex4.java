import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
      float media;
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite sua nota do trabalho de laboratorio: ");
      float n1 = sc.nextFloat();
      System.out.print("Digite sua nota da avaliaçao semestral: ");
      float n2 = sc.nextFloat();
      System.out.print("Digite sua nota do exame final: ");
      float n3 = sc.nextFloat();
      media = (n1*2 + n2*3 + n3*5)/10;
      System.out.println("Sua media é :" + media);
      if (media>=8&&media<=10)
      {System.out.printf("Seu conceito é A");}
      else if (media>=7&&media<8)
      {System.out.printf("Seu conceito é B");}
      else if (media>=6&&media<7)
      {System.out.printf("Seu conceito é C");}
      else if (media>=5&&media<6)
      {System.out.printf("Seu conceito é D");}
      else if(media>0&&media<5)
      {System.out.printf("Seu conceito é E");}

  
    }
}
