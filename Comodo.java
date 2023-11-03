import java.text.DecimalFormat;
import java.util.Scanner;

public class Comodo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        DecimalFormat a = new DecimalFormat("00"); 
        System.out.println("Digite a largura do comodo: ");
        float l = entrada.nextFloat();
        System.out.println("Digite o comprimento do comodo: ");
        float c = entrada.nextFloat();
        float m2 = 18;
        float m = 1;
        float conta = l * c;
        System.out.println("O tamanho do cômodo é: " + a.format(conta) + " metros quadrados");
        System.out.println("Para iluminar um metro quadrado é preciso de 18W.");
        float r = (conta * m2)/m;
        System.out.println("Para iluminar o comodo de " + a.format(conta) + " metros quadrados, é preciso de: " + a.format(r) + " wats de potência.");

    }
}
