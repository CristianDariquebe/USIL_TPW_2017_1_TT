package pe.egcc.venta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractJdbcSupport {
    
    @Autowired
    protected JdbcTemplate jdbcTemplate;
    
}
