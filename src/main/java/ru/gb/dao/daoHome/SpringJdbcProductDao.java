//package ru.gb.dao.daoHome;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//import ru.gb.entity.Product;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//
//@RequiredArgsConstructor
//@Component
//public class SpringJdbcProductDao implements ProductDao {
//
//    private static final String FIND_ALL = "SELECT * FROM product";
//    private static final String FIND_BY_ID = "SELECT * FROM product WHERE id = ?";
//    private static final String FIND_TITLE_BY_ID = "SELECT title FROM product WHERE id = ?";
//
//    private final DataSource dataSource;
//
//    @Override
//    public List<Product> findAll() {
//        List<Product> result = new ArrayList<>();
//        Connection connection = null;
//        try {
//            connection = dataSource.getConnection();
//            PreparedStatement statement = connection.prepareStatement(FIND_ALL);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                final Product product = Product.builder()
//                        .id(resultSet.getLong("id"))
//                        .title(resultSet.getString("title"))
//                        .cost(resultSet.getBigDecimal("cost"))
//                        .manufactureDate(resultSet.getDate("manufactureDate"))
//                        .build();
//                result.add(product);
//            }
//            statement.close();
//        } catch (SQLException e) {
//
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public Product findById(Long id) {
//        return null;
//    }
//
//    @Override
//    public String findTitleById(Long id) {
//        return null;
//    }
//}
