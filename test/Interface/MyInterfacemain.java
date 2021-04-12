package com.test.Interface;

import com.test.derived.SampleDerived;

public class MyInterfacemain {
public static void main(String args[]){
	SampleDerived dr = new SampleDerived();
	dr.MyInfoMethod();
	dr.MymethodInfo();
	int s = MyInterface.add(100, 200);
	System.out.println("Return value "+ s);
}
}
