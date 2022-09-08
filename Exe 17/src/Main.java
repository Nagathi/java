import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

public class Main {
	public static void main(String [] args) throws IOException, ClassNotFoundException{
		
		Map <Integer, Object> pessoas = new HashMap();
		
		FileInputStream read_clientes = new FileInputStream("pessoas.dat");
		ObjectInputStream in = new ObjectInputStream(read_clientes);
		pessoas = (HashMap) in.readObject();
		
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
					
					for (Map.Entry<Integer, Object> set : pessoas.entrySet()) {
					    if(search.equals(set.getKey())) {
					    	JOptionPane.showMessageDialog(null, "Encontrado!");
					    	Pessoa p = (Pessoa) set.getValue();
					    	JOptionPane.showMessageDialog(null, "ID: " 			+ search + "\n" + 
																"Nome: " 		+ p.getNome() + "\n" +
																"Telefone: " 	+ p.getTel());
					    }
					}
				}
			}
			
			if(option.equals("3")) {
				
				FileOutputStream write_pessoas = new FileOutputStream("pessoas.dat");
				ObjectOutputStream out = new ObjectOutputStream(write_pessoas);
				out.writeObject(pessoas);
				
				JOptionPane.showMessageDialog(null, "Dados salvos!");
			}
			
			option = JOptionPane.showInputDialog(
												 "1 - Cadastrar 		 \n" +
												 "2 - Consultar Pessoa 	 \n" +
												 "3 - Salvar Informações \n" +
												 "F - Encerrar Programa\n\n" );
		}
	}
	
}
