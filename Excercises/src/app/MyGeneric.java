package app;

import java.util.List;

public class MyGeneric<T> {
	private List<T> list = null;


	public void add(T a) {
		list.add(a);
	}

	public void printList(boolean oddFlag) {
		
		int i = oddFlag ? 0 : 1;
		for (; i < list.size(); i += 2) {
			System.out.println(list.get(i));
		}
	}


}
