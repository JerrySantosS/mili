/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.fornecedor.service;

import br.com.ifba.mili.fornecedor.dao.FornecedorDao;
import br.com.ifba.mili.fornecedor.dao.IFornecedorDao;
import br.com.ifba.mili.fornecedor.model.Fornecedor;
import br.com.ifba.mili.infrastructure.support.EmailUtil;
import br.com.ifba.mili.infrastructure.support.StringUtil;
import br.com.ifba.mili.insfrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author jerry
 */
public class FornecedorService implements IFornecedorService{
    // Representa a mensagem de erro se o fornecedor for nulo.
    public final static String FORNECEDOR_NULL = "Fornecedor null";
    // Representa a mensagem de erro se o fornecedor já existir.
    public final static String FORNECEDOR = "O Fornecedor já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o fornecedor não existir na base de dados (na hora do update).
    public final static String FORNECEDOR_NAO_EXISTE = "O Fornecedor NÃO existe na base de dados";
    // Representa a mensagem de erro se o fornecedor for inválido.
    public final static String FORNECEDOR_INVALIDO = "Fornecedor inválido";
    
    IFornecedorDao fornecedorDao = new FornecedorDao();

    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NULL);
        }else if(this.validaFornecedor(fornecedor) == false){
            // Tratamento de exceção
           throw new BusinessException(FORNECEDOR_INVALIDO);
        }else if(this.fornecedorExistente(fornecedor)){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR);
        }else {        
            // Salvando objeto na base de dados
            return this.fornecedorDao.save(fornecedor);
        }
    }

    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NULL);
        }else if(this.validaFornecedor(fornecedor) == false){
            // Tratamento de exceção
           throw new BusinessException(FORNECEDOR_INVALIDO);
        }else if(this.fornecedorDao.findById(fornecedor.getId()) == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NAO_EXISTE);
        }else {        
            // Salvando objeto na base de dados
            return this.fornecedorDao.update(fornecedor);
        }
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NULL);
        }else if(this.fornecedorDao.findById(fornecedor.getId()) == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NAO_EXISTE);
        }else {        
            // Salvando objeto na base de dados
            this.fornecedorDao.delete(fornecedor);
        }
    }

    @Override
    public List<Fornecedor> getAllFornecedor() {
       return this.fornecedorDao.findAll();       
    }

    @Override
    public Fornecedor getByIdFornecedor(long id) {
        return this.fornecedorDao.findById(id);
    }
   
    private boolean validaFornecedor(Fornecedor f) {
        StringUtil util = StringUtil.getInstance();
        EmailUtil email = EmailUtil.getInstance();
        
        if(util.isNullOrEmpty(f.getBairro())) {
            return false;
        }else if(util.isNullOrEmpty(f.getCep()) || f.getCep().matches("[a-zA-Z]")){
            return false;
        }else if(util.isNullOrEmpty(f.getCidade())) {
            return false;
        }else if(util.isNullOrEmpty(f.getCnpj()) || f.getCnpj().matches("[a-zA-Z]")) {
            return false;
        }else if(!email.isEmailValid(f.getEmail())) {
            return false;
        }else if(util.isNullOrEmpty(f.getEstado())) {
            return false;
        }else if(util.isNullOrEmpty(f.getFax()) || f.getFax().matches("[a-zA-Z]")) {
            return false;
        }else if(util.isNullOrEmpty(f.getInscricaoEstadual()) || f.getInscricaoEstadual().matches("[a-zA-Z]")) {
            return false;
        }else if(util.isNullOrEmpty(f.getRazaoSocial())) {
            return false;
        }else if(util.isNullOrEmpty(f.getRua())) {
            return false;
        }else return !(util.isNullOrEmpty(f.getTelefone()) || f.getTelefone().matches("[a-zA-Z]")); 
    }
    
    private boolean fornecedorExistente(Fornecedor f) {
        return this.fornecedorDao.findById(f.getId()) == f;
    }
}
