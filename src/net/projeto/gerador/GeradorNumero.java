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
    public int[] geraArray(int tamanho,int max,int min){
        int[] valores = new int[tamanho];
        for(int i=0;i<tamanho;i++)
                valores[i]=geraValor(max,min);
        return valores;
    }
    public int[] geraArrayOrdenado(int tamanho,int max,int min){
        int[] valores = new int[tamanho];
        for(int i=0;i<tamanho;i++)
                valores[i]=i;
        return valores;
    }
    private int geraValor(int max,int min){
        int valor ;
        valor = (int) (min + Math.random() * (max - min));
        return valor;
    }
}
