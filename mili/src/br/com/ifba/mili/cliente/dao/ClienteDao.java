/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.cliente.dao;

import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.infrastructure.dao.GenericDao;
import java.util.List;

/**
 *
 * @author jerry
 */
public class ClienteDao extends GenericDao<Cliente> implements IClienteDao{

//    @Override
//    public List<Cliente> findByNameCliente(String nome) {
//        String query = "select f from fornecedor f WHERE upper(f.nome) like upper('" + nome +"%')";   
//        return GenericDao.entityManager.createQuery(query).getResultList();
//    }

 
}
