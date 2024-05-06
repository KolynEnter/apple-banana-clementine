package Backstage;

import java.io.*;
import java.util.ArrayList;

public class Dialogue {
    private final ArrayList<Sentence> dialogues;

    public Dialogue() {
        dialogues = new ArrayList<>();
    }

    public static void main(String[] args) {
        Dialogue dialogue = new Dialogue();
        dialogue.breakDown("src/Dialogue/SampleDialogue");
        System.out.println(dialogue.getDialogues());
    }

    public void breakDown(String dialogueText) {
        FileInputStream f = null;
        try {
            f = new FileInputStream(dialogueText);
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
                String[] tuple = reader.readLine().split("@@");
                int serialNumber = Integer.parseInt(tuple[0]);
                String namePosition = tuple[1];
                String speaker = tuple[2];
                String phrase = tuple[3];
                int replyNumber = Integer.parseInt(tuple[4]);
                String result = null;
                if (replyNumber == 0) {
                    result = tuple[5];
                }
                Sentence sentence = new Sentence(serialNumber, namePosition, speaker, phrase);
                if (result != null) {
                    sentence.setResult(result);
                }
                while (replyNumber > 0) {
                    sentence.addReply(reader.readLine());
                    replyNumber--;
                }
                dialogues.add(sentence);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Sentence> getDialogues() {
        return dialogues;
    }
}
