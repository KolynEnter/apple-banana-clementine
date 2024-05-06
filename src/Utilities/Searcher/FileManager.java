package Utilities.Searcher;

import java.io.*;
import java.util.ArrayList;


public class FileManager {

    private final ArrayList<Item> allItem = new ArrayList<>();

    public FileManager() {
        readAllItems();
    }

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        fileManager.printAllItem();
    }

    public void readAllItems() {
        int count = 1;

        FileInputStream f = null;
        try {
            f = new FileInputStream("src/Utilities/Searcher/SampleItemList");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert f != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(f));
        while (true) {
            try {
                if (!reader.ready()) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Item item = assignItem(reader.readLine(), count);
                allItem.add(item);
                count++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Item assignItem(String line, int code) {
        String[] splited = line.split("@@");
        String title = splited[0];
        String content = null;
        if (splited.length > 1) {
            content = splited[1];
        }

        return new Item(title, content, code);
    }

    public void printAllItem() {
        for (Item item : allItem) {
            System.out.println(item);
        }
    }

    public Item getCorrespondingItem(String itemName) {
        for (Item item : allItem) {
            if (item.getTitle().equals(itemName)) {
                return item;
            }
        }

        return null;
    }

    public ArrayList<Item> getAllItem() {
        return allItem;
    }
}
