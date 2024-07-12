package org.example.insert_data_using_sjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("insert_data config.xml");
        JdbcTemplate template=context.getBean("jdbcTemplate", JdbcTemplate.class);

        //insert query
        String query="insert into student(id,name,city) values(?,?,?)";

        //fire query
//        int result=template.update(query,101,"Rahul","Kanpur");
        int result2=template.update(query,103,"Rahul","Kanpur");

        System.out.println("Records are inserted into table...."+result2);
    }
}
