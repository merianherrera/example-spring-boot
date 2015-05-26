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
public class CustomerRepository {
    //protected final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    protected JdbcTemplate jdbc;

    public Customer getCustomer(long id) {
        return jdbc.queryForObject("SELECT * FROM customer WHERE id=?", CustomerMapper, id);
    }

    public List<Customer> getCustomers() {
        //String inIds = StringUtils.arrayToCommaDelimitedString(ObjectUtils.toObjectArray(ids));
        return jdbc.query("SELECT * FROM customer", CustomerMapper);
    }

    private static final RowMapper<Customer> CustomerMapper = new RowMapper<Customer>() {
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer = new Customer(rs.getLong("id"), rs.getString("name"), rs.getString("lastname"));
            return customer;
        }
    };

}
