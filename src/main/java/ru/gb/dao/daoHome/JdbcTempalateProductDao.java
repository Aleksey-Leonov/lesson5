//package ru.gb.dao.daoHome;
//
//import lombok.Builder;
//import lombok.RequiredArgsConstructor;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//import ru.gb.entity.Product;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//@Component
//@RequiredArgsConstructor
//@Builder
//public class JdbcTempalateProductDao implements ProductDao {
//    private final JdbcTemplate jdbcTemplate;
//    private static final String FIND_ALL = "SELECT * FROM product";
//    private static final String FIND_BY_ID = "SELECT * FROM product WHERE id = ?";
//    private static final String FIND_TITLE_BY_ID = "SELECT title FROM product WHERE id = ?";
//
//    @Override
//    public List<Product> findAll() {
//        String sql = FIND_ALL;
//
//        List<Product> products = jdbcTemplate.query(
//                sql,
//                new BeanPropertyRowMapper(Product.class));
//
//        return products;
//    }
//
//    @Override
//    public Product findById(Long id) {
//        return (Product) jdbcTemplate.queryForObject(FIND_BY_ID, new Object[]{id}, new CustomerRowMapper());
//    }
//
//    public class CustomerRowMapper implements RowMapper<Product> {
//
//        @Override
//        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//            Product customer = new Product();
//            customer.setId(rs.getLong("id"));
//            customer.setTitle(rs.getString("title"));
//            customer.setCost(rs.getBigDecimal("cost"));
//            customer.setManufactureDate(rs.getDate("manufactureDate"));
//
//            return customer;
//
//        }
//    }
//
//    @Override
//    public String findTitleById(Long id) {
//        return null;
//    }
//
//
//}
