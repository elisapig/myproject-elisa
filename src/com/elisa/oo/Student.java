package com.elisa.oo;

import java.util.AbstractMap.SimpleImmutableEntry;

public class Student {
	int english;
	int math;
	int chinese;
	String name;
	
	public Student(String n,int e,int m,int c){
		name = n;
		english = e;
		math = m;
		chinese = c;
	}
	public void print(){
	System.out.println(english+"\t"+math+"\t"+chinese);
	}
	public int getAverage(){
		return(english+math+chinese)/3;
	}
}

