package br.edu.ifsp.dmo.listadecontatos.model;

import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    private static ContatoDao instance;
    private List<Contato> dataset;

    private ContatoDao(){
        dataset = new ArrayList<>();
    }

    public static ContatoDao getInstance(){
        if (instance == null){
            instance = new ContatoDao();
        }
        return instance;
    }

    public void add(Contato contato){
        if (contato != null){
            dataset.add(contato);
        }
    }

    public List<Contato> getDataset(){
        return dataset;
    }
}
