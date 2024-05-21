package com.amol.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(34);
        list.insertFirst(-8);
        list.insertLast(108);
        list.insertFirst(4);
        list.insertFirst(0);
        list.insert(17,3);

//      list.deleteLast();
//      list.deleteFirst();

//        list.display();
//        list.delete(1);
        list.display();

    }
}
