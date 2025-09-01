import java.util.*;
public class Hashing
{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        for(Map.Entry<String,Integer> e:map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
           // System.out.println(e);
        }

        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key+" "+map.get(key));
        }
    }
}