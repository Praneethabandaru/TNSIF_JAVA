package com.tnsif.constructor;
import java.util.*;
public class Myclass1 {
		Myclass1(){
			System.out.println("default constructor");
		}
		Myclass1(int a){
			System.out.println("one parameter constructor");	
		}
		Myclass1(int a,String s){
			System.out.println("two parameter constructor");
		}
		
		public static void main(String[] args) {
			Myclass1 a=new Myclass1();
			Myclass1 b=new Myclass1(10);
			Myclass1 c=new Myclass1(5,"c");
		}
		

	}

