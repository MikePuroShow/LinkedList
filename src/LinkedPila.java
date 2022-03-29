import java.util.LinkedList;

public class LinkedPila {
    LinkedList<Integer> pila = new LinkedList<Integer>();

    public void push(int num){
        pila.addFirst(num);
    }
    public int pop(){
        return pila.removeLast();
    }
    public int top(){
        return pila.getLast();
    }
}
