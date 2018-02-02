/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Lovro
 * @param <T>
 */
public class PathStack<T> {

    private Path<T> data = null;
    
    public void push(T element) {
        data = new NumberPath(element, data); //data is on top of the stack
    }

    public T pop() {
    T element = data.getFirst();
    data = data.getRest();
    return element;
   }
  public boolean isEmpty() {   
      return data.getRest() == null; // if this is the case, we are at the bottom of the stack
 }
  public Path<T> getData() {
      return data;
  }
  
  public Long max(NumberPath path) {
        Long first = (Long) path.getFirst();
        if (path.getRest() == null) {
            return first;
        }
        Long maxOfRest = max((NumberPath) path.getRest());
        return first > maxOfRest ? first : maxOfRest;
    }

    public Long sum(NumberPath path) {
        if (path.getRest() == null) { //stopping point in recursive method
            return 0l; 
        }
        return (Long) path.getFirst() + sum((NumberPath) path.getRest());
    }
}
