package com.example.messanger.Message;

public class TextMessage extends Message {

    private String textMessageContent;

    TextMessage() {
        // super();
        setMessageType(MessageType.TEXT);
    }

    // Getter
    public String getTextMessageContent() {
        return textMessageContent;
    }

    public int getTextMessageContentSize() {
        return textMessageContent.length();
    }

    // Setter
    public void setTextMessageContent(String textMessage) {
        this.textMessageContent = textMessage;
    }

    // Method
    @Override
    public String toString() {
        return "Message [MessageContent= " + getMessageContent() + "\n messageId= " + getMessageId() +
                "\n messageStatus= " + getMesssageStatus() + "\n receivedId= " + getReceiverId() + "\n senderId= "
                + getSenderId() + " \n textMessageContent = " + textMessageContent + ",\n TextMessageContentSize = "
                + getTextMessageContentSize() + "]";
    }
}