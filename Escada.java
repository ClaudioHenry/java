import java.text.DecimalFormat;
import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner (System.in)) {
            DecimalFormat l = new DecimalFormat("00");
            System.out.println("Digite a medida do ângulo: ");
            double an = entrada.nextDouble();
            System.out.println("Digite a distância da escada da parede: ");
            double es = entrada.nextDouble();
            double a = an * an;
            double e = es * es;
            double cal = a - e;
            double ca = Math.sqrt(cal);

            System.out.println("A distância em que a escada tem estar da parede é: " + l.format(ca) );
        }

    }
}
