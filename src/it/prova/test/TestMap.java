package it.prova.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {
	
	public static void main(String[]args) {
		
		Map<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "100");
		hm.put(2, "200");
		hm.put(3, "300");
		
		for (Entry<Integer, String> item : hm.entrySet()) {
            System.out.print(item.getKey() + ":");
            System.out.println(item.getValue());
        }
	}
}
