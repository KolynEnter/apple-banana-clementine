package Utilities.Searcher;

public class Item {

    private final String title;
    private final String content;
    private final int code;

    public Item(String title, String paragraph, int code) {
        this.title = title;
        this.content = paragraph;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getCode() {
        return code;
    }
}
