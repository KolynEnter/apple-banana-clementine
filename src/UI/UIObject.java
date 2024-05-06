package UI;

import javax.swing.*;
import java.awt.*;

public class UIObject {

    private final int windowWidth = 1000;
    private final int windowHeight = 600;

    private final Font titleFont = new Font("Georgia", Font.BOLD, 40);
    private final Font normalFont = new Font("Georgia", Font.BOLD, 25);

    private JPanel startScreen;

    public UIObject() {

    }

    public void leftRightFiller(int fillerWidth, int fillerHeight, JPanel fillingPanel) {
        JPanel leftFiller = assignJPanel(1);
        leftFiller.setPreferredSize(new Dimension(fillerWidth, fillerHeight));
        JPanel rightFiller = assignJPanel(1);
        rightFiller.setPreferredSize(new Dimension(fillerWidth, fillerHeight));
        leftFiller.setBackground(Color.cyan);
        rightFiller.setBackground(Color.cyan);
        fillingPanel.add(leftFiller, "West");
        fillingPanel.add(rightFiller, "East");
    }

    public void upBottomFiller(int fillerHeight, JPanel fillingPanel) {
        JPanel upFiller = assignJPanel(fillerHeight);
        JPanel bottomFiller = assignJPanel(fillerHeight);
        upFiller.setBackground(Color.cyan);
        bottomFiller.setBackground(Color.cyan);
        fillingPanel.add(upFiller, "North");
        fillingPanel.add(bottomFiller, "South");
    }

    public JPanel assignJPanel(int height) {
        JPanel screen = new JPanel();
        screen.setBackground(Color.white);
        screen.setPreferredSize(new Dimension(windowWidth, height));
        screen.setLayout(new BorderLayout());
        return screen;
    }

    public JLabel assignJLabel(String content) {
        JLabel jLabel = new JLabel(content);
        jLabel.setForeground(Color.darkGray);
        jLabel.setFont(normalFont);

        return jLabel;
    }

    public JButton assignJButton(String text, String command) {
        JButton jButton = new JButton(text);
        jButton.setBackground(Color.white);
        jButton.setForeground(Color.darkGray);
        jButton.setFont(normalFont);
        jButton.setOpaque(true);
        jButton.setBorderPainted(false);
        jButton.setActionCommand(command);
        jButton.setFocusPainted(false);

        return jButton;
    }

    public JFrame assignWindow() {
        JFrame window = new JFrame();
        window.setSize(windowWidth, windowHeight);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(new BorderLayout());
        window.setResizable(false);
        return window;
    }

    public Container assignContainer(JFrame window) {
        Container container = window.getContentPane();
        container.setPreferredSize(new Dimension(windowWidth, windowHeight));

        return container;
    }

    public void initializeStartScreen() {
        startScreen = assignJPanel(windowHeight);
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public Font getTitleFont() {
        return titleFont;
    }

    public Font getNormalFont() {
        return normalFont;
    }

    public JPanel getStartScreen() {
        return startScreen;
    }
}
