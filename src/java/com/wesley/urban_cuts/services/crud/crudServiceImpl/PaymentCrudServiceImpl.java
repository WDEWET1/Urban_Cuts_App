/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.urban_cuts.services.crud.crudServiceImpl;

import com.wesley.urban_cuts.domain.Payment;
import com.wesley.urban_cuts.domain.Staff;
import com.wesley.urban_cuts.repository.GenericDAO;
import com.wesley.urban_cuts.services.crud.crudServices.PaymentCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Service("PaymentCrudService")
@Transactional
public class PaymentCrudServiceImpl implements PaymentCrudService {

    @Autowired
    private GenericDAO<Payment> dao;

    public final void setDao(final GenericDAO<Payment> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Payment.class);
    }

    PaymentCrudServiceImpl() {
    }
    
    @Override
    public Payment findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Payment> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Payment entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Payment entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Payment entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Payment v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Payment> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Payment getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Payment> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);
    }
}
