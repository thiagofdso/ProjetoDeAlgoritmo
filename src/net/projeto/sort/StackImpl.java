/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.projeto.sort;
import java.util.Stack;
/**
 *
 * @author tfoliveira
 */
public class StackImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 5647;
		//getNumber(x);
		getNumber2(x);
	}

	/**
	 * @param x
	 */
	private static void getNumber(int x) {
		// TODO Auto-generated method stub
		while(x>10){
			System.out.print(x%10+" ");
			x = x/10;
		}
		System.out.print(x);
	}

	private static void getNumber2(int x){
		Stack<Integer> stack = new Stack<>();
		while(x>10){
			stack.add(x%10);
			x = x/10;
		}
		stack.add(x);
		while(stack.size()>0){
			System.out.print(stack.pop()+" ");
		}
	}
}

