package UI.Screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenChoice {

    private final ScreenChoiceHandler sch = new ScreenChoiceHandler();

    public ScreenChoice() {

    }

    public class ScreenChoiceHandler implements ActionListener {

        public ScreenChoiceHandler() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();

            switch (actionCommand) {

            }
        }
    }

    public ScreenChoiceHandler getSCH() {
        return sch;
    }
}
