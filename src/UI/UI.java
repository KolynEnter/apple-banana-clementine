package UI;

import UI.Reply.ReplyUI;
import UI.Screen.ScreenChoice;

import javax.swing.*;
import java.awt.*;

public class UI extends UIObject{

    private final JFrame window;
    private final Container container;

    public UI() {
        setLookAndFeel();
        window = assignWindow();
        window.setUndecorated(true);
        window.getRootPane().setWindowDecorationStyle(JRootPane.QUESTION_DIALOG);
        container = assignContainer(window);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        UI ui = new UI();
        ScreenChoice screenChoice = new ScreenChoice();
        ui.assignStartScreen(screenChoice.getSCH());
        ui.createUI();
        VisibilityManager vm = new VisibilityManager(ui);
        vm.exitStartScreen();
        ReplyUI replyUI = new ReplyUI(ui);
        replyUI.assignReplyScreen();
    }

    public void createUI() {
        // assign start screen here
        container.add(getStartScreen(), "Center");
        window.pack();
        window.setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void assignStartScreen(ScreenChoice.ScreenChoiceHandler sch) {
        initializeStartScreen();
        JPanel titlePanel = assignJPanel(getWindowHeight() * 4/12);
        JPanel optionPanel = assignJPanel(getWindowHeight() * 8/12);
        getStartScreen().add(titlePanel, "North");
        getStartScreen().add(optionPanel, "South");

        JLabel titleLabel = assignJLabel("Title");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(getTitleFont());
        titlePanel.add(titleLabel, "South");

        JPanel divider = assignJPanel(getWindowHeight()/12);
        optionPanel.add(divider, "North");

        JPanel filler = assignJPanel(1);
        filler.setPreferredSize(new Dimension(getWindowWidth()*7/20, getWindowHeight()*8/12));
        JPanel filler2 = assignJPanel(1);
        filler2.setPreferredSize(new Dimension(getWindowWidth()*7/20, getWindowHeight()*8/12));
        optionPanel.add(filler, "West");
        optionPanel.add(filler2, "East");

        JPanel options = assignJPanel(getWindowHeight() * 4/12);
        options.setLayout(new GridLayout(4, 1));
        optionPanel.add(options, "Center");

        JButton startButton = assignJButton("Start Game", "Start");
        startButton.addActionListener(sch);
        options.add(startButton);

        JButton button2 = assignJButton("Option2", "Option2");
        button2.addActionListener(sch);
        options.add(button2);

        JButton button3 = assignJButton("Option3", "Option3");
        button3.addActionListener(sch);
        options.add(button3);

        JButton button4 = assignJButton("Option4", "Option4");
        button4.addActionListener(sch);
        options.add(button4);

        JPanel filler3 = assignJPanel(getWindowHeight()/12);
        optionPanel.add(filler3, "South");
    }

    public Container getContainer() {
        return container;
    }
}
