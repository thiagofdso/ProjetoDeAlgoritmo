/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.projeto.sort;

import java.util.function.Function;

/**
 *
 * @author tfoliveira
 */
public class Sort {
    public static Void ordenar(Integer[] elementos,Function<Integer[],Void> function){
        function.apply(elementos);
        return null;
    }
 /*   public static void main(String[] args) {
        Integer[] elementos = new Integer[]{1,2,3};
        Sort.ordenar(elementos, Sort::exibe);
    }
    public static Void exibe(Integer[] elementos){
        for(int i=0;i<elementos.length;i++)
//            System.out.println(elementos[i]);
            elementos[i]=i;
        return null;
    }*/
}
