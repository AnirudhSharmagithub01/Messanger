package com.example.messanger;

import com.example.messanger.Message.Message;


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
        
    }
}
