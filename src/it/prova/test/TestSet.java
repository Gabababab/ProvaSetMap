package it.prova.test;

import java.util.HashSet;
import java.util.Set;

public class TestSet{

	public static void main(String[]args) {
		
		Set<Integer> a=new HashSet<Integer>();
		
		a.add(2);
		a.add(2);
		a.add(1);
		a.add(1);
		a.add(3);
		a.add(3);
		System.out.println("Stampo A...");
		System.out.println(a);
		
		Set<Integer> b=new HashSet<Integer>();
		
		b.add(1);
		b.add(3);
		b.add(4);
		System.out.println("Stampo B...");
		System.out.println(b);
		
		System.out.println("Unisco A e B...");
		Set<Integer> ab=new HashSet<Integer>(a);
		ab.addAll(b);
		System.out.println(ab);

		System.out.println("Trovo i comuni di A e B...");
		Set<Integer> comuniAB=new HashSet<Integer>(a);
		comuniAB.retainAll(b);
		System.out.println(comuniAB);
		
		System.out.println("Sottraggo B da A...");
		Set<Integer> differenza=new HashSet<Integer>(a);
		differenza.removeAll(b);
		System.out.println(differenza);
	}
	
}
