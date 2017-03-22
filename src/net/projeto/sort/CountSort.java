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
public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {217,125,362,136,733,522}; 
		print(array);
		//select_sort(array);
		// int brr[6]; 
		// int w[6];   
		// int crr[8]; 
		radixSort(array);
		print(array);
}
/**
	 * @param array
	 */
	
	private static int getMax(int[] a){
		int max = 0;
		for(int x:a){
			if(x>max){
				max = x;
			}
		}
		return max;
	}
	private static void countSort(int[] a,int[] ago) {
		// TODO Auto-generated method stub

		int max = getMax(a);

		int[] c = new int[max+1];

		int[] b = new int[a.length];
		for(int i=0;i<c.length;i++){
			c[i]=0;
		}

		for(int i=0;i<a.length;i++){
			c[a[i]]++;
		}

		for(int i=1;i<c.length;i++){
			c[i] = c[i]+c[i-1];
		}
		for(int i=a.length-1;i>=0;i--){

			int index = c[a[i]]-1;
			b[index] = ago[i];

			c[a[i]]--;
		}
		for(int i=0;i<a.length;i++){
			ago[i] = b[i];
		}
	}
	private static void countSort2(int[] a) {
		// TODO Auto-generated method stub

		int max = getMax(a);

		int[] c = new int[max+1];

		//int[] b = new int[a.length];
		for(int i=0;i<c.length;i++){
			c[i]=0;
		}

		for(int i=0;i<a.length;i++){
			c[a[i]]++;
		}
	/*	
		for(int i=1;i<c.length;i++){
			c[i] = c[i]+c[i-1];
		}*/
		int i,j=0;
		for(i=0;i<=max;i++){ 
	        while((c[i]--)>0){  
	            a[j++] = i;  
	        }
		}
	}
	

	public static void radixSort(int[] a){
		int val = 1;
		int[] w = new int[a.length];
		//3λ��
		for(int i=0;i<3;i++){
			for(int j=0;j<a.length;j++){
				w[j] = (a[j]/val)%10;
			}
			countSort(w,a);
			print(a);
			val = val*10;
		}
	}
    /**
     * @param array
     */
    private static void print(int[] array) {
            for(int x:array){
                    System.out.print(x+" ");
            }
            System.out.println();
    }
}
