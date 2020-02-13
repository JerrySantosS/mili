/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.produto.service;

import br.com.ifba.mili.produto.model.Produto;
import java.util.List;

/**
 *
 * @author jerry
 */
public interface IProdutoService {
     //Metódo que salva um Produto na base de dados
    public abstract Produto saveProduto(Produto p);
    //Metódo que atualiza um Produto na base de dados
    public abstract Produto updateProduto(Produto p);
    //Metódo que deleta um Produto da base de dados
    public abstract void deleteProduto(Produto p);
    //Metódo que captura todos os Produtos da base de dados
    public List<Produto> getAllProduto();
    //Metódo que captura um Produto por id no banco de dados
    public abstract Produto findByIdProduto(Long id);
    //Metódo que captura um Produto por nome no banco de dados
    public abstract Produto findByProdutoName(String nome);
}
