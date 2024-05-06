package Backstage;

import java.util.ArrayList;

public class Sentence {

    private final int serialNumber;
    private final String namePosition;
    private final String speaker;
    private final String phrase;
    private final ArrayList<String> replies;
    private String result = null;

    public Sentence(int serialNumber, String namePosition, String speaker, String phrase) {
        this.serialNumber = serialNumber;
        this.namePosition = namePosition;
        this.speaker = speaker;
        this.phrase = phrase;
        replies = new ArrayList<>();
    }

    public void addReply(String reply) {
        if (reply != null) {
            replies.add(reply);
        }
    }

    public String toString() {
        return speaker + ": " + phrase + " -> " + replies + " = " + result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getPhrase() {
        return phrase;
    }

    public ArrayList<String> getReplies() {
        return replies;
    }

    public String getResult() {
        return result;
    }
}
