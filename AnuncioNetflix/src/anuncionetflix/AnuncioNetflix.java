/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuncionetflix;

/**
 *
 * @author winicius
 */
public class AnuncioNetflix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String novoFilme = "O Senhor dos aneis";
        Filme filme = new Filme();
        Assinante assinante1 = new Assinante(filme);
        assinante1.setNomeAssinante("Thiago");
        Assinante assinante2 = new Assinante(filme);
        assinante2.setNomeAssinante("Renata");
        filme.setNome(novoFilme);
    }
  }
   
