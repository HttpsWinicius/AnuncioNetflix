/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuncionetflix;

import java.util.Observable;

/**
 *
 * @author winicius
 */
public class Filme extends Observable {
    
     private String nome;

    public void setNome (String novoFilme) {
        this.nome = novoFilme;
        setChanged();
        notifyObservers();
    }

    public String getNome() {
        return this.nome;
    }
    
}
