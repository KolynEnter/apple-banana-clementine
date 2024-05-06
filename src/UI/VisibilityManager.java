package UI;

import UI.Dialogue.DialogueUI;

public class VisibilityManager {

    private final UI ui;

    public VisibilityManager(UI ui) {
        this.ui = ui;
    }

    public void enterStartScreen() {
        ui.getStartScreen().setVisible(true);
    }

    public void exitStartScreen() {
        ui.getStartScreen().setVisible(false);
    }

    public void enterDialogue(DialogueUI dialogueUI) {
        dialogueUI.getDialogueScreen().setVisible(true);
    }

    public void exitDialogue(DialogueUI dialogueUI) {
        dialogueUI.getDialogueScreen().setVisible(false);
    }
}
