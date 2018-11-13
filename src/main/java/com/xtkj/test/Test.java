package com.xtkj.test;

import com.xtkj.node.DoubleNode;

public class Test {
    @org.junit.Test
    public void afterNode() {
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);
        DoubleNode n4 = new DoubleNode(4);
        DoubleNode n5 = new DoubleNode(5);
        DoubleNode n6 = new DoubleNode(6);

        //13234
        n1.afterInsert(n2);
        n2.afterInsert(n3);
        n3.afterInsert(n4);
        n1.afterInsert(n3);
        System.out.println(n3.getPre().getData());
       /*System.out.println(n2.getPre().getData());
        System.out.println(n1.getPre().getPre().getData());
        System.out.println(n1.getPre().getData());
        System.out.println(n1.getNext().getNext().getNext().getData());
        */
    }


}
