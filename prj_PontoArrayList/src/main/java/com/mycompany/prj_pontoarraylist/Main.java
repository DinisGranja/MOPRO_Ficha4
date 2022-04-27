/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prj_pontoarraylist;

import java.util.ArrayList;

/**
 *
 * @author mdm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criação de um vetor de Pontos usando a classe ArrayList<E>
        ArrayList<Ponto> vecPontos = new ArrayList<Ponto>();
        Ponto p1 = new Ponto(2, 5);
        Ponto p2 = new Ponto(5, 12);
        Ponto p3 = new Ponto(15, 20);
        Ponto p4 = new Ponto(5, 5);
        Ponto p5 = new Ponto(15, 15);
        vecPontos.add(p1);
        vecPontos.add(p2);
        vecPontos.add(p3);
        vecPontos.add(p4);
        vecPontos.add(p5);
        System.out.println("Listagem 1");
        for (int i = 0; i < vecPontos.size(); i++) {
            System.out.println("\nPonto na posição "+i+" do vetor:");
            System.out.println("Valor do x: " + vecPontos.get(i).getX());
            System.out.println("Valor do y: " + vecPontos.get(i).getY());
        }
        // OU
        System.out.println("\nListagem 2");
        for (Ponto p : vecPontos) {
            System.out.println("Ponto: " + p);
        }
        
        System.out.println("");
        System.out.println("Quantidade de Pontos iguais: " + obterQtdPontosXX(vecPontos));
    }
    
    public static int obterQtdPontosXX(ArrayList<Ponto> v){
        int cont = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).getX() == v.get(i).getY()) {
                cont++;
            }
        }
        return cont;
    }

}
