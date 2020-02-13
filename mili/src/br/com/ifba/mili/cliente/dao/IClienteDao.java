/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.cliente.dao;

import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.infrastructure.dao.IGenericDao;
import java.util.List;

/**
 *
 * @author jerry
 */
public interface IClienteDao extends IGenericDao<Cliente>{
    
    //Recupera uma lista de Clientes pelo nome
    
    /**
     * 
     * @param nome
     * @return 
     */
    //public abstract List<Cliente> findByNameCliente(String nome);
}
