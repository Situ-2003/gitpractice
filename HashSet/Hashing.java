import java.util.HashSet;
import java.util.Iterator;
public class Hashing
{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search- contains
        if(set.contains(1))
        {
            System.out.println("Set contains 1");
        }
        if(!set.contains(4))
        {
            System.out.println("Not contains 4");
        }

        System.out.println(set);
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        


    }
}