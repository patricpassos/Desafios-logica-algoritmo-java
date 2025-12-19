import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrada de dado
		System.out.print("Renda anual com salário: ");
		double salario = sc.nextDouble();

		System.out.print("Renda anual com prestação de serviço: ");
		double prestacaoServico = sc.nextDouble();

		System.out.print("Renda anual com ganho de capital: ");
		double ganhoCapital = sc.nextDouble();

		System.out.print("Gastos médicos: ");
		double gastoMedico = sc.nextDouble();

		System.out.print("Gasto educacionais: ");
		double gastoEducacional = sc.nextDouble();

		/**
		 * Relatorio de saida: consolidação de renda
		 */
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");

		/**
		 * Condicional de imposto sobre o salario e declaração de variaveis de imposto
		 * de serviços e ganho de capital
		 */
		double impostoSalario, impostoServico, impostoCapital;
		if (salario > 60000.0) {
			impostoSalario = salario * 20.0 / 100.0;
		} else if (salario > 36000.0) {
			impostoSalario = salario * 10.0 / 100.0;
		} else {
			impostoSalario = 0.0;
		}
		if (impostoSalario == 0.0) {
			System.out.println("Imposto sobre o salário: Isento");
		} else {
			System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
		}

		impostoServico = prestacaoServico * 15.0 / 100.0;
		impostoCapital = ganhoCapital * 20.0 / 100.0;

		System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);
		System.out.println();

		/**
		 * Deduções: Deducações maximas de 30% sobre o imposto bruto; soma das deduções
		 * normais sobre educação e saúde;
		 */
		double maximoDeducoes, gastoMedicoEdicalcional;
		maximoDeducoes = (impostoSalario + impostoServico + impostoCapital) * 30.0 / 100.0;
		gastoMedicoEdicalcional = gastoMedico + gastoEducacional;

		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f\n", maximoDeducoes);
		System.out.printf("Gastos dedutíveis: %.2f\n", gastoMedicoEdicalcional);
		System.out.println();

		// Resumo
		
		double totalImposto, impostoDevido;
		if (maximoDeducoes < gastoMedicoEdicalcional) {
			gastoMedicoEdicalcional = maximoDeducoes;
		}
		
		totalImposto = impostoSalario + impostoServico + impostoCapital;
		impostoDevido = totalImposto - gastoMedicoEdicalcional;
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", totalImposto);
		System.out.printf("Abatimento: %.2f\n", gastoMedicoEdicalcional);
		System.out.printf("Imposto devido: %.2f\n", impostoDevido);

		sc.close();

	}

}
