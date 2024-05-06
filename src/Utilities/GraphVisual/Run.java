package Utilities.GraphVisual;

import Backstage.Node;
import java.io.File;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        GraphicGraph graph = new GraphicGraph();

        try {
            File file = new File("Utilities/TestGraph.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] stringResult = line.split(" ");
                int integer1 = Integer.parseInt(stringResult[0]);
                int integer2 = Integer.parseInt(stringResult[1]);
                graph.addEdge(new Node(integer1+""), new Node(integer2+""));
            }
            graph.drawGraph();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
