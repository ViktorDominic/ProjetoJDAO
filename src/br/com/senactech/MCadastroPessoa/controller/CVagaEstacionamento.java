package br.com.senactech.MCadastroPessoa.controller;

import br.com.senactech.MCadastroPessoa.model.VagaEstacionamento;
import java.util.ArrayList;
import mcadastropessoaJF.MCadastroPessoaJF;


public class CVagaEstacionamento implements InterfaceController<VagaEstacionamento>{

    ArrayList<VagaEstacionamento> vagas = new ArrayList<>();
    int idVaga = 1;
    
    @Override
    public void add(VagaEstacionamento o) {
        vagas.add(o);
    }

    @Override
    public ArrayList<VagaEstacionamento> getAll() {
        return vagas;
    }

    @Override
    public boolean deletar(VagaEstacionamento o) {
        boolean del = vagas.remove(o);
        return  del;
    }

    @Override
    public VagaEstacionamento getByDoc(String d) {
       return null;
    }

    @Override
    public int gerarId() {
        return idVaga++;
    }
    
    public void mokVagas(){
        VagaEstacionamento v1 = new VagaEstacionamento();
        v1.setIdVaga(gerarId());
        v1.setTpVaga("Carro");
        v1.setC(MCadastroPessoaJF.cadCarros.getByDoc("CHS6647"));
        vagas.add(v1);
        
        VagaEstacionamento v2 = new VagaEstacionamento();
        v2.setIdVaga(gerarId());
        v2.setTpVaga("Carro");
        v2.setC(MCadastroPessoaJF.cadCarros.getByDoc("IPP1234"));
        vagas.add(v2);
    }
    
}
