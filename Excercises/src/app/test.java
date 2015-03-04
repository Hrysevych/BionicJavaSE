package app;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;




public class test {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		ListIterator i = l.listIterator();
		i.next();i.next();i.next();i.next();
		i.remove();
		System.out.println(l.get(0));
	}
	
}
		 	
		

