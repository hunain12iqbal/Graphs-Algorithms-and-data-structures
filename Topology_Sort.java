    
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.ListIterator;
import java.util.Scanner;  


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunain
 */
public class Topology_Sort {
    
   List<Vertex> openlist;
   Stack<Vertex> stack;
   ArrayList<Vertex> oderlist;
   
   private class Vertex {
     String name;
     List<Vertex> neighbour;
     boolean visited;
     
     public Vertex(String name){
          this.name = name;
          this.visited = false;
          this.neighbour =new ArrayList<>();
     }
     public String getName(){
          return this.name;
       }
     public void setName(String name){
       this.name = name;
     }
     public boolean isVisited(){
        return this.visited;
     }
     public void setVisited(boolean v){
          this.visited = v;
     }
     public String toString(){
        return this.name;
     }
     
     public void addNeighbour(Vertex neeighbour){
             this.neighbour.add(neeighbour);
     }
     public List<Vertex> getNeighbour(){
       return this.neighbour;
     } }
   
   public void topological(List<Vertex> vertex){
       for(Vertex v : vertex){
          if(!v.isVisited() && v!=null){
               topoordering(v);
               v.setVisited(true);
          }
       
       } }
   public void topoordering(Vertex v)
   {
         this.stack.push(v);
         for(Vertex vv : v.getNeighbour()){
            if(!vv.isVisited() && !v.getNeighbour().isEmpty()){
                
                
               topoordering(vv);
               vv.setVisited(true);
            }
         }
         this.oderlist.add(stack.pop());
   
   
   
   }
   public Topology_Sort(){
   
     this.stack = new Stack<>();
     this.oderlist  = new ArrayList<>();
     Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");
        Vertex I = new Vertex("I");
        Vertex J = new Vertex("J");
        Vertex K = new Vertex("K");
        Vertex L = new Vertex("L");
        Vertex M = new Vertex("M");  
        
        
        this.openlist = new ArrayList<>();
        openlist.add(H);
        openlist.add(E);
        openlist.add(C);
        openlist.add(A);
        openlist.add(B);
        openlist.add(D);
        openlist.add(F);
        openlist.add(G);
        openlist.add(I);
        openlist.add(J);
        openlist.add(K);
        openlist.add(L);
        openlist.add(M);
   
   
        A.addNeighbour(D);
        B.addNeighbour(D);
        C.addNeighbour(A);
        C.addNeighbour(B);
        D.addNeighbour(H);
        D.addNeighbour(G);
        E.addNeighbour(A);
        E.addNeighbour(D);
        E.addNeighbour(F);
        F.addNeighbour(K);
        F.addNeighbour(J);
        G.addNeighbour(I);
        H.addNeighbour(J);
        H.addNeighbour(I);
        I.addNeighbour(L);
        J.addNeighbour(M);
        J.addNeighbour(L);
        K.addNeighbour(J);
        
        topological(openlist);
        
   }
    
   
    
     
    
    
    
   public static void main(String args[]){
  Topology_Sort top =     new Topology_Sort();
     
        for(int i=0;  i<=top.oderlist.size()-1;  i++){
         System.out.print(top.oderlist.get(i)+" ");
        
          
        }
   
   } 
    
    
}
