/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prj_pontoarraylist;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author mdm
 */
public class Ponto{
   private int x, y;
   private static final int ABCISSA_POR_OMISSAO = 0;
   private static final int ORDENADA_POR_OMISSAO = 0;
/**
 * Construtor sem parâmetos.
 */
   public Ponto(){
     setX(ABCISSA_POR_OMISSAO);
     setY(ORDENADA_POR_OMISSAO);
   }
/**
 * Construtor com dois parâmetros.
 * @param a Abcissa 
 * @param b Ordenada
 */
   public Ponto( int x, int y ){
     setX(x);
     setY(y);
   }
   /**
 * Construtor de cópia.
 * @param p ponto 
 */
   public Ponto( Ponto p ){
     setX(p.x);
     setY(p.y);
   }
   public Ponto clone(){
       return new Ponto(this);
   }
/**
 * Obtem valor da abcissa.
 * @return abcissa
 */
    public int getX() {
        return x;
    }
/**
 * Obtem valor da ordenada.
 * @return ordenada
 */
    public int getY() {
        return y;
    }
/**
 * Modifica a abcissa
 * @param x 
 */
    public void setX(int x) {
        this.x = x;
    }
/**
 * Modifica a ordenada
 * @param y 
 */
    public void setY(int y) {
        this.y = y;
    }
  
/**
 * Descreve as coordenadas de um ponto.
 * @return descrição
 */
   public String toString(){
     return "(" + x + ", " + y + ")";
   }
/**
 * 
 * @param obj
 * @return 
 */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        Ponto obj = (Ponto) outroObjeto;
        return x==obj.x && y==obj.y;
    }
   
   /**
    * Determinda se um ponto tem ambas as coordenadas positivas.
    * @return true ou false
    */
   public boolean coordenadasPositivas(){
       return x>0 && y>0;
   }
   /**
    * Calcula e devolve a distância entre dois pontos.
    * @param ponto q
    * @return distância
    */
   public double calcularDistancia(Ponto q) {
     Ponto p =this;
     double d = Math.sqrt( Math.pow((p.x - q.x),2) + Math.pow((p.y - q.y),2));
     DecimalFormat d1=new DecimalFormat(".000",new DecimalFormatSymbols(Locale.US));
     String s=d1.format(d);
     return Double.parseDouble(s);
   }
} 
