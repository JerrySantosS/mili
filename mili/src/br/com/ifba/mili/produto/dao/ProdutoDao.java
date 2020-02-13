/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.produto.dao;

import br.com.ifba.mili.infrastructure.dao.GenericDao;
import br.com.ifba.mili.produto.model.Produto;

/**
 *
 * @author jerry
 */
public class ProdutoDao extends GenericDao<Produto> implements IProdutoDao{

    @Override
    public Produto findByNameProduto(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
