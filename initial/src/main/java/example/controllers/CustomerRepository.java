package example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import example.controllers.Customer.*;

@Repository
public class CustomerRepository {
    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    protected JdbcTemplate jdbc;

    public Customer getCustomer(long id) {
        return jdbc.queryForObject("SELECT * FROM customer WHERE id=?", CustomerMapper, id);
    }

    public List<Customer> getCustomers() {
        /*String inIds = StringUtils.arrayToCommaDelimitedString(ObjectUtils.toObjectArray(ids));
        return jdbc.query("SELECT * FROM customer", customerMapper);*/
    }

    private static final RowMapper<Customer> CustomerMapper = new RowMapper<Customer>() {
        public Customer mapRow(ResultSet rs, long rowNum) throws SQLException {
            Customer customer = new Customer(rs.getLong("id"), rs.getString("name"), rs.getString("lastname"));
            return customer;
        }
    };

}
