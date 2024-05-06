package UI.Explore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExploreChoice {

    private final ExploreChoiceHandler ech = new ExploreChoiceHandler();

    public ExploreChoice() {

    }

    public class ExploreChoiceHandler implements ActionListener {

        public ExploreChoiceHandler() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();

            switch (actionCommand) {

            }
        }
    }
}
