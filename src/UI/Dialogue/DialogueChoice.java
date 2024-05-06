package UI.Dialogue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogueChoice {

    private final DialogueChoiceHandler dch = new DialogueChoiceHandler();

    public DialogueChoice() {

    }

    public class DialogueChoiceHandler implements ActionListener {

        public DialogueChoiceHandler() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();

            switch (actionCommand) {

            }
        }
    }
}
