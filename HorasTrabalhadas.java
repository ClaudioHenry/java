import java.util.Scanner;

public class HorasTrabalhadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número de horas trabalhadas: ");
        double hora = entrada.nextDouble();
        
        System.out.println("Digite o valor do salário mínimo: ");
        double sm = entrada.nextDouble();
        
        System.out.println("Digite o número de horas extras trabalhadas: ");
        double he = entrada.nextDouble();
        
        double ht = sm / 8; // Valor da hora trabalhada
        double hte = sm / 4; // Valor das horas extras trabalhadas
        
        double sb = hora * ht; // Salário bruto
        double qr = he * hte; // Quantia a receber pelas horas extras
        double sr = sb + qr; // Salário a receber
        
        System.out.println("O valor da hora trabalhada é: " + ht);
        System.out.println("O valor das horas extras trabalhadas é: " + hte);
        System.out.println("O valor do salário bruto é: " + sb);
        System.out.println("O valor da quantia a receber pelas horas extras: " + qr);
        System.out.println("O valor do salário a receber é: " + sr);
    }
}
