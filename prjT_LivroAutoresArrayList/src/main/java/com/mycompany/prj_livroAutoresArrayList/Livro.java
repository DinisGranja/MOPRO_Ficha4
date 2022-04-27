/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prj_livroAutoresArrayList;

import java.util.ArrayList;

/**
 *
 * @author Dulce
 */
public class Livro {

    private String codISBN;
    private String titulo;
    private int anoEdicao;
    private ArrayList<Autor> vecAutores;

    private static final String CODISBN_POR_OMISSAO = " sem isbn";
    private static final String TITULO_POR_OMISSAO = "sem titulo";
    private static final int ANOEDICAO_POR_OMISSAO = 0;

    public Livro() {
        setCodISBN(CODISBN_POR_OMISSAO);
        setCodISBN(CODISBN_POR_OMISSAO);
        setTitulo(TITULO_POR_OMISSAO);
        setAnoEdicao(ANOEDICAO_POR_OMISSAO);
        setVecAutores(new ArrayList());
    }

    public Livro(String codISBN) {
        setCodISBN(codISBN);
        setCodISBN(CODISBN_POR_OMISSAO);
        setTitulo(TITULO_POR_OMISSAO);
        setAnoEdicao(ANOEDICAO_POR_OMISSAO);
        setVecAutores(new ArrayList());
    }

    public Livro(String codISBN, String titulo, int anoEdicao) {
        setCodISBN(codISBN);
        setTitulo(titulo);
        setAnoEdicao(anoEdicao);
        setVecAutores(new ArrayList());
    }

    public Livro(String codISBN, String titulo, int anoEdicao, ArrayList<Autor> vecAutores) {
        setCodISBN(codISBN);
        setTitulo(titulo);
        setAnoEdicao(anoEdicao);
        setVecAutores(vecAutores);
    }

    public Livro(Livro l) {
        setCodISBN(l.codISBN);
        setTitulo(l.titulo);
        setAnoEdicao(l.anoEdicao);
        setVecAutores(l.vecAutores);
    }

    public String getCodISBN() {
        return codISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public ArrayList<Autor> getVecAutores() {
        return new ArrayList(vecAutores);
    }

    public void setCodISBN(String codISBN) {
        this.codISBN = codISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public void setVecAutores(ArrayList<Autor> vecAutores) {
        this.vecAutores = new ArrayList(vecAutores);
    }

    // Adiciona o autor 'a' ao vetor de autores
    public void adicionarAutor(Autor a) {
        vecAutores.add(a);
    }

    // Elimina o autor 'a' do vetor de autores
    public boolean eliminarAutor(Autor a) {
        if (vecAutores.remove(a) == true) // encontrou o autor que quer eliminar do vetor de autores
        {
            return true;
        } else {
            return false;
        }
    }

    // Procura o autor 'a' no vetor de autores e devolve a posição onde se encontra, caso contrário devolve -1
    public int procurarAutor(Autor a) {
        int pos = -1;
        pos = vecAutores.indexOf(a); // Devolve o indice no vetor onde se encontra o autor. Se não encontrar devolve -1
        return pos;
    }

    // Devolve o autor que se encontra na posição pos no vetor de autores, caso contrário devolve null
    public Autor obterAutor(int pos) {
        Autor a = null;
        if (pos < vecAutores.size()) {
            a = (Autor) vecAutores.get(pos); // Devolve o autor que se encontra na posição pos do vetor
        }
        return a;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nCódigo ISBN: ");
        sb.append(codISBN);
        sb.append("\nTítulo: ");
        sb.append(titulo);
        sb.append("\nAno de edição: ");
        sb.append(anoEdicao);
        sb.append("\n");
        for (int i = 0; i < vecAutores.size(); i++) {
            sb.append(((Autor) vecAutores.get(i)).toString());
        }
        sb.append("\n");
        return sb.toString();
    }

    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        Livro obj = (Livro) outroObjeto;
        if (this.codISBN.compareToIgnoreCase(obj.codISBN) == 0
                && this.titulo.compareToIgnoreCase(obj.titulo) == 0 && this.anoEdicao == obj.anoEdicao && this.vecAutores == obj.vecAutores) {
            return true;
        } else {
            return false;
        }
    }

    public int obterAutor(String nome) {
        int pos = -1; 
        return vecAutores.indexOf(nome);
    }
}
