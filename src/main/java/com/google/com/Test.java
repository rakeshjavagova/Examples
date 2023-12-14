package com.google.com;

import com.avaya.pim.api.PomCustomResultProcessor;
import com.avaya.pim.api.PomResultInfo;

public class Test implements PomCustomResultProcessor {

	public Test() {
		super();
		System.out.println("hello world..");
	}
	public void processCustomResultProcessor(PomResultInfo arg0) {
		
		System.out.println("inside ..");
		
	}
	
	
	
	public static void main(String[] args) {
		Test s = new Test();
	}

}
