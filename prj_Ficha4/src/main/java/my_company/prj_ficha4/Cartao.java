/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_company.prj_ficha4;

import java.util.Objects;
import my_company.utilitarios.Data;

/**
 *
 * @author dinis
 */
public class Cartao {
    private int idCartao, qtdEntradas = 0, qtdSaidas = 0;
    private Data dataAtribuicao;
    private static int totalCartoes = 0;
    
    private static final int IDCARTAO_POR_OMISSAO = 0, QTDENTRADAS_POR_OMISSAO = 0, QTDSAIDAS_POR_OMISSAO = 0;
    private static final Data DATA_POR_OMISSAO = new Data(2022, 2, 3);
    
    public Cartao(){
        setIdCartao(IDCARTAO_POR_OMISSAO);
        setQtdEntradas(QTDENTRADAS_POR_OMISSAO);
        setQtdSaidas(QTDSAIDAS_POR_OMISSAO);
        setData(DATA_POR_OMISSAO);
    }
    
    public Cartao(int idCartao, int qtdEntradas, int qtdSaidas, Data d) {
        setIdCartao(idCartao);
        setQtdEntradas(qtdEntradas);
        setQtdSaidas(qtdSaidas);
        setData(d);
    }
    
    public Cartao(Cartao c) {
        setIdCartao(c.idCartao);
        setQtdEntradas(c.qtdEntradas);
        setQtdSaidas(c.qtdSaidas);
        totalCartoes();
    }
    
    //ID Cartão
    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public int getIdCartao() {
        return idCartao;
    }
    
    //Qtd Entradas
    public void setQtdEntradas(int qtdEntradas) {
        this.qtdEntradas = qtdEntradas;
    }

    public int getQtdEntradas() {
        return qtdEntradas;
    }
    
    //Qtd Entradas
    public void setQtdSaidas(int qtdSaidas) {
        this.qtdSaidas = qtdSaidas;
    }

    public int getQtdSaidas() {
        return qtdSaidas;
    }
    
    //Datas
    public void setData(Data dataAtribuicao) {
        this.dataAtribuicao = dataAtribuicao;
    }

    public Data getData() {
        return dataAtribuicao;
    }
    
    //Total cartões
    public static int totalCartoes(){
        return totalCartoes++;
    }
    
    //Descrição
    public String toString() {
        return "ID cartao: " + getIdCartao() + "\nQuantidade de Entradas: " + getQtdEntradas() + "\nQuantidade de Saidas: " + getQtdSaidas() + "\nData: " + dataAtribuicao.toString();
    }
    
    //Entrada
    public void entrada(){
        qtdEntradas++;
    }
    
    //Saída
    public void saida(){
        qtdSaidas++;
    }
    
    public int diferenca(){
        return qtdEntradas-qtdSaidas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Cartao other = (Cartao) obj;
        if (this.idCartao != other.idCartao) {
            return false;
        }
        if (this.qtdEntradas != other.qtdEntradas) {
            return false;
        }
        if (this.qtdSaidas != other.qtdSaidas) {
            return false;
        }
        return Objects.equals(this.dataAtribuicao, other.dataAtribuicao);
    }
    
}
