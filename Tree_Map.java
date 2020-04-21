package setsAndmaps;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 var map = new TreeMap<Character,Integer>();
		 map.put('a', 1000);
		 map.put('d', 2000);
		 map.put('c', 3000);
		 map.put('b', 4000);		 
		 System.out.println(map.containsValue(3000));
		 //map.put('d', 8000);
		 map.replace('d', 8000);
	     System.out.println(map);
	     System.out.println(map.firstKey());
	     System.out.println(map.firstEntry());
	     System.out.println(map.lastKey());
	     System.out.println(map.lastEntry());
	     System.out.println(map.pollFirstEntry());
	     System.out.println(map.pollLastEntry());
	     
			 
	}

}
