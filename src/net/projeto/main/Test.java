/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.projeto.main;

/**
 *
 * @author tfoliveira
 */
/**
 * 
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		
		/*
		 * Collections.sort(names, new Comparator<String>() {
    		@Override
    		public int compare(String a, String b) {
        	return b.compareTo(a);
    	}
	});
		 */
		
		//JAVA8Lambda���ʽ��
		Collections.sort(names, (String a, String b) -> {
		    return b.compareTo(a);
		});
		
		//Collections.sort(names, (String a, String b) -> b.compareTo(a));
		//Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names);
	}

}
