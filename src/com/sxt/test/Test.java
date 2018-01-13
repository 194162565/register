package com.sxt.test;

public class Test {

	
	
	
	public int tests(){
		return 1;
	}
	
	public void test2(String tes){
		System.out.println("jhhh");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
//		System.out.println(test.tests());
		test.test2("hah");
		String str  = null;
		System.out.println("Test.main()" + str);
	}
	
	
}
