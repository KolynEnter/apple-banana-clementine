package UI.Dialogue;

import UI.UI;
import UI.UIObject;

import javax.swing.*;
import java.awt.*;

public class DialogueUI extends UIObject {

    private final UI ui;
    private JPanel dialogueScreen = null;
    private JPanel namePanel = null;
    private JPanel sentencePanel = null;
    private JPanel replyPanel = null;

    public DialogueUI(UI ui) {
        this.ui = ui;
    }

    public void assignDialogueScreen() {
        dialogueScreen = assignJPanel(getWindowHeight());

        JPanel dialoguePanel = assignJPanel(getWindowHeight()/2);
        dialogueScreen.add(dialoguePanel, "South");

        namePanel = assignJPanel(getWindowHeight() * 50/600);
        dialoguePanel.add(namePanel, "North");
        namePanel.setBackground(Color.blue);

        sentencePanel = assignJPanel(getWindowHeight() * 130/600);
        dialoguePanel.add(sentencePanel, "Center");

        JPanel sentenceRepresentation = assignJPanel(1);
        sentenceRepresentation.setPreferredSize(new Dimension(getWindowWidth()*96/100, getWindowHeight() * 130/600));
        sentencePanel.add(sentenceRepresentation, "Center");

        leftRightFiller(getWindowWidth()* 2/100, getWindowHeight() * 130/600, sentencePanel);

        replyPanel = assignJPanel(getWindowHeight() * 120/600);
        dialoguePanel.add(replyPanel, "South");
        replyPanel.setBackground(Color.yellow);

        upBottomFiller(getWindowHeight() * 10/600, replyPanel);
        leftRightFiller(getWindowWidth()/3, getWindowHeight() * 120/600, replyPanel);

        ui.getContainer().add(dialogueScreen);
    }

    public JPanel getDialogueScreen() {
        return dialogueScreen;
    }

    public JPanel getNamePanel() {
        return namePanel;
    }

    public JPanel getSentencePanel() {
        return sentencePanel;
    }

    public JPanel getReplyPanel() {
        return replyPanel;
    }
}
