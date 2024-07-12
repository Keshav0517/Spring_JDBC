package org.example.jdbcdao_without_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class jdbcdao_config {

    //we can pass multiple names into Bean annotation
    @Bean(name={"ds","datasource"})
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/employee");
        ds.setUsername("root");
        ds.setPassword("Keshav798794");
        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean("studentDao")
    public StudentDao getStudentDao(){
        StudentDao_imp studentDao=new StudentDao_imp();
        studentDao.setJdbcTemplate(getJdbcTemplate());
        return studentDao;
    }
}
