/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg09.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Le
 */
public class MyList<T> {
    private T start, end;
    private List<T> list;
    
    public MyList() {
    	list = new ArrayList<T>();
    }
    
    public void append(T item) {
    	list.add(item);
    }
    
    public void appendList(MyList<T> myList) {
    	list.addAll(myList.list);
    }
    
    public void printAll() {
    	System.out.print(list.toString());
    }
    
    public static void main(String [] args) {
    	MyList<String> list = new MyList<String>();
    	list.append("Một");
    	list.append("Hai");
    	list.printAll();
    }
}
