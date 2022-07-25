package com.stacks;



public class Stacks {
	
node head;
node tail;

public void push (int data) {
	node newnode=new node( data);
	node temp=head;
	if(temp==null) {
		head=newnode;
		tail=newnode;
	}
	else {
		newnode.next=head;
		head=newnode;
	}
	
}
public void display() {
	node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
public class node{

    public  int data;
    public node next;

    public node(int data) {
        this.data = data;
   

}
}
}