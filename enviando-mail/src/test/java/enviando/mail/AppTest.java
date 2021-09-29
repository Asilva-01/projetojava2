package enviando.mail;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



/**
 * Unit test for simple App.
 */
public class AppTest {
	

	
	@org.junit.Test
	public void testeEmail() throws Exception{
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Olá, <br/><br/>");
		stringBuilderTextoEmail.append("Você está recebendo o acesso ao curso de Java!<br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo.<br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://bickraft-jscsshtmlasilva.netlify.app/produtos.html\" style=\"color:#252a7; padding: 14px 25px; text-align:center; text-decoration:none; display:inlinr-block; border-radius:30px; font-size:20px; font-family:courier; border: 3px solid green;background-color:#99DA39;  \">Acessar Portal</a><br/><br/>");
		
		stringBuilderTextoEmail.append("<span style=\font-size:6px\">Ass.: Andre Dev Java </span>");
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("rpa.andreluiz@gmail.com, andre81luiz@terra.com.br",
				"Andre Dev - Java", 
				"JAVA para TODOS!!", 
				stringBuilderTextoEmail.toString());
		
		enviaEmail.EnviaEmailAnexo(true);
		
		/*Tempo de execução do email teste*/
		
		Thread.sleep(5000);

		}

		
		
	}


