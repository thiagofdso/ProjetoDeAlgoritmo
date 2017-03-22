/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.projeto.util;

import java.util.function.Function;
import net.projeto.sort.Sort;

/**
 *
 * @author tfoliveira
 */
public class Contador {

    public static long tempoOrdenacao(Integer[] elementos,Function<Integer[],Void> function){
        long tempoInicial = System.nanoTime();
        Sort.ordenar(elementos, function);
        long tempoGasto = System.nanoTime() - tempoInicial;
        return tempoGasto;
    }
/*    public static void main(String[] args) {
        GeradorNumero gerador = new GeradorNumero();
        System.out.println(Contador.tempoOrdenacao(gerador.geraArrayAleatorio(1000, 1, 100), Sort::exibe));
    }*/
}
