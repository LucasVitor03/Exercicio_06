import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        float raio = 0.00f;
        float pi = 3.14f;
        float area = 0.00f;

        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextFloat();

        area = pi * (raio * raio);

        System.out.println("A área do círculo é: " + area);

        sc.close();

    }
}
