/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.infrastructure.service;

import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.cliente.service.ClienteService;
import br.com.ifba.mili.cliente.service.IClienteService;
import br.com.ifba.mili.fornecedor.model.Fornecedor;
import br.com.ifba.mili.fornecedor.service.FornecedorService;
import br.com.ifba.mili.fornecedor.service.IFornecedorService;
import br.com.ifba.mili.funcionario.model.Funcionario;
import br.com.ifba.mili.funcionario.service.FuncionarioService;
import br.com.ifba.mili.funcionario.service.IFuncionarioService;
import br.com.ifba.mili.produto.model.Produto;
import br.com.ifba.mili.produto.service.IProdutoService;
import br.com.ifba.mili.produto.service.ProdutoService;
import java.util.List;

/**
 *
 * @author jerry
 */
public class Fachada implements IFachada{
    
//-------------------- CLIENTE -----------------------------------------------\\
        
    private final IClienteService cs = new ClienteService();

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return this.cs.saveCliente(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return this.cs.updateCliente(cliente);
    }

    @Override
    public void delteFornecedor(Cliente cliente) {
        this.cs.delteCliente(cliente);
    }

    @Override
    public List<Cliente> getAllCliente() {
        return this.cs.getAllCliente();
    }

    @Override
    public Cliente getByIdCliente(Long id) {
        return this.cs.getByIdCliente(id);
    }
    
//----------------------------------------------------------------------------\\

//-------------------  FORNECEDOR  -------------------------------------------\\
    
    private final IFornecedorService fs = new FornecedorService();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return this.fs.saveFornecedor(fornecedor);
    }

    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        return this.fs.updateFornecedor(fornecedor);
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        this.fs.deleteFornecedor(fornecedor);
    }

    @Override
    public List<Fornecedor> getAllFornecedor() {
        return this.fs.getAllFornecedor();
    }

    @Override
    public Fornecedor getByIdFornecedor(long id) {
        return this.fs.getByIdFornecedor(id);
    }
    
//----------------------------------------------------------------------------\\

//-------------------  FUNCIONARIO CAIXA  ------------------------------------\\
    private final IFuncionarioService fcs = new FuncionarioService();
    
    @Override
    public Funcionario saveFuncionario(Funcionario fc) {
        return this.fcs.saveFuncionario(fc);
    }

    @Override
    public Funcionario updateFuncionario(Funcionario fc) {
        return this.fcs.updateFuncionario(fc);
    }

    @Override
    public void delteFuncionario(Funcionario fc) {
        this.fcs.deleteFuncionario(fc);
    }

    @Override
    public List<Funcionario> getAllFuncionario() {
        return this.fcs.getAllFuncionario();
    }

    @Override
    public Funcionario getByIdFuncionario(Long id) {
        return this.fcs.getByIdFuncionario(id);
    }

    @Override
    public Funcionario getByCpfFuncionario(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//----------------------------------------------------------------------------\\
    
//-------------------- PRODUTO -----------------------------------------------\\   
    private final IProdutoService ps = new ProdutoService();
    @Override
    public Produto saveProduto(Produto p) {
       return this.ps.saveProduto(p);
    }

    @Override
    public Produto updateProduto(Produto p) {
        return this.ps.updateProduto(p);
    }

    @Override
    public void delteProduto(Produto p) {
        this.ps.deleteProduto(p);
    }

    @Override
    public List<Produto> getAllProduto() {
        return this.ps.getAllProduto();
    }

    @Override
    public Produto findByIdProduto(Long id) {
        return this.ps.findByIdProduto(id);
    }

    @Override
    public Produto findByProdutoName(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//----------------------------------------------------------------------------\\
    
             
}
