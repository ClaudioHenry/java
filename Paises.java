import java.text.DecimalFormat;
import java.util.Scanner;

public class Paises {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        DecimalFormat a = new DecimalFormat("00");
        System.out.println("DIgite sue dinheiro para a viagem em outros países: ");
        double reais = entrada.nextDouble();

        double dolar = reais / 4.89;
        double euro = reais / 5.23;
        double librae = reais / 6.02;
        System.out.println("O valor convertido em dólar é: " + a.format(dolar));
        System.out.println("O valor convertido em euro é: " + a.format(euro));
        System.out.println("O valor convertido em libra esterlina é: " + a.format(librae));
    }
}
