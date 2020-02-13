/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.produto.dao;

import br.com.ifba.mili.infrastructure.dao.IGenericDao;
import br.com.ifba.mili.produto.model.Produto;

/**
 *
 * @author jerry
 */
public interface IProdutoDao extends IGenericDao<Produto>{
    public abstract Produto findByNameProduto(String nome);
}
