package Graph;
import java.util.LinkedList;

public class Graph1 {
    LinkedList<Integer>[] adj;
    int nodes;
    Graph1(int nodes) {
        adj = new LinkedList[nodes];
        this.nodes=nodes;
        for (int i = 0; i < nodes; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
    this.adj[u].add(v);
    this.adj[v].add(u);

    }
    void display(){
        for(int i=0;i<nodes;i++){
            for(int j=0;j<adj[i].size();j++){
                System.out.print(adj[i].get(j)+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Graph1 graph = new Graph1(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.display();
     
    }

    
}
