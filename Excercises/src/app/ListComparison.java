package app;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListComparison {

	static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	static LinkedList<Integer> linkedList = new LinkedList<Integer>();

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			arrayList.add(5);
			linkedList.add(5);
		}
		double startTime;
		double finishTime;
		double arrayListTime;
		double linkedListTime;
		for (int n = 10; n < 1000000; n *= 10) {
			startTime = System.nanoTime();
			addToArrayList(n);
			finishTime = System.nanoTime();
			arrayListTime = finishTime - startTime;
			startTime = System.nanoTime();
			addToLinkedList(n);
			finishTime = System.nanoTime();
			linkedListTime = finishTime - startTime;
			System.out.println("Number of elements is " + n);
			double factor;
			if (arrayListTime > linkedListTime) {
				factor = (double) arrayListTime / linkedListTime;
				System.out.println("ArrayList is "
						+ String.format("%.2f", factor)
						+ " times faster than LinkedList ");
			} else {
				factor = (double) linkedListTime / arrayListTime;
				System.out.println("LinkedList is "
						+ String.format("%.2f", factor)
						+ " times faster than ArrayList");
			}

		}
	}

	public static void addToArrayList(int n) {
/*		int position = arrayList.size() / 2;*/
		for (int i = 1; i <= n; i++) {
			arrayList.add(i/2, 5);
		}
	}

	public static void addToLinkedList(int n) {
/*		int position = linkedList.size() / 2;*/
		for (int i = 1; i <= n; i++) {
			linkedList.add(i/2, 5);
		}
	}

}