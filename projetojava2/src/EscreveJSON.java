import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

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
	
		//***********---LENDO O ARQUIVO JSON-----------***********//
		
		FileReader fileReader = new FileReader("C:\\\\Users\\\\André\\\\git\\\\repository2\\\\projetojava2\\\\src\\\\filejson.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
			
		}
		
		System.out.println("Leitura do arquivo JSON: " + listUsuarios);
	}
	
}
