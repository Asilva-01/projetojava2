package enviando.mail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.mail.iap.ByteArray;

public class ObjetoEnviaEmail {

	private String userName = "rpa.andreluiz@gmail.com";
	private String senha = "Vick#2014";
	
	private String listaDestinatarios = "";
	private String nomeRemetente = ""; 
	private String assuntoEmail = "";
	private String textoEmail = "";
	
	public ObjetoEnviaEmail(String listaDestinatarios, String nomeRemetente, 
			String assuntoEmail, String textoEmail ) {
			this.listaDestinatarios = listaDestinatarios;
			this.nomeRemetente = nomeRemetente;
			this.assuntoEmail = assuntoEmail;
			this.textoEmail = textoEmail;
	}
	
	
	
	public void EnviaEmail(boolean envioHtml) throws Exception{
		
		Properties properties = new Properties();
		
		properties.put("mail.smtp.ssl.trust", "*");
		properties.put("mail.smtp.auth", "true");/*Autorização*/
		properties.put("mail.smtp.starttls", "true");/*Autenticação*/
		properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor gmail Google*/
		properties.put("mail.smtp.port", "465");/*Porta do servidor*/
		properties.put("mail.smtp.socketFactory.port", "465");/*Expecifica a porta a ser conectada pelo socket*/
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Classe socket de conexão ao SMTP*/
		
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication(userName, senha);
			}
		});
		
		Address[] toUser = InternetAddress.parse(listaDestinatarios);
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName, nomeRemetente ));/*Quem está enviando*/
		message.setRecipients(Message.RecipientType.TO, toUser);/*Email d destino*/
		message.setSubject(assuntoEmail);/*Assunto do e-mail*/
		
		
		if (envioHtml) {
			message.setContent(textoEmail, "text/html; charset=utf-8");
		}else {
			message.setText(textoEmail);
		}
		
		
		Transport.send(message);

		
	}
	
	
	public void EnviaEmailAnexo(boolean envioHtml) throws Exception{
		
		Properties properties = new Properties();
		
		properties.put("mail.smtp.ssl.trust", "*");
		properties.put("mail.smtp.auth", "true");/*Autorização*/
		properties.put("mail.smtp.starttls", "true");/*Autenticação*/
		properties.put("mail.smtp.host", "smtp.gmail.com");/*Servidor gmail Google*/
		properties.put("mail.smtp.port", "465");/*Porta do servidor*/
		properties.put("mail.smtp.socketFactory.port", "465");/*Expecifica a porta a ser conectada pelo socket*/
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");/*Classe socket de conexão ao SMTP*/
		
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication(userName, senha);
			}
		});
		
		Address[] toUser = InternetAddress.parse(listaDestinatarios);
		
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(userName, nomeRemetente ));/*Quem está enviando*/
		message.setRecipients(Message.RecipientType.TO, toUser);/*Email d destino*/
		message.setSubject(assuntoEmail);/*Assunto do e-mail*/
		
		/*Parte 1 do email que e o texto e descrição do email*/
		
		MimeBodyPart corpoEmail = new MimeBodyPart();
		
		
		if (envioHtml) {
			corpoEmail.setContent(textoEmail, "text/html; charset=utf-8");
		}else {
			corpoEmail.setText(textoEmail);
		}
		
		/*Parte 2 do e-ail que são os anexos em PDF*/
		MimeBodyPart anexoEmail = new MimeBodyPart();
		
		/*Onde é passado o simulado voce passa o seu arquivo gravado no BD*/
		anexoEmail.setDataHandler(new DataHandler(new ByteArrayDataSource(simuladorDePDF(), "application/pdf")));
		anexoEmail.setFileName("anexoemail.pdf");
		
		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(corpoEmail);
		multipart.addBodyPart(anexoEmail);
		
		message.setContent(multipart);
		
		Transport.send(message);

		
	}
	
	
	
	
	
	
	
	/**
	 * Esse método simula o PDF ou qualquer arquivo que possa ser enviado por anexo no e-mail.
	 *Voce pode pegar o arquivo no seu bd base64, byte[], Stream de Arquivos.
	 *Pode esta em BD ou diretório.
	 *
	 *Retorna um PDF em Branco com o texto do paragrafo de exemplo.
	 */
	private FileInputStream simuladorDePDF() throws Exception{
		Document document = new Document();
		File file = new File("fileanexo.pdf");
		PdfWriter.getInstance(document, new FileOutputStream(file));
		document.open();
		document.add(new Paragraph("Conteudo do PDF anexo com Java Mail, esse texto é do PDF"));
		document.close();
		return new FileInputStream(file);
		
	}
	
}
