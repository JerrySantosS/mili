/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.produto.service;

import br.com.ifba.mili.infrastructure.support.StringUtil;
import br.com.ifba.mili.insfrastructure.exception.BusinessException;
import br.com.ifba.mili.produto.dao.IProdutoDao;
import br.com.ifba.mili.produto.dao.ProdutoDao;
import br.com.ifba.mili.produto.model.Produto;
import java.util.List;

/**
 *
 * @author jerry
 */
public class ProdutoService implements IProdutoService{

    // Representa a mensagem de erro se o produto for nulo.
    public final static String PRODUTO_NULL = "Produto null";
    // Representa a mensagem de erro se o produto já existir.
    public final static String PRODUTO = "O Produto já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o produto não existir na base de dados (na hora do update).
    public final static String PRODUTO_NAO_EXISTE = "O Produto NÃO existe na base de dados";
    // Representa a mensagem de erro se o produto for inválido.
    public final static String PRODUTO_INVALIDO = "Produto inválido";
    
    // Objeto que faz a comunicação com a camada Dao
    IProdutoDao pd = new ProdutoDao();
    
    @Override
    public Produto saveProduto(Produto p) {
        if(p == null){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO_NULL);
        }else if(this.validaProduto(p) == false){
            // Tratamento de exceção
           throw new BusinessException(PRODUTO_INVALIDO);
        }else if(!(pd.findById(p.getId()) == null)){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO);
        }else {        
            // Salvando objeto na base de dados
            return this.pd.save(p);
        }
    }

    @Override
    public Produto updateProduto(Produto p) {
        if(p == null){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO_NULL);
        }else if(this.validaProduto(p) == false){
            // Tratamento de exceção
           throw new BusinessException(PRODUTO_INVALIDO);
        }else if(pd.findById(p.getId()) == null){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO_NAO_EXISTE);
        }else {        
            // Salvando objeto na base de dados
            return this.pd.update(p);
        }
    }

    @Override
    public void deleteProduto(Produto p) {
        if(p == null){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO_NULL);
        }else if(pd.findById(p.getId()) == null){
            // Tratamento de exceção
            throw new BusinessException(PRODUTO_NAO_EXISTE);
        }else {        
            // Salvando objeto na base de dados
            this.pd.delete(p);
        }
    }

    @Override
    public List<Produto> getAllProduto() {
        return this.pd.findAll();
    }

    @Override
    public Produto findByIdProduto(Long id) {
        return this.pd.findById(id);
    }

    @Override
    public Produto findByProdutoName(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean validaProduto(Produto p) {
        StringUtil util = StringUtil.getInstance();
        
        if(
            (util.isNullOrEmpty(p.getGenero())) ||
            (p.getDataValidade() == null) ||
            (util.isNullOrEmpty(p.getNomeProduto()))
        ){
            
            return false; 
            
        }else       
            return true;
        
    }
    
}
