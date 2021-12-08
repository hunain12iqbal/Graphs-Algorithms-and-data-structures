/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunain
 */

interface Stack<E>{
int size();
boolean isEmpty();
void psuh(E e);
E top();
E pop();
}

class StackArray<E> implements Stack<E>{
  
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    public StackArray(){
         this(CAPACITY);
    }
    public StackArray(int capacity){
         
        data =(E[]) new Object[capacity];
       }

    @Override
    public int size() {
        return t+1;
        
    }

    @Override
    public boolean isEmpty() {
        
        return (t==-1);           
        
    }

    @Override
    public void psuh(E e) {
        
        if(size()==data.length){
           System.out.println("Stack is full");
         }
        data[++t] = e;
        
    }

    @Override
    public E top() {
         if (isEmpty()){
           return null;
         }
        return data[t];
        }

    @Override
    public E pop() {
        if (isEmpty()){
           return null;
         }
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
    
    
    
    
    


}











public class StackImplemt {
    public static void main(String args[]){
    
    Stack<Integer> os = new  StackArray<Integer>(20);
    os.psuh(1);
    os.psuh(2);
    os.psuh(3);
    os.psuh(4);
    os.psuh(5);
   System.out.println( os.pop());
    
    
    
    
    }
}
