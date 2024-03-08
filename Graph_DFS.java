
import java.util.*;
import java.io.*;

public class Graph_DFS
{
   //define a hashmap
   Map<String, Set<String>> m;
   boolean printed =false;
   ArrayList<String> visited;

   void solve(String x, String y)
   {
      if(m.get(x).contains(y)){
         printed = true;
         return;
      }
      visited.add(x);
      for(String check : m.get(x)){
         if(!visited.contains(check)){
         solve(check,y);
         }
      }
      return;
   }

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
         printed =false;
         visited = new ArrayList<>();
         String s = in.nextLine();
         String[] st = s.split(" ");
         String x = st[0];
         String y = st[1];
         solve(x,y);
         if(printed){
            System.out.println("Does a match exist? " + x + " and " + y +": MATCH");
         }
         else{
            System.out.println("Does a match exist? " + x + " and " + y +": NO MATCH");
         }
         //System.out.println(visited);

         //read in pair to check
         //pass some stuff to solve
      }

   }
   
   public static void main( String[] args ) throws Exception
   {
     Graph_DFS a = new Graph_DFS();
     a.run();   
   }
}

