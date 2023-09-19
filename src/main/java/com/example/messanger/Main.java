package com.example.messanger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import com.example.messanger.Message.ImageMessage;
import com.example.messanger.Message.Message;
import com.example.messanger.Message.TextMessage;


public class Main {
    public static void main(String[] args) {
        

        
        //Ankur send message to the Abhinaya
        Message message1 = new Message();
        message1.setSenderId("SENDER_Ankur");
        message1.setReceivedId("RECEIVED_Abhinaya");
        message1.setMessageContent("Hello, Have you checked out https://blog.crio.do?");
        AndroidHandler.send(message1);

        // Aman send message to the Abhiskek
        Message message2 = new Message();
        message2.setSenderId("SENDER_Aman");
        message2.setReceivedId("RECEIVER_Abhiskek");
        message2.setMessageContent("Hello, Hello, Enjoying Learn By Doing!");
        AndroidHandler.send(message2);


        // Ankur sends a text message to Abhinaya
		TextMessage message3 = new TextMessage();
        message3.setSenderId("SENDER_Ankur");
        message3.setReceivedId("RECEIVER_Abhinaya");
        message3.setTextMessageContent("Hello, Have you checked out https://blog.crio.do?");
        AndroidHandler.sendText(message3);

        // Aman sends a message to Abhiskek
        ImageMessage message4 = new ImageMessage();
        message4.setSenderId("SENDER_Aman");
        message4.setReceivedId("RECEIVER_Abhiskek");
        
        String imagePath = getFilePathFromResource("CrioLogo.png");
        message4.setImageMessage(imageToBase64StringConversion(imagePath));
        AndroidHandler.sendImage(message4);
        
    }

    
    public static String imageToBase64StringConversion(String filePath) {
        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(Paths.get(filePath));
            return Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    private static String getFilePathFromResource(String fileName){
       return Main.class.getClassLoader().getResource(fileName).getPath();
    }
}
