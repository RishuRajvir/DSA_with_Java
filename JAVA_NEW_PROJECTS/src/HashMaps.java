import  java.util.*;
public class HashMaps {
//    public static void main(String[] args) {
//        HashMap<Integer, Integer> Hmap = new HashMap<>();
//        Hmap.put(2,3);
//        System.out.println(Hmap
//                .get(2));
//    }

}
 class HashMapPutExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);

        System.out.println(map);
    }
}


 class HashMapKeySetExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);

        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);
    }
}
