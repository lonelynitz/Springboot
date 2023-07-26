package Springboot;

package com.SpringLog.SpringWorks;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Alpha{
	
	void sum(int a , int b);
	void avg (int a , int b);
}
@Component("Task")
@Primary
class Task implements Alpha{

	@Override
	public void sum(int a, int b) {
		System.out.println("Sum : " + a+b);
		
	}

	@Override
	public void avg(int a, int b) {
		System.out.println("Average : " + 2*(a+b)/2);
		
	}
}
@Component("Task1")
class Task1 implements Alpha{

	@Override
	public void sum(int a, int b) {
		System.out.println("Task 1 - Sum : " + a+b);
		
	}

	@Override
	public void avg(int a, int b) {
		System.out.println("Task 1 - Average : " + 2*(a+b)/2);
		
	}
}

@Component
class control{
	
	@Autowired
	@Qualifier("Task1")
	 public Alpha info;
	
	control(Alpha info){
		this.info = info;
	}
	
	public void Work() {
		
		Scanner beta = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = beta.nextInt();
		System.out.println("Enter Second Number");
		int b = beta.nextInt();
		
		
		info.avg(a, b);
		info.sum(a, b);
	}
}
