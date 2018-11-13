package com.xtkj.node;

public class DoubleNode {
    DoubleNode pre;
    DoubleNode next;
    int data;

    /**
     * 双向链表，上一个及下一个都是自己
     */
    public DoubleNode(int data) {
        this.pre = this;
        this.next = this;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode getPre() {
        return pre;
    }

    public void afterInsert(DoubleNode node) {
        DoubleNode nextNext = this.next;
        this.next = node;
        node.pre = this;
        node.next = nextNext;
        nextNext.pre = node;
    }

    public void preInsert(DoubleNode node) {
        DoubleNode prePre = this.pre;
        node.next = this;
        this.pre = node;
        node = prePre.next;
        pre.next = node;
    }
}
