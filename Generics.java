import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Generics {

    public static void main(String[] args) {
        Container<Integer, String> container = new Container<>(12, "Hello");
        int val1 = container.getItem1();
        System.out.println("val1: " + val1);
        String val2 = container.getItem2();
        System.out.println("val2: " + val2);

        Container<Double, Integer> container2 = new Container<>(12.0, 34);

        Set<String> mySet1 = new HashSet<>(  );
        mySet1.add( "first" );
        mySet1.add( "second" );
        mySet1.add( "third" );

        Set<String> mySet2 = new HashSet<>();
        mySet2.add( "first" );
        mySet2.add( "second" );
        mySet2.add( "seventh" );

        Set<String> mySet3 = new HashSet<>();

        boolean resultSets = mySet3.addAll( mySet1 ) && mySet3.addAll( mySet2 );

        if(resultSets) {
            System.out.println("mySet3: " + mySet3);
        }

        Iterator<String> itr = mySet3.iterator();

        while (itr.hasNext()){
            String var = itr.next();
            System.out.print(var + ", ");
        }
    }
}

class Container<i1, i2> {
    i1 item1;
    i2 item2;

    public Container(i1 item1, i2 item2){
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems(){
        System.out.println("Printing contents of container: ");
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }

    public i1 getItem1() {
        return item1;
    }

    public i2 getItem2() {
        return item2;
    }
}

