package Datos;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;


public class EmailSender {
	
	/*public static void main(String[] args) {
		
		
	    String destinatario =  "sebasgoy16@gmail.com"; //A quien le quieres escribir.
	    String asunto = "Correo de prueba enviado desde Java";
	    String cuerpo = "Esta es una prueba de correo...";

	    enviarConGMail(destinatario, asunto, cuerpo);
	}*/
	
	public static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
	    //La direcci�n de correo de env�o
	    String remitente = "sebitasgoy@gmail.com";
	    //La clave de aplicaci�n obtenida seg�n se explica en este art�culo:
	    String claveemail = "jbiwepdfzkuffptz";

	    Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
	    props.put("mail.smtp.user", remitente);
	    props.put("mail.smtp.clave", claveemail);    //La clave de la cuenta
	    props.put("mail.smtp.auth", "true");    //Usar autenticaci�n mediante usuario y clave
	    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
	    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);

	    try {
	        message.setFrom(new InternetAddress(remitente));
	        message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));   //Se podr�an a�adir varios de la misma manera
	        message.setSubject(asunto);
	        message.setText(cuerpo);
	        Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", remitente, claveemail);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	    catch (MessagingException me) {
	        me.printStackTrace();   //Si se produce un error
	    }
	  }
	
	
	
}
