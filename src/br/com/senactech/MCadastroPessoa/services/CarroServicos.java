package br.com.senactech.MCadastroPessoa.services;

import br.com.senactech.MCadastroPessoa.dao.CarroDAO;
import br.com.senactech.MCadastroPessoa.dao.DAOFactory;
import br.com.senactech.MCadastroPessoa.model.Carro;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarroServicos {

    public void cadCarro(Carro pVO) throws SQLException {
        CarroDAO pDAO = DAOFactory.getCarroDAO();
        pDAO.cadastraCarro(pVO);
    }

    public ArrayList<Carro> getCarros() throws SQLException {
        CarroDAO pDAO = DAOFactory.getCarroDAO();
        return pDAO.buscarCarros();
    }

    public boolean verPlaca(String placa) throws SQLException {
        CarroDAO pDAO = DAOFactory.getCarroDAO();
        return pDAO.verPlaca(placa);
    }

    public Carro pesquisarPlacaBD(String placa) throws SQLException {
        CarroDAO pDAO = DAOFactory.getCarroDAO();
        return pDAO.getByDocBD(placa);
    }

    public void deletarCarroBD(int id) throws SQLException {
        CarroDAO pDAO = DAOFactory.getCarroDAO();
        pDAO.deletarCarro(id);
    }

    public void atualizarCarroBD(Carro pVO) throws SQLException {
        CarroDAO pDAO = DAOFactory.getCarroDAO();
        pDAO.atualizarCarro(pVO);
    }
}
