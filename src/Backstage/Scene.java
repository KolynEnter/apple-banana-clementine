package Backstage;

import Backstage.Dialogue;

import java.util.ArrayList;


public class Scene {

    private String impact;
    private Dialogue dialogue;

    public Scene() {
        dialogue = null;
    }

    public void setDialogue(Dialogue dialogue) {
        this.dialogue = dialogue;
    }

    public ArrayList<Sentence> getDialogues() {
        return dialogue.getDialogues();
    }
}
