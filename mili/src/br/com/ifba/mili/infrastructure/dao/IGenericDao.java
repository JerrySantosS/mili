/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.mili.infrastructure.dao;

import br.com.ifba.mili.infrastructure.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author jerry
 * @param <Entity>
 */
public interface IGenericDao <Entity extends AbstractEntity>{
    
    /**
     * Save an instance of a persistence entity to the data base
     * 
     * @param entity
     * @return the entity
     */
    Entity save(Entity entity);
    
    /**
     * Update an instance of a persistence entity to the data base
     * 
     * @param entity
     * @return the entity
     */
    Entity update(Entity entity);
    
     /**
     * Remove an instance of a persistence entity to the data base
     * 
     * @param entity
     */
    void delete(Entity entity);
    
    /**
     * Retrieve all instances of a persistence entity from the data base
     * @return a {@link List} with the instances
     */
    List<Entity> findAll();
    
    /**
     * Find an entity by primary key.
     * 
     * @param id
     * @return the entity.
     */
    Entity findById(Long id);
}
