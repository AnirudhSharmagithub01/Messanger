package com.example.messanger.Message;

public class Message {
    
    private String messageId;
    private String senderId;
    private String receiverId;
    private String messageContent;
    private MessageStatus messageStatus;
    private MessageType messageType;

    // Getter
    public String getMessageId(){
        return messageId;
    }
    
    public String getSenderId(){
        return senderId;
    }

    public String getReceiverId(){
        return receiverId;
    }

    public String getMessageContent(){
        return messageContent;
    }

    public MessageStatus getMesssageStatus(){
        return messageStatus;
    }

    public MessageType getMessageType(){
        return messageType;
    }

    // Setter

    public void setMessageContent(String messageContent){
        this.messageContent = messageContent;
    }

    public void setReceivedId(String receiverId){
        this.receiverId = receiverId;
    }

    public void setSenderId(String senderId){
        this.senderId = senderId;
    }

    public void setMessageStatus(MessageStatus messageStatus){
        this.messageStatus = messageStatus;
    }

    public int getMessageContentSize() {
        return messageContent.length();
    }

    public void setMessageType(MessageType messageType){
        this.messageType = messageType;
    }

    // Method
    @Override
    public String toString() {
        return "\n Message [ \n MessageContent= "+ messageContent +"\n messageId= "+ messageId +
        "\n messageStatus= "+ messageStatus +"\n receivedId= "+receiverId+"\n senderId= "+senderId+"]";
    }

}
