import java.util.LinkedList;

public class LinkedCola{

    LinkedList<Integer> cola = new LinkedList<Integer>();

    public void meter(int num){
        cola.add(num);
    }
    public int sacar(){
        return cola.removeFirst();
    }
}
