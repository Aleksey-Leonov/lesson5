//package ru.gb.dao.daoHome;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Component;
//import ru.gb.entity.Product;
//
//import java.util.HashMap;
//import java.util.List;
//
//@Component
//@RequiredArgsConstructor
//public class NamedParameterProductDao implements ProductDao {
//    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//    private static final String FIND_ALL = "SELECT * FROM product";
//    private static final String FIND_BY_ID = "SELECT * FROM product WHERE id = ?";
//    private static final String FIND_TITLE_BY_ID = "SELECT title FROM product WHERE id = :id";
//
//    @Override
//    public List<Product> findAll() {
//        return null;
//    }
//
//    @Override
//    public Product findById(Long id) {
//        return null;
//    }
//
//    @Override
//    public String findTitleById(Long id) {
//
//        HashMap<String, Object> namedParameters = new HashMap<>();
//        namedParameters.put("id", id);
//        return namedParameterJdbcTemplate.queryForObject(FIND_TITLE_BY_ID, namedParameters, String.class);
//
//    }
//}
