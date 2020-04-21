package setsAndmaps;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Linked_hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
    set1.add('a');
    set1.add('e');
    set1.add('i');
    set1.add('o');
    set1.add('u');
    System.out.println(set1);
    System.out.println(set1.size());
    System.out.println(set1.contains('w'));
    var list2 = new ArrayList<Character>();
    list2.addAll(set1);
	System.out.println(list2);
	}

}
