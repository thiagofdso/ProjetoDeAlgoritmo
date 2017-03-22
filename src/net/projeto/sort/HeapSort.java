/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.projeto.sort;

/**
 *
 * @author tfoliveira
 */
public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {2,4,5,1,3,5,2,14,21,413,41,12,7,68,98,21};
		print(a);
		heapSort(a,a.length);
		print(a);
	}

	/**
	 * @param a
	 * @param length
	 */
	private static void heapSort(int[] a, int length) {
		// TODO Auto-generated method stub
		int i;

		for(i=length/2-1;i>=0;i--){
			arrayToMaxHeap(a, i, length-1);
		}
		for(i = length-1;i>0;i--){

			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			arrayToMaxHeap(a, 0, i-1);
		}
		
	}

	/**
	 * @param a
	 */
	private static void arrayToMaxHeap(int[] a, int begin, int end) {
		// TODO Auto-generated method stub
		int temp = a[begin];
		int i = 2 * begin + 1;
		while (i <= end) {
			if (i + 1 < end && a[i] < a[i + 1]) {
				i++;
			}

			if (a[i] <= temp) {
				break;
			} else {

				a[begin] = a[i];

				begin = i;

				i = 2 * begin + 1;
			}
			a[begin] = temp;
		}
	}
	
	private static void print(int[] array) {
		for(int x:array){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
