package setsAndmaps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Iterating_Over_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1=new HashSet<Integer>();
			set1.add(100);
			set1.add(200);
			set1.add(300);
			set1.add(400);
			set1.add(500);
			set1.add(600);
			for(int x: set1) {
				System.out.println(x);
				 var Set2 = new TreeSet<String>();
				    Set2.add("Roy");
				    Set2.add("boy");
				    Set2.add("toy");
				    Set2.add("bob");
				Iterator it1= Set2.iterator();
				while(it1.hasNext()) {
					System.out.println(it1.next());
				}
			}

	}

}
