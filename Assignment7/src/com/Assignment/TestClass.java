package com.Assignment;

import static java.lang.annotation.ElementType.METHOD;
		import static java.lang.annotation.RetentionPolicy.RUNTIME;
		import java.lang.annotation.Retention;
		import java.lang.annotation.Target;@Retention(RUNTIME)

     @Target(METHOD)

     @interface Test{}
       public class TestClass{
		public void display() {
		System.out.println("Test display( )");
		}
		public static void main(String[] args) {
		TestClass obj = new TestClass();
		obj.display();
		}

	}


