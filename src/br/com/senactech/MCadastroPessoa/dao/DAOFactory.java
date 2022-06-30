package br.com.senactech.MCadastroPessoa.dao;

public class DAOFactory {
    
    public static PessoaDAO pessoaDAO = new PessoaDAO(); 
    
    public static PessoaDAO getPessoaDAO(){
        
        return pessoaDAO;
    }

    public static CarroDAO getCarroDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
