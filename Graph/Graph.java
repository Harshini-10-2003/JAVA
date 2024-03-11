package Graph;
public class Graph {
    public int adj[][];
    public int size;
    public Graph(int node){
      adj=new int[node][node];
      this.size=node;
    }
    public void addEdge(int row ,int column){
        this.adj[row][column]=1;
        this.adj[column][row]=1;
  }
  public static void main(String[] args) {
    Graph g=new Graph(4);
    g.addEdge(0,1);
    g.addEdge(1,2 );
    g.addEdge(2,3 );
    g.addEdge(3, 0);
    for(int i=0;i<g.size;i++){
        for(int j=0;j<g.size;j++){
           System.out.print(g.adj[i][j]+" ");
        }
        System.out.println();
    }
  }

}
