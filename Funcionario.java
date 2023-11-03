import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char resposta;

        do {
            System.out.println("Digite o salário fixo do funcionário: ");
            double salarioFixo = entrada.nextDouble();
            System.out.println("Digite o valor das vendas: ");
            double vendas = entrada.nextDouble();

            double comissao;
            if (vendas >= salarioFixo / 3) {
                comissao = vendas * 0.04;
            } else {
                comissao = (vendas * 0.04 * salarioFixo) / vendas;
            }

            double salarioFinal = salarioFixo + comissao;

            System.out.println("Comissao: " + comissao);
            System.out.println("Salário final: " + salarioFinal);

            System.out.println("Deseja continuar? (y/n)");
            resposta = entrada.next().charAt(0);
        } while (resposta == 'y');
    }
}
