import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String [] args){
		try (Scanner sc = new Scanner(System.in)) {
			String search = " ";
				
			System.out.println("Digite o nome para um arquivo: ");
			String nome = sc.next();
			nome = nome + ".txt";
				
			try {
				String nome_arq = nome; // "/home/heleno/teste.txt"
				FileOutputStream file = new FileOutputStream(nome_arq);
				try (PrintStream out = new PrintStream( file )) {
					out.print("Com o avanço das tecnologias digitais, palavra palavra palavra palavra palavra");
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
				
				
			System.out.println("1 - Buscar Palavra");
			System.out.println("2 - Substituir Palavra");
			System.out.println("3 - Imprimir Arquivos");
			System.out.println("F - Encerrar Programa");
			String option = sc.next();
				
			while(!option.equalsIgnoreCase("F")){
				
				if(option.equals("1")) {
					
					System.out.println("Digite a palavra a ser buscada: ");
					search = sc.next();
					
					try{
						String nome_arq = nome;
						FileInputStream file = new FileInputStream(nome_arq);
						InputStreamReader isr = new InputStreamReader(file);
						try (BufferedReader in = new BufferedReader(isr)) {
							String linha = in.readLine();
							
							int quant = 0;
							String [] arrayString = linha.split(" ");
							
							for(int i = 0; i < arrayString.length; i++){
								
								if(arrayString[i].equals(search)){
									quant++;
								}
								
							}
							
							System.out.println("Quantidade de " + search + " no texto: " + quant);
							
							
							while(linha != null){
								System.out.println(linha);
								linha = in.readLine();
							}
						}
					}
					catch(Exception e){
						System.out.println(e);
					}
				}else
					
				if(option.equals("2")) {
					try {
						String nome_arq = "teste.txt";
						FileInputStream file = new FileInputStream(nome_arq);
						InputStreamReader isr = new InputStreamReader(file);
						try (BufferedReader in = new BufferedReader(isr)) {
							String line = in.readLine();
							
							System.out.println("Palavra Antiga: ");
							String oldWord = sc.next();
							System.out.println("Palavra Nova: ");
							String newWord = sc.next();
							
							String newLine = line.replace(oldWord, newWord);
							
							String novo_arq = "novo_arq.txt";
							FileOutputStream file2 = new FileOutputStream(novo_arq);
							try (PrintStream newOut = new PrintStream(file2)) {
								newOut.print(newLine);
							}
						}
						
						
					}catch(Exception e) {
						System.out.println(e);
					}
					
						
				}else
					
				if(option.equals("3")) {
					
					try{
						
						String nome_arq = nome;
						FileInputStream file = new FileInputStream(nome_arq);
						InputStreamReader isr = new InputStreamReader(file);
						try (BufferedReader in = new BufferedReader(isr)) {
							String line = in.readLine();
							
							System.out.println("Imprimindo o conteúdo do arquivo " + nome);
							
							while(line != null){
								System.out.println(line);
								line = in.readLine();
							}
						}
						String novo_arq = "novo_arq.txt";
						FileInputStream file2 = new FileInputStream(novo_arq);
						InputStreamReader isr2 = new InputStreamReader(file2);
						try (BufferedReader in2 = new BufferedReader(isr2)) {
							String newLine = in2.readLine();
							
							System.out.println("Imprimindo o conteúdo do arquivo " + novo_arq);
							
							while(newLine != null){
								System.out.println(newLine);
								newLine = in2.readLine();
							}
						}
						
					}
					catch(Exception e){
						System.out.println(e);
					}
							
				}
				
				System.out.println("1 - Buscar Palavra");
				System.out.println("2 - Substituir Palavra");
				System.out.println("3 - Imprimir Arquivos");
				System.out.println("F - Encerrar Programa");
				option = sc.next();
			}
		}
		
	}

}
