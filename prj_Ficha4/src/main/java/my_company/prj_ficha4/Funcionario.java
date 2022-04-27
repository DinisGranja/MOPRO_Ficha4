/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_company.prj_ficha4;

import java.util.ArrayList;
import java.util.Objects;
import my_company.utilitarios.Data;

/**
 *
 * @author dinis
 */
public class Funcionario {

    private int idFunc; // identificador do funcionário
    private int entrada = 0;
    private int saida = 0;
    private String nome; // nome do funcionário
    private String nif; // Número de identificação fiscal
    private Data dataContrato; // Data de contrato
    private ArrayList <Cartao> cartao; // Cartão atribuído ao funcionário
    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String NIF_POR_OMISSAO = "sem nif";
    private static final int NUM_POR_OMISSAO = 0;

    public Funcionario(int idFunc, String nome, String nif, Data dataContrato, Cartao cartao) {
        setIdFunc(idFunc);
        setNome(nome);
        setNif(nif);
        setDataContrato(dataContrato);
        setCartao(new ArrayList());
    }

    public Funcionario() {
        setIdFunc(NUM_POR_OMISSAO);
        setNome(NOME_POR_OMISSAO);
        setNif(NIF_POR_OMISSAO);
    }

    public Funcionario(Funcionario funcionario) {
        setIdFunc(funcionario.idFunc);
        setNome(funcionario.nome);
        setNif(funcionario.nif);
        setDataContrato(funcionario.dataContrato);
        setCartao(funcionario.cartao);
    }

    public Funcionario(int idFunc, String nome, String nif, Data dataContrato) {
        this.idFunc = idFunc;
        this.nome = nome;
        this.nif = nif;
        this.dataContrato = dataContrato;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public String getNome() {
        return nome;
    }

    public String getNif() {
        return nif;
    }

    public Data getDataContrato() {
        return dataContrato;
    }

    public ArrayList<Cartao> getCartao() {
        return cartao;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = dataContrato;
    }

    public void setCartao(ArrayList<Cartao> cartao) {
        this.cartao = cartao;
    }

    public String toString() {
        return "ID Função: " + getIdFunc() + "\nNome: " + getNome() + "\nNIF: " + getNif() + "\nData de Contrato: " + getDataContrato();
    }

    public int qtdEntradas(int idCartao) {
        for (int i = 0; i < cartao.size(); i++) {
            if (cartao.get(i).getIdCartao() == idCartao) {
                return cartao.get(i).getQtdEntradas();
            }
        }
        return -1;
    }

    public int qtdSaidas(int idCartao) {
        for (int i = 0; i < cartao.size(); i++) {
            if (cartao.get(i).getIdCartao() == idCartao) {
                return cartao.get(i).getQtdSaidas();
            }
        }
        return -1;
    }

    public int calcularDifEntradasSaidas(int idCartao) {
        for (int i = 0; i < cartao.size(); i++) {
            if (cartao.get(i).getIdCartao() == idCartao) {
                return cartao.get(i).getQtdEntradas()-cartao.get(i).getQtdSaidas();
            }
        }
        return -1;
    }

    public void alterarDataAtribuicaoCartao(Data d1) {
        this.dataContrato = d1;
    }

    public void addEntrada(int idCartao) {
        for (int i = 0; i < cartao.size(); i++) {
            if (cartao.get(i).getIdCartao() == idCartao) {
                cartao.get(i).entrada();
            }
        }
    }

    public void addSaida(int idCartao) {
        for (int i = 0; i < cartao.size(); i++) {
            if (cartao.get(i).getIdCartao() == idCartao) {
                cartao.get(i).saida();
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.idFunc != other.idFunc) {
            return false;
        }
        if (this.entrada != other.entrada) {
            return false;
        }
        if (this.saida != other.saida) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        if (!Objects.equals(this.dataContrato, other.dataContrato)) {
            return false;
        }
        return Objects.equals(this.cartao, other.cartao);
    }
    
    public void adicionarCartao(int idCartao, Data dataAtribuicao, int qtdEntradas, int qtdSaidas){
        Cartao c = new Cartao(idCartao, qtdEntradas, qtdSaidas, dataAtribuicao);
        cartao.add(c);
    }
    
    public void eliminarCartao(int idCartao){
        for (int i = 0; i < cartao.size(); i++) {
            if (cartao.get(i).getIdCartao() == idCartao) {
                cartao.remove(i);
            }
        }
    }
    
    public int qtdCartoes(){
        return cartao.size();
    }
    
}
