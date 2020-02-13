/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.funcionario.service;

import br.com.ifba.mili.funcionario.dao.FuncionarioDao;
import br.com.ifba.mili.funcionario.model.Funcionario;
import br.com.ifba.mili.infrastructure.support.EmailUtil;
import br.com.ifba.mili.infrastructure.support.StringUtil;
import br.com.ifba.mili.insfrastructure.exception.BusinessException;
import java.util.List;
import br.com.ifba.mili.funcionario.dao.IFuncionarioDao;

/**
 *
 * @author jerry
 */
public class FuncionarioService implements IFuncionarioService{

    // Representa a mensagem de erro se o FUNCIONARIO for nulo.
    public final static String FUNCIONARIOCAIXA_NULL = "Funcionario null";
    // Representa a mensagem de erro se o FUNCIONARIO já existir.
    public final static String FUNCIONARIOCAIXA = "O Funcionario já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o FUNCIONARIO não existir na base de dados (na hora do update).
    public final static String FUNCIONARIOCAIXA_NAO_EXISTE = "O Funcionario NÃO existe na base de dados";
    // Representa a mensagem de erro se o FUNCIONARIO for inválido.
    public final static String FUNCIONARIOCAIXA_INVALIDO = "Funcionario inválido";
    
    // Objeto que faz a comunicação com a camada Dao
    IFuncionarioDao fcd = new FuncionarioDao();
    
    @Override
    public Funcionario saveFuncionario(Funcionario fc) {
        if(fc == null){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIOCAIXA_NULL);
        }else if(this.validaFuncionario(fc) == false){
            // Tratamento de exceção
           throw new BusinessException(FUNCIONARIOCAIXA_INVALIDO);
        }else if(!(fcd.findById(fc.getId()) == null)){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIOCAIXA);
        }else {        
            // Salvando objeto na base de dados
            return this.fcd.save(fc);
        }
    }

    @Override
    public Funcionario updateFuncionario(Funcionario fc) {
        if(fc == null){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIOCAIXA_NULL);
        }else if(this.validaFuncionario(fc) == false){
            // Tratamento de exceção
           throw new BusinessException(FUNCIONARIOCAIXA_INVALIDO);
        }else if(fcd.findById(fc.getId()) == null){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIOCAIXA_NAO_EXISTE);
        }else {        
            // Salvando objeto na base de dados
            return this.fcd.update(fc);
        }
    }

    @Override
    public void deleteFuncionario(Funcionario fc) {
       if(fc == null){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIOCAIXA_NULL);
        }else if(fcd.findById(fc.getId()) == null){
            // Tratamento de exceção
            throw new BusinessException(FUNCIONARIOCAIXA);
        }else {        
            // Salvando objeto na base de dados
            this.fcd.delete(fc);
        }
    }

    @Override
    public List<Funcionario> getAllFuncionario() {
        return this.fcd.findAll();
    }

    @Override
    public Funcionario getByIdFuncionario(Long id) {
        return this.fcd.findById(id);
    }

    @Override
    public Funcionario getByCpfFuncionario(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean validaFuncionario(Funcionario f) {
        StringUtil util = StringUtil.getInstance();
        EmailUtil eUtil = EmailUtil.getInstance();
        
        if(
            (util.isNullOrEmpty(f.getNome())) ||
            (f.getDataNasc() == null) ||
            (util.isNullOrEmpty(f.getBairro())) ||
            (util.isNullOrEmpty(f.getCidade())) ||
            (util.isNullOrEmpty(f.getEstado())) ||
            (util.isNullOrEmpty(f.getRua())) ||
            (util.isNullOrEmpty(f.getSexo())) ||
            (util.isNullOrEmpty(f.getCep()) || f.getCep().matches("[a-zA-z]")) ||
            (util.isNullOrEmpty(f.getCpf()) || f.getCpf().matches("[a-zA-z]")) ||
            (util.isNullOrEmpty(f.getRg()) || f.getRg().matches("[a-zA-z]")) ||
            (util.isNullOrEmpty(f.getTelefone()) || f.getTelefone().matches("[a-zA-z]")) ||
            (!eUtil.isEmailValid(f.getEmail())) ||            
            (util.isNullOrEmpty(f.getSenha())) ||
            (f.getTipo() != 1 && f.getTipo() != 2)
        ) {
            
            return false; 
            
        }else       
            return true;
    }
    
   
}
