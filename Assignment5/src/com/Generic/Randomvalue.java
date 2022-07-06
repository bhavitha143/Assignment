package com.Generic;

import java.util.HashMap;
import java.util.Map;

public class Randomvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,Double> map =new HashMap<Integer,Double>(); //creating hash map
		 
		 map.put(1,100.0);  //Put elements in Map  
		 map.put(2,200.0);    
	     map.put(3,300.0);   
	     map.put(4,400.0); 
	     map.put(5,500.0); 
	     map.put(6,600.0); 
	     map.put(7,700.0); 
	     map.put(8,800.0); 
	     map.put(9,900.0);
	     map.put(10,1000.0); 
	     
	     System.out.println("Iterating Hashmap...");  
	     for(Map.Entry m : map.entrySet()){    
	      System.out.println(m.getKey()+" "+m.getValue());    
	     }  


	}

}
