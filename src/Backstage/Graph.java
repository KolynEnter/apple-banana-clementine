package Backstage;

import java.util.ArrayList;

public class Graph {

    private final ArrayList<Node> nodes;
    protected static int h = 120;
    public static int graphHeight = 0;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addEdge(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }

        boolean hasNode1 = containsNode(node1);
        boolean hasNode2 = containsNode(node2);

        if (!hasNode1 && !hasNode2) {
            nodes.add(node1);
            nodes.add(node2);
            Node n1 = findNode(node1);
            Node n2 = findNode(node2);
            n1.addNeighbor(n2);
            n1.level = 1;
            n2.level = n1.level + 1;
            n1.y = 10;
            n2.y = n1.y + h;
            updateHeight(node2.level);
        } else if (hasNode1 && !hasNode2) {
            nodes.add(node2);
            Node n1 = findNode(node1);
            Node n2 = findNode(node2);
            n1.addNeighbor(n2);
            n2.level = n1.level + 1;
            n2.y = n1.y + h;
            updateHeight(Math.max(node1.level, node2.level));
        } else if (!hasNode1) {
            nodes.add(node1);
            Node n1 = findNode(node1);
            Node n2 = findNode(node2);
            n1.addNeighbor(n2);
            n1.level = n2.level + 1;
            n1.y = n2.y + h;
            updateHeight(Math.max(node1.level, node2.level));
        } else {
            Node n1 = findNode(node1);
            Node n2 = findNode(node2);
            n1.addNeighbor(n2);
            updateHeight(Math.max(node1.level, node2.level));
        }
    }

    private void updateHeight(int newHeight) {
        if (newHeight > graphHeight) {
            graphHeight = newHeight;
        }
    }

    private boolean containsNode(Node node) {
        if (node == null) {
            return false;
        }

        for (Node n : nodes) {
            if (node.isEqual(n)) {
                return true;
            }
        }

        return false;
    }

    public Node findNode(Node node) {
        if (node == null) {
            return null;
        }

        for (Node n : nodes) {
            if (node.isEqual(n)) {
                return n;
            }
        }

        return null;
    }

    public void printGraph() {
        for (Node graphNode : nodes) {
            System.out.print(graphNode.getDesignation());
            System.out.println(" #Level" +graphNode.level +" & y = " + graphNode.y +
                    " -> "+ graphNode.getNeighbors());
        }
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }
}
