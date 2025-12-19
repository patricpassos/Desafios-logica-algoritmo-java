import java.util.Locale;
import java.util.Scanner;

public class DesafioBar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Definição das variaveis
		char sexo;
		int qtdCerveja, qtdRefrigerante, qtdEspeto;
		double ingresso = 0.0, consumoTotal, couvert = 0.0, total;

		// Entrada de dados
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);

		System.out.print("Quantidade de cervejas: ");
		qtdCerveja = sc.nextInt();

		System.out.print("Quantidade de refrigerante: ");
		qtdRefrigerante = sc.nextInt();

		System.out.print("Quantidade de espetinho: ");
		qtdEspeto = sc.nextInt();

		consumoTotal = qtdCerveja * 5.0 + qtdRefrigerante * 3.0 + qtdEspeto * 7.0; //Processamento
		
		//Saída
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f\n", consumoTotal);
		
		//Condicional: taxa de consumo
		if (consumoTotal <= 30.0) {
			couvert = 4.0;
			System.out.printf("Couvert = %.2f\n", couvert);
		} else {
			System.out.printf("Insento de Couvert\n");
		}
		//Condicional: definição do ingresso M/F
		if (sexo == 'F') {
			ingresso = 8.0;
		} else {
			ingresso = 10.0;
		}

		total = consumoTotal + couvert + ingresso; //processamento
		
		//Saída
		System.out.printf("Ingresso = R$ %.2f\n", ingresso);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f\n", total);

		sc.close();

	}

}
