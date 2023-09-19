package com.example.messanger;

import com.example.messanger.Message.Message;
import com.example.messanger.Message.TextMessage;
import com.example.messanger.Message.ImageMessage;

public class AndroidHandler {


    public static void send(Message message){
        try {
            if(message.getMessageContent().isEmpty()){
                throw new Exception("Cannot send Empty message");
            }
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        save(message);
        deliver(message);
    }
    public static void sendText(TextMessage message1) {
        // 1. Discard empty strings.
        if (message1.getTextMessageContent().isEmpty()){
            try {
                throw new Exception("Cannot Send Empty Message!");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // 3. Store the Message Safely.
        save(message1);
        
        // 4.Deliver the message.
        deliverText(message1);


    }

    public static void sendImage(ImageMessage message) {
        // 1. Discard empty strings.
        if (message.getImageMessage().isEmpty()){
            try {
                throw new Exception("Cannot Send Empty Image!");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // 3. Store the Message Safely.
        save(message);
        
        // 4.Deliver the message.
        deliverImage(message);


    }

    private static void save(Message message) {
        // Write logic to store the message
        System.out.println(message + " stored successfully.");
    }

    public static void deliver(Message message){
        try {
            if(message.getMessageContentSize() > 100){
                throw new Exception("message length cannot greater than 100");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println(message + " delivered successfully.");
    }
    
    private static void deliverText(TextMessage message1) {
        // Logic to actually send the message to the user. It may happen through some queueing mechanism.
        // Out of syllabus for this exercise :')

        // # If the message is too large, don't deliver the message directly.
        // For now, drop the message, in future it can be sent as a link to a storage bucket.
        if(message1.getTextMessageContentSize() > 100){
            try {
                throw new Exception("Message too large to send >" + message1.getTextMessageContentSize()+ " 100 bytes");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println(message1 + " delivered successfully.");
    }

    private static void deliverImage(Message message) {
        // Logic to actually send the message to the user. It may happen through some queueing mechanism.
        // Out of syllabus for this exercise :')
        System.out.println("Image"  + message + " delivered successfully.");
    }
    
}
