package edu.fgu.dclab;

public class ChatMessage extends AbstractMessage {
    public final String MESSAGE;

    public ChatMessage(String source, String message) {
        this.source = source;
        this.MESSAGE = message;
    }

    public int getType() {
        if(MESSAGE.equals("time")||MESSAGE.equals("Time")||MESSAGE.equals("time?")||MESSAGE.equals("Time?"))
        {
            return Message.TIME;
        }
        else
            return Message.CHAT;
    
    }
}
