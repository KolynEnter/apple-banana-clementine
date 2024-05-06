package UI.Reply;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReplyChoice {

    private final ReplyChoiceHandler rch = new ReplyChoiceHandler();

    public ReplyChoice() {

    }

    public class ReplyChoiceHandler implements ActionListener {

        public ReplyChoiceHandler() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();

            switch (actionCommand) {

            }
        }
    }
}
