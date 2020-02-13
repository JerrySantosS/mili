/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.funcionario.service;

import br.com.ifba.mili.funcionario.model.Funcionario;
import java.util.List;

/**
 *
 * @author jerry
 */
public interface IFuncionarioService {
    //Metódo que salva um Funcionario na base de dados
    public abstract Funcionario saveFuncionario(Funcionario fc);
    //Metódo que atualiza um Funcionario na base de dados
    public abstract Funcionario updateFuncionario(Funcionario fc);
    //Metódo que deleta um Funcionario da base de dados
    public abstract void deleteFuncionario(Funcionario fc);
    //Metódo que captura todos os Funcionario da base de dados
    public List<Funcionario> getAllFuncionario();
    //Metódo que captura um Funcionario por id no banco de dados
    public abstract Funcionario getByIdFuncionario(Long id);
    //Metódo que captura um Funcionario por cpf no banco de dados
    public abstract Funcionario getByCpfFuncionario(String cpf);
}