package com.example.messanger;

import com.example.messanger.Message.Message;
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

    public static void save(Message message){
        System.out.println("Stored into the Database");
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
}
