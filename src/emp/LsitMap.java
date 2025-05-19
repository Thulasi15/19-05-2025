package emp;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LsitMap {
	public static void main(String[] args) {
		/*
		List<Integer> a=new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		List<Integer> b=new LinkedList<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		List<Integer> c=new LinkedList<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		List<List<Integer>> l=new LinkedList<List<Integer>>();
		l.add(a);
		l.add(b);
		l.add(c);
		List<Integer> list=l.get(0);
		Integer i=list.get(1);
		System.out.println(i);
		
	}

*/
		
		Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		m.put("Java",100);
		m.put("Selenium", 200);
		Map<String,Integer> m1=new LinkedHashMap<String,Integer>();
		m1.put("developer", 300);
		m1.put("testing", 400);
		
		Integer i=m.get("Java");
		System.out.println(i);
		
		List<Map<String,Integer>> l=new LinkedList<Map<String,Integer>>();
		l.add(m);
		l.add(m1);
		Map<String,Integer> i1=l.get(1);
		Integer mm=i1.get("testing");
		System.out.println(mm);
		
		
	}
}
