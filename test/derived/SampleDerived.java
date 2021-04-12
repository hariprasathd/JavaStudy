package com.test.derived;
import com.test.Interface.*;
public class SampleDerived implements MyInterface {

	@Override
	public void MymethodInfo() {
		System.out.println("First Interface method implemented in Derived class");
		
	}

	@Override
	public void MyInfoMethod() {
		System.out.println("Second Interface method implemented in Derived class");
		
	}

}
