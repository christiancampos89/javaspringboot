package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario;
		List lista = new ArrayList<>();
		
		int n = 0;
		System.out.print("Por favor entre com o número de funcionários que você deseja informar os dados: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Por favor insira o ID do funcionário Nº " + (i + 1));
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Por favor insira o Nome do funcionário Nº " + (i + 1));
			String nome = sc.nextLine();
			System.out.println("Por favor insira o Salário do funcionário Nº " + (i + 1));
			double salario = sc.nextDouble();
			funcionario = new Funcionario(id, nome, salario);
			lista.add(funcionario);
			
		}
		for(Object obj : lista ) {
			System.out.println(obj);
		}
		
		sc.close();
		
		

	}

}
