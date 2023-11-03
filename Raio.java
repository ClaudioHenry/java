import java.util.*;

public class Raio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        float raio = entrada.nextFloat();
        float pi = (float) 3.14;

        float comprimento = 2 * pi * raio;
        System.out.println("O valor do comprimento é: " + comprimento);
        float r2 = raio * raio;
        float area = pi * r2;
        System.out.println("O valor da área é: " + area);
        float r3 = raio * raio * raio;
        float volume = (float) (4.0 / 3.0 * pi * r3); // Correção na fórmula
        System.out.println("O valor do volume é: " + volume);
    }
}
