import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o tamanho da área diagonal maior: ");
        float dma = entrada.nextFloat();
        System.out.println("Digite o tamanho da área diagonal menor: ");
        float dme = entrada.nextFloat();

        float area = (dma * dme)/2;
        System.out.println("A área do losango é: " + area);
    }
}
