package Utilities.Searcher;

public class Run {
    private UI ui = new UI();
    private Mode mode = new Mode(ui);

    public Run() {
        ui.createUI(mode.getCh());
    }

    public static void main(String[] args) {
        Run itemQuery = new Run();
    }
}
