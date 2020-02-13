/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.fornecedor.service;

import br.com.ifba.mili.fornecedor.model.Fornecedor;
import java.util.List;

/**
 *
 * @author jerry
 */
public interface IFornecedorService {
  
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    public abstract Fornecedor updateFornecedor(Fornecedor fornecedor);
    public abstract void deleteFornecedor(Fornecedor fornecedor);
    public List<Fornecedor> getAllFornecedor();
    public abstract Fornecedor getByIdFornecedor(long id);    
    
}
