package asg09.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import asg09.pair.Pair;
public class ArrayAlg<T extends List> {
	public void printArray(T a) {
		
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) +" ");
		}
		System.out.println();
	}
	
	public void printArray(T a, int start, int end) throws Exception {
		
		if(start < 0 || start > a.size()) {	
			throw new InvalidSubscriptException("Start index is invalid!");
		}
		else if(end < 0 || end >a.size()) {
			
			throw new InvalidSubscriptException("End index is invalid!");
		}
		else if(end <start) {
			throw new InvalidSubscriptException("End index is must geater than start");
		}
		else {
			for(int i = start; i<= end; i++) {
				System.out.print(a.get(i) + " ");
			}
		}
		System.out.println();
		
	}
	
	public Pair<T> maxTwo(T[] a) {
		T firstMax, secondMax;
		firstMax = secondMax = a[0];
		for(int i = 1; a[i] != null; i++) {
			if(a[i].toString().compareTo( firstMax.toString() ) > 0) {
				firstMax = a[i];
			}
			else if(a[i].toString().compareTo( secondMax.toString() ) > 0) {
				secondMax = a[i];
			}
		}
		return new Pair<T>(firstMax, secondMax);
	}
	public static void main(String [] args)  {
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		ArrayAlg<List> test = new ArrayAlg<List>();
		System.out.print("All elements of Array a: ");
		test.printArray(a);
		int start =1; 
		int end =2;
		System.out.print("Elements from " +start+" to " +end +  " of Array a: ");
		try{
			test.printArray(a,start, end);
		}
		catch(Exception e) {
			e.printStackTrace();
			//throw e;
		}
	}
}
