package ru.gb.dao.daoHome;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.entity.Product;


import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class HibernateProductDao implements ProductDao {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return Collections.unmodifiableList(sessionFactory.getCurrentSession().createQuery("from Product p").list());
    }


    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public String findTitleById(Long id) {
        return null;
    }
}
