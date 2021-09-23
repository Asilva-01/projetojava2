import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJSON {
	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("12365478952");
		usuario1.setLogin("joao");
		usuario1 .setSenha("5655655");
		usuario1.setNome("juarez jj");

		
		Usuario usuario2 = new Usuario();
		usuario2.setCpf("42365478952");
		usuario2.setLogin("morais");
		usuario2 .setSenha("8733655");
		usuario2.setNome("morais moreira");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\Users\\André\\git\\repository2\\projetojava2\\src\\filejson.json");
		
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
	
	}
}
