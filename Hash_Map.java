package setsAndmaps;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   var map =new HashMap<Integer,String>();
   map.put(1, "jan");
   map.put(2, "feb");
   map.put(3, "mar");
   map.put(4, "apr");
   map.put(5, "may");
   System.out.println(map.get(2));
   System.out.println(map.containsKey(3));
  // map.put(4, "Dec");
//   map.remove(4);
   var set1 = map.keySet();
   var set2 = map.values();
   var set3 = map.entrySet();
   System.out.println(set1);
   System.out.println(set2);
   System.out.println(set3);
   System.out.println(map);
	}

}
