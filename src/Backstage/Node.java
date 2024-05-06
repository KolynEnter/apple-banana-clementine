package Backstage;

import java.util.ArrayList;

public class Node {

    private String designation = "default";
    private Scene scene;
    private final ArrayList<Node> neighbors;
    public int x;
    public int y;
    public int level;

    Node() {
        scene = null;
        neighbors = new ArrayList<>();
    }

    public Node(String designation) {
        scene = null;
        neighbors = new ArrayList<>();
        this.designation = designation;
    }

    public void addNeighbor(Node other) {
        if (!containsNode(other)) {
            neighbors.add(other);
        }
    }

    private boolean containsNode(Node node) {
        if (node == null) {
            return false;
        }

        for (Node n : neighbors) {
            if (node.isEqual(n)) {
                return true;
            }
        }

        return false;
    }

    public boolean isEqual(Node other) {
        if (other == null) {
            return false;
        }
        return this.designation.equals(other.designation);
    }

    public String toString() {
        return designation;
    }

    public ArrayList<Node> getNeighbors() {
        return neighbors;
    }

    public String getDesignation() {
        return designation;
    }

    public Scene getScene() {
        return scene;
    }
}
