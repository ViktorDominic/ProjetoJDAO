package br.com.senactech.MCadastroPessoa.controller;

import java.util.ArrayList;


public interface InterfaceController<T> {
    
    public int gerarId();
    
    public void add(T o);
    
    public ArrayList<T> getAll();
    
    public boolean deletar(T o);
    
    public T getByDoc(String d);
    
}
