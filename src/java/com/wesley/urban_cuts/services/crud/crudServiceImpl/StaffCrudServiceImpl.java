/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.urban_cuts.services.crud.crudServiceImpl;

import com.wesley.urban_cuts.domain.Staff;
import com.wesley.urban_cuts.repository.GenericDAO;
import com.wesley.urban_cuts.services.crud.crudServices.StaffCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Service("StaffCrudService")
@Transactional
public class StaffCrudServiceImpl implements StaffCrudService {

    @Autowired
    private GenericDAO<Staff> dao;

    public final void setDao(final GenericDAO<Staff> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Staff.class);
    }

    StaffCrudServiceImpl() {
    }
    
    @Override
    public Staff findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Staff> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Staff entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Staff entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Staff entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Staff v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Staff> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Staff getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Staff> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
