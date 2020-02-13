/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.cliente.service;

import br.com.ifba.mili.cliente.dao.ClienteDao;
import br.com.ifba.mili.cliente.dao.IClienteDao;
import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.infrastructure.support.StringUtil;
import br.com.ifba.mili.insfrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author jerry
 */
public class ClienteService implements IClienteService {
    // Representa a mensagem de erro se o Cliente for nulo.
    public final static String CLIENTE_NULL = "Cliente null";
    // Representa a mensagem de erro se o Cliente já existir.
    public final static String CLIENTE = "O Cliente já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Cliente não existir na base de dados (na hora do update).
    public final static String CLIENTE_NAO_EXISTE = "O Cliente NÃO existe na base de dados";
    // Representa a mensagem de erro se o Cliente for inválido.
    public final static String CLIENTE_INVALIDO = "Cliente inválido";
    
   // Objeto que faz a comunicação com a camada Dao
    private final IClienteDao clienteDao = new ClienteDao();
    
    //salva no banco, retorna um cliente salvo
    
    @Override
    public Cliente saveCliente(Cliente cliente) {
        if(cliente == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE_NULL);
        }else if(this.validaCliente(cliente) == false){
            // Tratamento de exceção
           throw new BusinessException(CLIENTE_INVALIDO);
        }else if(this.clienteExistente(cliente)){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE);
        }else {        
            // Salvando objeto na base de dados
            return this.clienteDao.save(cliente);
        }
    }
    
    @Override
    public Cliente updateCliente(Cliente cliente) {
        if(cliente == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE_NULL);
        }else if(this.validaCliente(cliente) == false){
            // Tratamento de exceção
           throw new BusinessException(CLIENTE_INVALIDO);
        }else if(this.clienteDao.findById(cliente.getId()) == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE_NAO_EXISTE);
        }else {        
            // Salvando objeto na base de dados
            return this.clienteDao.update(cliente);
        }
    }

    @Override
    public void delteCliente(Cliente cliente) {
        if(cliente == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE_NULL);
        }else if(this.clienteDao.findById(cliente.getId()) == null){
            // Tratamento de exceção
            throw new BusinessException(CLIENTE_NAO_EXISTE);
        }else {        
            // Salvando objeto na base de dados
            this.clienteDao.delete(cliente);
        }
    }

    @Override
    public List<Cliente> getAllCliente() {
        return this.clienteDao.findAll();
    }

    @Override
    public Cliente getByIdCliente(Long id) {
        return this.clienteDao.findById(id);
    }
    
    private boolean validaCliente(Cliente cliente) {
        StringUtil util = StringUtil.getInstance();
        
        if(
            (util.isNullOrEmpty(cliente.getNome())) ||
            (cliente.getDataNasc() == null) ||
            (util.isNullOrEmpty(cliente.getBairro())) ||
            (util.isNullOrEmpty(cliente.getCidade())) ||
            (util.isNullOrEmpty(cliente.getEstado())) ||
            (util.isNullOrEmpty(cliente.getRua())) ||
            (util.isNullOrEmpty(cliente.getSexo())) ||
            (util.isNullOrEmpty(cliente.getCep()) || cliente.getCep().matches("[a-zA-z]")) ||
            (util.isNullOrEmpty(cliente.getCpf()) || cliente.getCpf().matches("[a-zA-z]")) ||
            (util.isNullOrEmpty(cliente.getRg()) || cliente.getRg().matches("[a-zA-z]")) ||
            (util.isNullOrEmpty(cliente.getTelefone()) || cliente.getTelefone().matches("[a-zA-z]"))
        ) {
            return false;  
        }else       
            return true;
    }

    private boolean clienteExistente(Cliente cliente) {
        return this.clienteDao.findById(cliente.getId()) == cliente;
    }
   
}
