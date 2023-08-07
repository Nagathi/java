import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException, ClassNotFoundException{
		
		Map <Integer, Object> pessoas = new HashMap();
		
		String option = JOptionPane.showInputDialog(
													"1 - Cadastrar 			\n" +
													"2 - Consultar Pessoa 	\n" +
													"3 - Imprimir Arquivos 	\n" +
													"F - Encerrar Programa\n\n" );
														
		while(!option.equals("F")){
			if(option.equals("1")) {
				int id 		= Integer.parseInt(JOptionPane.showInputDialog("ID"));
				String nome = 				  (JOptionPane.showInputDialog("Nome"));
				String tel  = 				  (JOptionPane.showInputDialog("Telefone"));
				
				Pessoa pessoa = new Pessoa(nome, tel);
				
				pessoas.put(id, pessoa);
				JOptionPane.showMessageDialog(null, "Cadastrado!");
			}
			
			if(option.equals("2")) {
				Integer search = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
				
				Iterator it = pessoas.entrySet().iterator();
				
				while(it.hasNext()) {
					HashMap.Entry mp = (HashMap.Entry) it.next();
					
					if(pessoas.containsKey(search)) {
						
						Pessoa p = new Pessoa("", "");
							   p = (Pessoa) mp.getValue();
						JOptionPane.showMessageDialog(null, "Encontrado!");
						
						
						
						JOptionPane.showMessageDialog(null, "ID: " 			+ search + "\n" + 
															"Nome: " 		+ p.getNome() + "\n" +
															"Telefone: " 	+ p.getTel());
					}else {
						JOptionPane.showMessageDialog(null, "Não existe um endereço com esse ID!");
					}
				}
			}
			
			if(option.equals("3")) {
				FileOutputStream write_pessoas = new FileOutputStream("pessoas.dat");
				ObjectOutputStream out = new ObjectOutputStream(write_pessoas);
				out.writeObject(pessoas);
			}
			
			option = JOptionPane.showInputDialog(
												 "1 - Cadastrar 		 \n" +
												 "2 - Consultar Pessoa 	 \n" +
												 "3 - Salvar Informações \n" +
												 "F - Encerrar Programa\n\n" );
		}
	}
	
}
