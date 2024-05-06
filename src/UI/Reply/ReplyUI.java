package UI.Reply;

import UI.UI;
import UI.UIObject;

import javax.swing.*;

public class ReplyUI extends UIObject {

    private final UI ui;
    private JPanel replyScreen = null;
    private JPanel questionPanel = null;
    private JPanel replyPanel = null;

    public ReplyUI(UI ui) {
        this.ui = ui;
    }

    public void assignReplyScreen() {
        replyScreen = assignJPanel(getWindowHeight());

        questionPanel = assignJPanel(getWindowHeight()/2);
        JPanel filler = assignJPanel(getWindowHeight() * 75/600);
        questionPanel.add(filler, "North");
        JPanel questionRepresentation = assignJPanel(getWindowHeight() * 75/600);
        questionPanel.add(questionRepresentation, "Center");

        replyPanel = assignJPanel(getWindowHeight()/2);
        JPanel choicePanel = assignJPanel(getWindowHeight() * 150/600);
        replyPanel.add(choicePanel, "North");
        JPanel filler2 = assignJPanel(getWindowHeight() * 25/600);
        replyScreen.add(filler2, "Center");

        JPanel cancelPanel = assignJPanel(getWindowHeight() * 125/600);
        upBottomFiller(getWindowHeight() * 25/600, cancelPanel);
        cancelPanel.add(assignCancelButtonPanel());
        replyPanel.add(cancelPanel, "South");

        replyScreen.add(questionPanel, "North");
        replyScreen.add(replyPanel, "South");

        ui.getContainer().add(replyScreen);
    }

    private JPanel assignCancelButtonPanel() {
        JPanel cancelButtonPanel = assignJPanel(getWindowHeight() * 75/600);

        return cancelButtonPanel;
    }

    public JPanel getReplyScreen() {
        return replyScreen;
    }

    public JPanel getQuestionPanel() {
        return questionPanel;
    }

    public JPanel getReplyPanel() {
        return replyPanel;
    }
}
