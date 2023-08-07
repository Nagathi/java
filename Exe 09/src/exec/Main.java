package exec;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "";
		float num1, num2, result = 0;
		
		System.out.println("1 - Divisão");
		System.out.println("2 - Soma");
		System.out.println("3 - Subtração");
		System.out.println("4 - Multiplicação");
		System.out.println("Fim - Encerra o programa");
		op = sc.next();
		
		while(!op.equalsIgnoreCase("Fim")) {
			
			if(op.equalsIgnoreCase("1")) {
				
				try {
					System.out.println("Digite o primeiro número: ");
					num1 = sc.nextFloat();
					System.out.println("Digite o primeiro número: ");
					num2 = sc.nextFloat();
					result = num1/num2;
				}catch(Exception e) {
					System.out.println("Erro: " + e);
				}finally {
					System.out.println("A divisão é: " + result);
				}
			}
			
			if(op.equalsIgnoreCase("2")) {
				
				try {
					System.out.println("Digite o primeiro número: ");
					num1 = sc.nextFloat();
					System.out.println("Digite o segundo número: ");
					num2 = sc.nextFloat();
					result = num1/num2;
				}catch(Exception e) {
					System.out.println("Erro: " + e);
				}finally {
					System.out.println("A soma é: " + result);
				}				
			}
			
			if(op.equalsIgnoreCase("3")) {
				
				try {
					System.out.println("Digite o primeiro número: ");
					num1 = sc.nextFloat();
					System.out.println("Digite o segundo número: ");
					num2 = sc.nextFloat();
					result = num1+num2;
				}catch(Exception e) {
					System.out.println("Erro: " + e);
				}finally {
					System.out.println("A subtração é: " + result);
				}
			}
			if(op.equalsIgnoreCase("4")) {

				try {
					System.out.println("Digite o primeiro número: ");
					num1 = sc.nextFloat();
					System.out.println("Digite o segundo número: ");
					num2 = sc.nextFloat();
					result = num2-num1;
				}catch(Exception e) {
					System.out.println("Erro: " + e);
				}finally {
					System.out.println("A multiplicação é: " + result);
				}
			}
			
			System.out.println("1 - Divisão");
			System.out.println("2 - Soma");
			System.out.println("3 - Subtração");
			System.out.println("4 - Multiplicação");
			System.out.println("Fim - Encerra o programa");
			op = sc.next();
		}
	}
}

