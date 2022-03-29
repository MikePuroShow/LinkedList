public class Principal {


    public static void main(String[] args) {
        LinkedCola e = new LinkedCola();
        for(int i=0; i<5; i++){
            e.meter(i);
        }
        System.out.println(e.cola);
        while (e.cola.size()!=0){
            System.out.println("El elemento a sacar es" + " " + e.sacar());
        }
        System.out.println(e.cola);
        System.out.println("--------------------------SEPARACION-----------------------------------");
/*//////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        LinkedPila o = new LinkedPila();
        for(int i=0; i<5; i++){
            o.push(i);
        }
        System.out.println(o.pila);
        System.out.println(o.top());
        while (o.pila.size()!=0){
            System.out.println(o.top());
            System.out.println("El elemento a sacar es" + " " + o.pop());
        }
        System.out.println(o.pila);
    }






}
