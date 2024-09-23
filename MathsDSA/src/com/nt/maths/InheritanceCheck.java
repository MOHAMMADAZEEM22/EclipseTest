package com.nt.maths;

class A{
	public void m1() {
		System.out.println("A.m1()");
	}
	public void m3() {
		System.out.println("A.m3()");
	}
}

public class InheritanceCheck extends A {
	 public void m1(){
			System.out.println("B.m1()");
	   	}
	 public void m2(){
			System.out.println("B.m2()");
	   	}
	 public void m3() {
			System.out.println("B.m3()");
		}
	

	public static void main(String[] args) {
		
		A a1 = new  InheritanceCheck();
		a1.m1();
		a1.m3();
	    //a1.m2();
		
	}

}
