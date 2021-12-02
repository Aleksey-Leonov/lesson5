package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.config.HibernateConfig;
import ru.gb.dao.daoHome.DbConfig;
import ru.gb.dao.daoHome.JdbcProductDao;
import ru.gb.dao.daoHome.ProductDao;

import ru.gb.entity.Product;

public class ShopApp {



    public static void main(String[] args) {


        JdbcProductDao jdbcProductDao=new JdbcProductDao();

        System.out.println(jdbcProductDao.findById(2L));

        System.out.println(jdbcProductDao.findTitleById(5L));


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        ProductDao productDao=  context.getBean(ProductDao.class);

        for (Product product : productDao.findAll()) {
            System.out.println(product);
        }


//        for (Product product: jdbcProductDao.findAll()){
//            System.out.println(product);
//        }





//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        System.out.println(manufacturerDao.findNameById(3L));
//        System.out.println("-----------------------");
//        System.out.println(manufacturerDao.findById(3L));
//        System.out.println("-----------------------");
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//        }

    }
}
