/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.infrastructure.service;

import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.fornecedor.model.Fornecedor;
import br.com.ifba.mili.funcionario.model.Funcionario;
import br.com.ifba.mili.produto.model.Produto;
import java.util.List;

/**
 *
 * @author jerry
 */
public interface IFachada {
    
    //---------------CLIENTE------------------\\
    //Metódo que salva um cliente na base de dados
    public abstract Cliente saveCliente(Cliente cliente);
    //Metódo que atualiza um cliente na base de dados
    public abstract Cliente updateCliente(Cliente cliente);
    //Metódo que deleta um cliente da base de dados
    public abstract void delteFornecedor(Cliente cliente);
    //Metódo que captura todos os clientes da base de dados
    public List<Cliente> getAllCliente();
    //Metódo que captura um cliente por id no banco de dados
    public abstract Cliente getByIdCliente(Long id);
    //Metódo que captura um cliente por nome no banco de dados
    //public abstract Cliente getByNameCliente(String nome);
    
    //---------------------------------------------------------\\
    
    //----------------FORNECEDOR-------------------------------\\
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    public abstract Fornecedor updateFornecedor(Fornecedor fornecedor);
    public abstract void deleteFornecedor(Fornecedor fornecedor);
    public List<Fornecedor> getAllFornecedor();
    public abstract Fornecedor getByIdFornecedor(long id);    
    
    //---------------------------------------------------------\\
    
    //----------------FUNCIONARIO-------------------------------\\
    //Metódo que salva um Funcionario na base de dados
    public abstract Funcionario saveFuncionario(Funcionario fc);
    //Metódo que atualiza um Funcionario na base de dados
    public abstract Funcionario updateFuncionario(Funcionario fc);
    //Metódo que deleta um Funcionario da base de dados
    public abstract void delteFuncionario(Funcionario fc);
    //Metódo que captura todos os Funcionario da base de dados
    public List<Funcionario> getAllFuncionario();
    //Metódo que captura um Funcionario por id no banco de dados
    public abstract Funcionario getByIdFuncionario(Long id);
    //Metódo que captura um Funcionario por cpf no banco de dados
    public abstract Funcionario getByCpfFuncionario(String cpf);    
    
    //---------------------------------------------------------\\
    
    //----------------FUNCIONARIO-------------------------------\\
    //Metódo que salva um Produto na base de dados
    public abstract Produto saveProduto(Produto p);
    //Metódo que atualiza um Produto na base de dados
    public abstract Produto updateProduto(Produto p);
    //Metódo que deleta um Produto da base de dados
    public abstract void delteProduto(Produto p);
    //Metódo que captura todos os Produtos da base de dados
    public List<Produto> getAllProduto();
    //Metódo que captura um Produto por id no banco de dados
    public abstract Produto findByIdProduto(Long id);
    //Metódo que captura um Produto por nome no banco de dados
    public abstract Produto findByProdutoName(String nome);  
    
    //---------------------------------------------------------\\
}
