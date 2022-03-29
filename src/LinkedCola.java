import java.util.LinkedList;

public class LinkedCola{

    LinkedList<Integer> cola = new LinkedList<Integer>();

    public void meter(int num){
        cola.addLast(num);
    }
    public int sacar(){
        return cola.removeFirst();
    }
}
