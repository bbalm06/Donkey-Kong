
import java.util.*;
import java.io.*;

public class Graph_BFS
{
   Map<String, Set<String>> m;
   public boolean found = false;
   //define a hashmap
   
   public void run() throws Exception
   {
      System.out.println( "Graph_BST" );



      Scanner in = new Scanner( new File("graph.dat") );
      m = new HashMap<>();

      int c = in.nextInt();
      in.nextLine();
      System.out.println( c );

      for( int r = 0; r < c; r++ )
      {
         String s = in.nextLine();
         String[] sr = s.split(" ");
         if(m.get(sr[0]) == null){
            Set<String> con = new HashSet<>();
            con.add(sr[1]);
            m.put(sr[0],con);
         }
         else{
            m.get(sr[0]).add(sr[1]);
         }
         if(m.get(sr[1]) == null){
            Set<String> con = new HashSet<>();
            con.add(sr[0]);
            m.put(sr[1],con);
         }
         else{
            m.get(sr[1]).add(sr[0]);
         }
      }
      System.out.println(m);

      c = in.nextInt();
      in.nextLine();
      for( int r = 0; r < c; r++ )
      {
         found = false;
         String s = in.nextLine();
         String[] st = s.split(" ");
         ArrayList<String> visited = new ArrayList<>();
         //read in pair to check
         Queue<String> Q = new LinkedList<>();
         //make a visited list - will store each node after you visit it
         Q.add(st[0]);
         visited.add(st[0]);
         //make a new queue
         //add starting node to the queue and visited list
          while(!Q.isEmpty()){
            String current = Q.remove();
            if(current.equals(st[1])){
               found = true;
            }
            else{
               visited.add(current);
               Q.addAll(m.get(current));
               Q.removeAll(visited);
            }

          }
          if(found){
             System.out.println("Does a match exist? " + st[0] + " and " + st[1] + ": MATCH");
          }
          else{
             System.out.println("Does a match exist? " + st[0] + " and " + st[1] + ": NO MATCH");
          }

         //while the queue is not empty
         
            //get the first node from the queroue
            
            //get first nodes connections
            
            //loop through the connection
            
               //if you have not already visited this node
               //see if it is a match 
               //add stuff to the queue and to visited
 
      }
   }
   
   public static void main( String[] args ) throws Exception
   {
     Graph_BFS a = new Graph_BFS();
     a.run();   
   }
}

