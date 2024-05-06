package UI.Teleport;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeleportChoice {

    private final TeleportChoiceHandler tch = new TeleportChoiceHandler();

    public TeleportChoice() {

    }

    public class TeleportChoiceHandler implements ActionListener {

        public TeleportChoiceHandler() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();

            switch (actionCommand) {

            }
        }
    }
}
