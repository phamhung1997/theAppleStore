/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import config.IEmailConfig;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *
 * 
 */
public class AutoSentEmail {

    public static void sentEmail(String userEmail, String subject, String text) {
        // TODO
        // Change to configuration file

        Properties props = new Properties();
        
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(IEmailConfig.EMAIL, IEmailConfig.PASSWORD);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(IEmailConfig.EMAIL));
            message.setReplyTo(InternetAddress.parse(IEmailConfig.PASSWORD));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(userEmail));
            message.setSubject(subject);
            message.setText(text);

            Transport.send(message);
            
            System.out.println("Sent email done!");
            
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}