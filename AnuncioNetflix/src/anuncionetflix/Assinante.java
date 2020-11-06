/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package anuncionetflix;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author winicius
 */
public class Assinante implements Observer  {
    
    private Observable filme;
    private String lancamentoNovoFilme;
    private String nomeAssinante;

    public Observable getFilme() {
        return filme;
    }

    public void setFilme(Observable filme) {
        this.filme = filme;
    }

    public String getLancamentoNovoFilme() {
        return lancamentoNovoFilme;
    }

    public void setLancamentoNovoFilme(String lancamentoNovoFilme) {
        this.lancamentoNovoFilme = lancamentoNovoFilme;
    }

    public String getNomeAssinante() {
        return nomeAssinante;
    }

    public void setNomeAssinante(String nomeAssinante) {
        this.nomeAssinante = nomeAssinante;
    }

    public Assinante(Observable filme) {
        this.filme = filme;
        filme.addObserver(this);
    }
    
    private String getDateTime() { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
}
    
    
    @Override
    public void update(Observable filmeSubject, Object arg1) {
        if (filmeSubject instanceof Filme) {
            Filme filme = (Filme) filmeSubject;
            lancamentoNovoFilme = filme.getNome();
            System.out.println("Procurando algo para assistir, " + getNomeAssinante() + " ? " + 
                    "Hoje " + getDateTime() + " estreia o filme: " + 
                    lancamentoNovoFilme);
        }
    }
    
}
