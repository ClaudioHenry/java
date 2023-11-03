import java.util.Scanner;

public class Cateto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o valor do cateto 1: ");
        float cateto1 = entrada.nextFloat();
        System.out.println("Digite o valor do cateto 2: ");
        float cateto2 = entrada.nextFloat();

        float m = cateto1 * cateto1;
        float e = cateto2 * cateto2;
        float i = m + e;

        System.out.println("O valor da hipotenusa é: " + i);
    }
}
