/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.projeto.gerador;

/**
 *
 * @author tfoliveira
 */
public class GeradorNumero {
    public Integer[] geraArrayAleatorio(int tamanho,int max,int min){
        Integer[] valores = new Integer[tamanho];
        for(int i=0;i<tamanho;i++)
                valores[i]=geraValor(max,min);
        return valores;
    }
    public Integer[] geraArrayMelhorCaso(int tamanho,int max,int min){
        Integer[] valores = new Integer[tamanho];
        for(int i=0;i<tamanho;i++)
                valores[i]=i;
        return valores;
    }
    public Integer[] geraArrayPiorCaso(int tamanho,int max,int min){
        Integer[] valores = new Integer[tamanho];
        for(int i=0;i<tamanho;i++)
                valores[i]=tamanho-i;
        return valores;
    }
    private int geraValor(int max,int min){
        int valor ;
        valor = (int) (min + Math.random() * (max - min));
        return valor;
    }
}
