
import java.util.ArrayList;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunain
 */
import java.util.LinkedList;



public class Graph {
    
    class node<E>{
  E elements;
  node ref;
  
  public node(E v){
    this.elements = v;
  }
   public E getElements(){
     return elements;
   }
   public void setElements(E e){
      this.elements = e;
   }
  
  
  
  
}

    
    
 int vertex;
 LinkedList<node> list[];

 public Graph(int vertex) {
 this.vertex = vertex;
 list = new LinkedList[vertex];
 for(int i = 0; i <vertex ; i++) {
 list[i] = new LinkedList<>();
 }
 }

 public void addEdge(int source, int destination){

 //add edge
 

 //add back edge ((for undirected)
 
 }

 public void printGraph(){
 for (int i = 0; i <vertex ; i++) {
 if(list[i].size()>0) {
 System.out.print("Vertex " + i + " is connected to: ");
 for (int j = 0; j < list[i].size(); j++) {
 System.out.print(list[i].get(j) + " ");
 }
 System.out.println();
 }
 }
 }

 public static void main(String[] args) {
 Graph graph = new Graph(5);
 graph.addEdge(0,1);
 graph.addEdge(0, 4);
 graph.addEdge(1, 2);
 graph.addEdge(1, 3);
 graph.addEdge(1, 4);
 graph.addEdge(2, 3);
 graph.addEdge(3, 4);
 
 }
}


           
    
    
    

