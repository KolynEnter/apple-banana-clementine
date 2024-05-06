package Utilities.GraphVisual;

import Backstage.Graph;
import Backstage.Node;

import java.util.ArrayList;

public class GraphicHelper {

    static int ACE;
    private final Graph graph;
    private ArrayList<Node>[] sorted = null;

    public GraphicHelper(Graph graph) {
        this.graph = graph;
    }

    public ArrayList<Node>[] getSortedGraph() {
        ArrayList<Node>[] output = new ArrayList[Graph.graphHeight];
        for (int i = 1; i <= Graph.graphHeight; i++) {
            ArrayList<Node> temp = new ArrayList<>();
            for (Node node : graph.getNodes()) {
                if (node.level == i) {
                    temp.add(node);
                }
            }
            output[i-1] = temp;
            if (output[i-1].size() > ACE) {
                ACE = output[i-1].size();
            }
        }
        sorted = output;

        return output;
    }

    public void updateX() {
        if (sorted == null) {
            return;
        }

        for (int i = 0; i < sorted.length; i++) {
            if (i == 0) {
                sorted[i].get(0).x = GraphicHelper.ACE * 60;
            } else {
                int initial = (sorted[i].size() - 1) * (-30) + sorted[0].get(0).x;
                for (Node node : sorted[i]) {
                    node.x = initial;
                    initial += 60;
                }
            }
        }
    }
}

