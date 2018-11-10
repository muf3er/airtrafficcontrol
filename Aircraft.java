/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atcapplication;

import java.util.LinkedList;

public class Aircraft {
    // stores data
private static final int INITIAL_ALLOCATION = 20;

    static void get(LinkedList<String> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
private int size = INITIAL_ALLOCATION; 

//declare LinkedList and node names
static LinkedList <String> list = new LinkedList <String> ();
private Aircraft head = new Aircraft ();
private Aircraft tail = new Aircraft ();

// tells list to add nodes
public  void addNodes (int n, LinkedList<String> s) {
    s = list;
    head.next = tail;
    tail.next = tail;
    size = n;
    Aircraft temp = head;
    for (int i= 0; i < size; ++i) {
        temp.next = new Aircraft ();
        temp = temp.next;
    }
    temp.next = tail;
}


private String value;
Aircraft craft;

public Aircraft (String v) {
    value = v;
}

public Aircraft () {

}

public String get () {
    return value;
}

public void set (String v) {
    value = v;
}

public Aircraft next = null;

//auto generated method from ATControl 
public static void add(String flight) {
    
    // a for or while loop might be needed here. Seems to easy to just have an empty add class

}
//auto generated method from ATControl
public static void remove() {
    

}
    
}
