import java.util.Iterator;
import java.util.LinkedList;


public class DFS {

    private LinkedList<Integer> adj[];
    private boolean visited[];
    DFS(int v){

        adj = new LinkedList[v];
        visited = new boolean[v];

        for (int i=0; i<v; i++)
            adj[i] = new LinkedList<>();
    }

    void insertRdge(int src, int dest){
        adj[src].add(dest);
    }
    void DFS (int vertex){
        visited[vertex] = true;
        System.out.println(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n = it.next();
            if(!visited[n])
                DFS(n);
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(8);
        graph.insertRdge(0,1);
        graph.insertRdge(0,2);
        graph.insertRdge(0,3);
        graph.insertRdge(1,3);
        graph.insertRdge(2,4);
        graph.insertRdge(3,5);
        graph.insertRdge(3,6);
        graph.insertRdge(4,7);
        graph.insertRdge(4,5);
        graph.insertRdge(5,2);
        System.out.println("Depth First Traversal for the graph is : ");
        graph.DFS(0);
    }
}