package com.example.messanger.Message;

public class VoiceMessage extends Message {

    private String voiceMessage;
    private Integer durationInSecond;
    private Integer voiceQualityInkbps;

    /**
     * 
     */
    VoiceMessage() {

        setMessageType(MessageType.VOICE);
    }

    // Getter
    public String getVoiceMessage() {
        return voiceMessage;
    }

    public Integer getVoiceQualityInkbps() {
        return voiceQualityInkbps;
    }

    public Integer getDurationInSecond() {
        return durationInSecond;
    }

    // Setter
    public void setVoiceMessage(String voiceMessage) {
        this.voiceMessage = voiceMessage;
    }

    public void setDurationInSecond(Integer durationInSecond) {
        this.durationInSecond = durationInSecond;
    }

    public void setVoiceQualityInkbps(Integer voiceQualityInkbps) {
        this.voiceQualityInkbps = voiceQualityInkbps;
    }

    // Method
    @Override
    public String toString() {
        return "Message [MessageContent= " + getMessageContent() + "\n messageId= " + getMessageId() +
                "\n messageStatus= " + getMesssageStatus() + "\n receivedId= " + getReceiverId() + "\n senderId= "
                + getSenderId() + "\n voiceMessage = " + getVoiceMessage() + "\n durationInSecond = "
                + getDurationInSecond() + "\n voiceQualityInkbps = " + getVoiceQualityInkbps() + "]";
    }
}
