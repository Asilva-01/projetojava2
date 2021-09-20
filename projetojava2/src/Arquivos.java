import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alex Egídio");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(33);
		pessoa2.setNome("Malan Mala");

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(44);
		pessoa3.setNome("Elano Armínio");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		
		
		File arquivo = new File("C:\\Users\\André\\git\\repository2\\projetojava2\\src\\arquivo.txt");
		
		if(! arquivo.exists()) {
			arquivo.createNewFile();
			
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + " \n");
		}
		

		escrever_no_arquivo.write("\n");
		escrever_no_arquivo.write("------------------------------------------");
		escrever_no_arquivo.write("\n");
		for (int i = 1; i <=10; i++) {
			
			escrever_no_arquivo.write("Texto da minha linha "+i+" \n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
		
	}
	
}
