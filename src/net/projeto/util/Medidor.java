/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.projeto.util;

import java.util.function.Function;
import net.projeto.gerador.GeradorNumero;

/**
 *
 * @author tfoliveira
 */
public class Medidor {
    public static int MAX_VALUE=Integer.MAX_VALUE;
    public static int MIN_VALUE=Integer.MIN_VALUE;
    public long[][] desempenhoOrdenacao(int[] tamanhos,Function<Integer[],Void> function){
        long[][] desempenho = new long[tamanhos.length][3];
        GeradorNumero gerador = new GeradorNumero();
        
        for(int i=0;i<tamanhos.length;i++){
           desempenho[i][0]=tamanhos[i];
           long desempenhoMelhorCaso = 0;
           long desempenhoPiorCaso = 0;
           //MELHOR CASO
           Integer[] elementosMelhorCaso = gerador.geraArrayMelhorCaso(tamanhos[i], Medidor.MAX_VALUE, Medidor.MIN_VALUE);
           for(int j=0;j<10;j++)
               desempenhoMelhorCaso += Contador.tempoOrdenacao(elementosMelhorCaso, function);
           
           desempenho[i][1]=desempenhoMelhorCaso/10;
           
           //ALEATORIO
           Integer[] elementosPiorCaso;
           for(int j=0;j<10;j++){
               elementosPiorCaso = gerador.geraArrayAleatorio(tamanhos[i], Medidor.MAX_VALUE, Medidor.MIN_VALUE);
               desempenhoPiorCaso += Contador.tempoOrdenacao(elementosPiorCaso, function);           
           }
           //PIORCASO
           elementosPiorCaso = gerador.geraArrayPiorCaso(tamanhos[i], Medidor.MAX_VALUE, Medidor.MIN_VALUE);
           for(int j=0;j<10;j++)
               desempenhoPiorCaso += Contador.tempoOrdenacao(elementosPiorCaso, function);
           desempenho[i][2]=desempenhoMelhorCaso/20;
        }
        return desempenho;
    }
}
