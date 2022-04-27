/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prj_livroAutoresArrayList;

/**
 *
 * @author mdm
 */
public class Main {
    public static void main(String[] args) {
       // Criar instância/objeto livro
       Livro l1 = new Livro("9789727228126", "Modelação de Dados em UML",2015);
       Livro l2 = new Livro("1234567890123", "Revista Sábado",2022);
       // Criar um autor
       Autor a1 = new Autor("José Borges","jose@gmail.com");
       // Adicionar autor a1 ao livro
       l1.adicionarAutor(a1);
       //Mostrar informação do livro l1
       System.out.println("I - Listar dados do livro"+l1.toString());
       // Criar outro autor
       Autor a2 = new Autor("Teresa Dias","teresa@gmail.com");
       // Adicionar autor a2 ao livro
       l1.adicionarAutor(a2);
       //Mostrar informação do livro l1
       System.out.println("II - Listar dados do livro"+l1.toString());
       // Obter o segundo autor do livro
       System.out.println("2º autor do livro: "+l1.obterAutor(1));
       // Obter a posição no vetor de autores onde está o autor a1
       System.out.println("Posição no vetor onde se encontra o autor 'a1': "+l1.procurarAutor(a1));
       // Eliminar  o autor 'a1'
       l1.eliminarAutor(a1);
       // verificar se foi realmente eliminado
       System.out.println("III - Listar dados do livro"+l1.toString());
       //       
       // TAREFA: Criar mais um livro, adicionar 3 autores e testar restantes funcionalidades conforme mostrado acima
       //...
       Autor a3 = new Autor("Dinis Granja","dinis@gmail.com");
       Autor a4 = new Autor("Granja Dinis","granja@gmail.com");
       Autor a5 = new Autor("Dinis Fonseca Granja","fonseca@gmail.com");
       
       l2.adicionarAutor(a3);
       l2.adicionarAutor(a4);
       l2.adicionarAutor(a5);
       
       System.out.println(l2.toString());
       System.out.println(l2.obterAutor(2).toString());
       
       System.out.println(l2.procurarAutor(a3));
    }
}
