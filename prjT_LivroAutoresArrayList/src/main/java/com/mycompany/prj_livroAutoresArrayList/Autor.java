/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prj_livroAutoresArrayList;

/**
 *
 * @author Docente Dulce
 *
 */
/**
 *
 * @author mdm
 */
public class Autor {
    private String nome;
    private String email;
    
    public Autor(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }
    public Autor(Autor autor) {
        setNome(autor.nome);
        setEmail(autor.email);
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDados do autor: ");
        sb.append("\nNome -> ");
        sb.append(nome);
        sb.append("\nEmail -> ");
        sb.append(email);
        return sb.toString();
    }
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        Autor obj = (Autor) outroObjeto;
        return this.nome.equalsIgnoreCase(obj.nome) && this.email.equalsIgnoreCase(obj.email);
    }
}
