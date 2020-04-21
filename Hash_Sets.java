package setsAndmaps;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   var set1=new HashSet<Integer>();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	set1.add(40);
	set1.add(50);
	set1.add(50);
//hashSets don`t allow dublicates like as in lists	
//	System.out.println(set1);
	//set1.remove(20);
	var set2=new HashSet<Integer>();
	set2.add(60);
	set2.add(70);
	set2.add(40);
	set2.add(80);
	set2.add(30);
	set2.add(10);
    //set1.addAll(set2);
	//set1.retainAll(set2);
//	System.out.println(set1);
	var list1 = new ArrayList<Integer>();
	list1.addAll(set1);
	System.out.println(list1);
	}
	
	

}
