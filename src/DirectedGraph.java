import java.util.ArrayList;

class Edge {
    int startVertex;
    int endVertex;
    int weight;
    
    //constructor that initializes proporties of Edge class
    public Edge(int start, int end, int weight) {
        this.startVertex = start;
        this.endVertex = end;
        this.weight = weight;
    }
}

public class DirectedGraph {
    //main method is the entry point of java program
    public static void main(String[] args) {
        int vertex = 5;
        //value of vertexes
        int[][] matrix = new int[vertex+1][vertex+1];
        
        //to store the Edges informarion
        ArrayList<Edge> edgeList = new ArrayList<Edge>();
        edgeList.add(new Edge(1, 4,2));
        edgeList.add(new Edge(4, 2,15));
        edgeList.add(new Edge(2, 5,8));
        edgeList.add(new Edge(3, 5,6));
        edgeList.add(new Edge(3, 1,10));
        edgeList.add(new Edge(3, 4,5));
        edgeList.add(new Edge(2, 1,7));
        
        //loop of the ArrayList
        for(int i=0; i<edgeList.size(); i++){
            //define the variable Edge as currentEdge
            Edge currentEdge = edgeList.get(i);
            //stored the information in these 3 variables
            int startVertex = currentEdge.startVertex;
            int endVertex = currentEdge.endVertex;
            int weight = currentEdge.weight;
            //updated matrix and created data structure for weighted Directed Graph
            matrix[startVertex][endVertex] = weight;
        }

        for(int i = 1; i<=vertex; i++){
            for(int j=1; j<=vertex; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            //to move to the next line
        }
    }
}

