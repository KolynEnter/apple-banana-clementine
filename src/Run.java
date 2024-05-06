import Backstage.Graph;
import Backstage.Node;

public class Run {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node apple = new Node("apple");
        Node banana = new Node("banana");
        graph.addEdge(banana, apple);
        graph.addEdge(apple, banana);
        graph.addEdge(apple, new Node("clementine"));
        graph.printGraph();
    }
}
