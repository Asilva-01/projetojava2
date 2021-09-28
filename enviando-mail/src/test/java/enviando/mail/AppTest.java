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
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("rpa.andreluiz@gmail.com, andre81luiz@terra.com.br",
				"Andre Dev - Java", 
				"JAVA para TODOS!!", 
				"A caminhada é longa e o processo é lento, mas já esta valendo o esforço!");
		
		enviaEmail.EnviaEmail();
		
		/*Tempo de execução do email teste*/
		
		Thread.sleep(5000);

		}

		
		
	}


