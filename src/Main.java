import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] x = new double[100];

        for (int u = 0; u < 100; u++)
            x[u]=sc.nextDouble();

        for (int i = 0; i < 100; i++)
            if (x[i] <= 10.0)
                System.out.printf("A[%d] = %.1f\n",i,x[i]);

        sc.close();
    }
}