/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.cliente.model;

import br.com.ifba.mili.infrastructure.model.Pessoa;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 *
 * @author Icaro
 */

@Entity
@Table(name="cliente")
public class Cliente extends Pessoa implements Serializable{ 
    
}
