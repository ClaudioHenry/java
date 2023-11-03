import java.text.DecimalFormat;
import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner (System.in)) {
            DecimalFormat a = new DecimalFormat("00");
            System.out.println("Digite as horas para a conversao: ");
            int hora = entrada.nextInt();
            System.out.println("Digite os minutos para a conversao: ");
            int minutos = entrada.nextInt();
            //cálculo hora
            double h = hora * 60;
            double hr = minutos + h;
            double s = hr * 60;
            
            System.out.println("As horas em minutos são: " + a.format(h));
            System.out.println("Os minutos somados são: " + a.format(hr));
            System.out.println("Os minutos em segundos sao: " + a.format(s));
        }
        
    }
}
