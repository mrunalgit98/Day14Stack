package com.stacks;



public class Stacks <T>{
	
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
public class node<T>{

    public  T data;
    public node<T> next;

    public node(T data) {
        this.data = data;
    }    
}
public T peek(){
	return (T) head.data;
}
public void pop(T peakValue) {
	node<T> n1=new node<>(peakValue);
	n1=head;
	node<T> nextnode=n1.next;
	head=nextnode;
	n1.next=null;
	n1.data= null;
	
	
}

}