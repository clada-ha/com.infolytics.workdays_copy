package com.infolytics.workdays.controller;

import com.infolytics.workdays.model.Employee;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;
import java.util.Scanner;

public class NotificationController {

    public void sendNotification(String recipient, String message) throws MessagingException {
        System.out.println("sende eine mail an " + recipient + " mit Nachricht: " + message);

    }

    public static Message prepareMessage(Session session, String myAccount, String identifier) throws Exception {
        Message message = new MimeMessage(session);

        message.setFrom(new InternetAddress(myAccount));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(identifier));
        message.setSubject("Mail Test - Notification Controller");

        // set up Multipart Message ("wrapper")
        Multipart multipart = new MimeMultipart();
        // set Body Part
        BodyPart messageBodyPart = new MimeBodyPart();
        // text Body Part
        // TODO integrate employee & notification info
        messageBodyPart.setText("Hallo ");
        // add body part to multipart-wrapper
        multipart.addBodyPart(messageBodyPart);
        // finish Message by equipping it with the Multipart Content
        message.setContent(multipart);

        return message;
    }
    // TODO ??? different exception handling? >> wenn zB Webserver nicht erreichbar, Datenbankverbindungsproblem

    public static void main(String[] args) {

        // set correct data for mail server
        // save data as key value pairs in Properties object

        // TODO: allgemeines properties-file erstellen (echte keys, Schrottvalues)
        // TODO: ein korrektes properties-file mit eigenen Daten erstellen (GIT IGNORE!), mail-local.properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtprelaypool.ispgateway.de"); // aus thunderbird settings gefischt
        properties.put("mail.smtp.port", "587"); // STARTTLS port: 587; SSL port: 465

        // TODO separaten MailController erstellen
        // NotificationController: sammelt notes, die zu versenden sind, in Liste


        // save sender's address including pw + receiver's address
        Scanner scanner = new Scanner(System.in);
        // TODO fuer testzwecke eigene Mail, spaeter zB noreply@infolytics.com
        String myAccount = "charder@infolytics.com";
        // TODO solve password issue
        System.out.println("password: ");
        String myPassword = scanner.nextLine();
        // TODO fuer testzwecke eigene Mail, spaeter Employee identifier
        String identifier = "charder@infolytics.com";

        // create Session object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccount, myPassword); // returns valid subclass obj of necessary authenticator obj
            }
        });

        try {
            Message message = prepareMessage(session, myAccount, recipient);
            Transport.send(message);
            System.out.println("BINGO. Testmail versandt.");
        } catch (Exception e1) {
            System.out.println("issue w mailing");
            e1.printStackTrace();
        }

    }
}
