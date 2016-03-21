/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.urban_cuts.services.crud.crudServiceImpl;

import com.wesley.urban_cuts.domain.Style;
import com.wesley.urban_cuts.repository.GenericDAO;
import com.wesley.urban_cuts.services.crud.crudServices.StyleCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Service("StyleCrudService")
@Transactional
public class StyleCrudServiceImpl implements StyleCrudService {

    @Autowired
    private GenericDAO<Style> dao;

    public final void setDao(final GenericDAO<Style> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Style.class);
    }

    StyleCrudServiceImpl() {
    }
    
    @Override
    public Style findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    
    @Override
    public List<Style> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Style entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Style entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Style entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Style v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Style> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Style getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Style> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
