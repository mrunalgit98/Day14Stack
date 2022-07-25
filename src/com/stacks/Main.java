package com.stacks;

public class Main {
	public static void main(String[] args) {
		Stacks l1=new Stacks();
		l1.push(70);
        l1.push(30);
        l1.push(56);
        System.out.println("element in stack");
        l1.display();
        
        
        Integer pv1=(Integer)l1.peek();
        l1.pop(pv1);
        System.out.println("peek value " +pv1);
        System.out.println("pop value " +pv1);
        l1.display();
        
        Integer pv2=(Integer) l1.peek();
        l1.pop(pv2);
        System.out.println("peek value " +pv2);
        System.out.println("pop value " +pv2);
        l1.display();
        
        Integer pv3 =(Integer)l1.peek();
        l1.pop(pv3);
        System.out.println("peek value " +pv3);
        System.out.println("pop value " +pv3);
        
        System.out.println("Stack is empty");
        
        System.out.println("-------------");
        
        Stacks l2=new Stacks();
        l2.add(56);
        l2.add(30);
        l2.add(70);
        System.out.println("element in queue");
        l2.display();
        
        
	}
}