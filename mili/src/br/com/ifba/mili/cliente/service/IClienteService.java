/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.cliente.service;

import br.com.ifba.mili.cliente.model.Cliente;
import java.util.List;

/**
 *
 * @author jerry
 */
public interface IClienteService {
    //Metódo que salva um cliente na base de dados
    public abstract Cliente saveCliente(Cliente cliente);
    //Metódo que atualiza um cliente na base de dados
    public abstract Cliente updateCliente(Cliente cliente);
    //Metódo que deleta um cliente da base de dados
    public abstract void delteCliente(Cliente cliente);
    //Metódo que captura todos os clientes da base de dados
    public List<Cliente> getAllCliente();
    //Metódo que captura um cliente por id no banco de dados
    public abstract Cliente getByIdCliente(Long id);
    //Metódo que captura um cliente por nome no banco de dados
    //public abstract Cliente getByNameCliente(String nome);
}
