package exec;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cid1, cid2; String exit;
		int n = 0;

			try {
				System.out.printf("Digite a quantidade de cidades: ");
				n = sc.nextInt();
				System.out.println();
			}catch(Exception e) {
				System.out.println("Erro: " + e);
			}
		
		String[] cidades = new String[n];
		int[][] distancias = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Escolha as cidades: ");
			cidades[i] = sc.next();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				if(i == j) {
					distancias[i][j] = 0;
				}else if(i < j) {
					System.out.printf("Distância entre " + cidades[i] + " e " + cidades[j] + ": ");
					distancias[i][j] = sc.nextInt();
				}else {
					distancias[i][j] = distancias[j][i];
				}
			}
		}
		
		do {
			for(int i = 0; i < n; i++) {
				System.out.println(i + " - " + cidades[i]);
			}
			System.out.println("Escolha duas cidades: ");
			cid1 = sc.nextInt();
			cid2 = sc.nextInt();
			
			System.out.println("A distÂncia entre " + cidades[cid1] + " e " + cidades[cid2] + " é: " + distancias[cid1][cid2]);
			
			System.out.println("Fim para encerrar: ");
			exit = sc.next();
		}while(!exit.equalsIgnoreCase("Fim"));
		
	}

}
