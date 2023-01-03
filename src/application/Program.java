package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de clientes: ");
		int N = sc.nextInt();
		String[] vectNome = new String[N];
		String[] vectTelefone = new String[N];
		int[] vectTipo = new int[N];
		int[] vectMinutos = new int[N];
		double[] vectValorConta = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.println("Dados do " + (i+1) + "o. cliente:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Telefone: ");
			String telefone = sc.next();
			System.out.print("Tipo: ");
			int tipo = sc.nextInt();
			System.out.print("Minutos: ");
			int minutos = sc.nextInt();	
			
			vectNome[i] = nome;
			vectTelefone[i] = telefone;
			vectTipo[i] = tipo;
			vectMinutos[i] = minutos;
		}
		
		System.out.println();
		System.out.println("Informe o preço basico e excedente de cada tipo de conta:");
		double[][] matTipo = new double[3][2];
		for (int i=0; i<matTipo.length; i++) {
				System.out.println("Tipo " + i + ":");
				double valorBasico = sc.nextDouble();
				double valorPorMinuto  = sc.nextDouble();
				matTipo[i][0] = valorBasico;
				matTipo[i][1] = valorPorMinuto;
		}
		
		for (int i=0; i<N; i++) {
			double diferenca = vectMinutos[i] - 90.0;
			double valorConta = 0;
			if (vectMinutos[i] > 90) {
				if (vectTipo[i] == 0) {
					valorConta = matTipo[0][0] + (diferenca * matTipo[0][1]);
				}else {
					if (vectTipo[i] == 1) {
						valorConta = matTipo[1][0] + (diferenca * matTipo[1][1]);
					}else {
						valorConta = matTipo[2][0] + (diferenca * matTipo[2][1]);
					}
				}
			}else {
				if (vectTipo[i] == 0) {
					valorConta = matTipo[0][0];
				}else {
					if (vectTipo[i] == 1) {
						valorConta = matTipo[1][0];
					}else {
						valorConta = matTipo[2][0];
					}
				}
			}
			vectValorConta[i] = valorConta;
		}
		
		System.out.println();
		System.out.println("RELATÓRIO DE CLIENTES:");
		
		System.out.println();
		for (int i=0; i<N; i++) {
			System.out.println(vectNome[i] 
					+ ", " 
					+ vectTelefone[i] 
					+ ", Tipo " 
					+ vectTipo[i] 
					+ ", Minutos: " 
					+ vectMinutos[i] 
					+ ", Conta = R$ " 
					+ String.format("%.2f", vectValorConta[i]));
		}
		sc.close();
	}
}
