package com.example.messanger.Message;

public class ImageMessage extends Message {

    private String imageMessage;
    private String imageResolution;
    private String imageMetaData;

    ImageMessage() {
        setMessageType(MessageType.IMAGE);
    }

    // Getter
    public String getImageMessage() {
        return imageMessage;
    }

    public String getImageResolution() {
        return imageResolution;
    }

    public String getImageMetaData() {
        return imageMetaData;
    }

    // Setter
    public void setImageMessage(String imageMessage) {
        this.imageMessage = imageMessage;
    }

    public void setImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
    }

    public void setImageMetaData(String imageMetaData) {
        this.imageMetaData = imageMetaData;
    }

    // Method
    @Override
    public String toString() {
        return "Message [MessageContent= " + getMessageContent() + "\n messageId= " + getMessageId() +
                "\n messageStatus= " + getMesssageStatus() + "\n receivedId= " + getReceiverId() + "\n senderId= "
                + getSenderId() + "\n imageMessage = " + imageMessage + "\n imageResolution = " + imageResolution
                + "\n imageMetaData = " + imageMetaData + "]";
    }
}
