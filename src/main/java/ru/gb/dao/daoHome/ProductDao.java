package ru.gb.dao.daoHome;

import ru.gb.entity.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(Long id);
    String findTitleById(Long id);


}
