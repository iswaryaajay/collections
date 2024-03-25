/*
*  Collections
*  Map
*  HashMap
*  LinkedHashMap
*  TreeMap
*/

package collections;

import java.util.*;

public class Collections {

    public static void main(String[] args){
        final  HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(100, "Iswarya");
        hashMap.put(101, "Ajay");
        hashMap.put(102, "Aswitha");
        hashMap.put(103, "Nila");
        System.out.println(hashMap);
        final Set set = hashMap.entrySet();

        System.out.println(set);
        final Set sets = hashMap.keySet();

        System.out.println(sets);
        final String key = "Iswarya";

        System.out.println(hashMap.containsKey(key));
        final int value = 109;

        System.out.println(hashMap.containsValue(value));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.getClass());
        System.out.println(hashMap.size());
        final Collection collection = hashMap.values();

        System.out.println(collection);
        final Set entry = hashMap.entrySet();

        System.out.println(entry);
        final HashMap clone = (HashMap) hashMap.clone();

        System.out.println(clone);
        final String remove = "Iswarya";

        hashMap.remove(remove);
        System.out.println(remove);
        final int get = 102;

        hashMap.get(get);
        System.out.println(get);
        final Iterator iterator = set.iterator();

        while(iterator.hasNext()){
           final Map.Entry map = (Map.Entry) iterator.next();

            System.out.println(map.getKey());
            System.out.println(map.getValue());
            System.out.println(map.getClass());
        }
        hashMap.replace(102,"Aswitha","Surya");
        System.out.println(hashMap);
        hashMap.clear();
        System.out.println(hashMap);
    }
}

