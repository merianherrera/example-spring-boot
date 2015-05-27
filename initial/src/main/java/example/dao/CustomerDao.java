package example.dao;

import example.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class CustomerDao {

    @Autowired
    protected JdbcTemplate jdbc;

    public Customer getCustomer(long id) {
        return jdbc.queryForObject("SELECT * FROM customer WHERE id=?", CustomerMapper, id);
    }

    public List<Customer> getCustomers() {
        return jdbc.query("SELECT * FROM customer", CustomerMapper);
    }

    public int addCustomers(long id, String name, String lastname) {

        return jdbc.update("INSERT INTO customer(id, name, lastname) VALUES(?, ?, ?)", id, name, lastname);
    }

    public int updateCustomer(long id, String name, String lastname) {

        return jdbc.update("UPDATE customer SET name=?, lastname=? WHERE id=?", name, lastname, id);
    }

    public int deleteCustomer(long id) {

        return jdbc.update("DELETE FROM customer WHERE id=?", id);
    }

    private static final RowMapper<Customer> CustomerMapper = new RowMapper<Customer>() {
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer = new Customer(rs.getLong("id"), rs.getString("name"), rs.getString("lastname"));
            return customer;
        }
    };

}
