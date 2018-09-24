package com.cenzhongman.spring.p04JDBCTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IUserDAOImpl implements IUserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(User user) {
        if (jdbcTemplate == null){
            System.out.println("这个是假的");
        }
        System.out.printf("insert into user(userNname, age) values(" + user.getName() + "," + user.getAge() + ")");
//        return jdbcTemplate.update("insert into user(userNname, age) values(?, ?)",
//                user.getName(), user.getAge());
        jdbcTemplate.execute("insert into user(userNname, age) values(" + user.getName() + "," + user.getAge() + ")");
        return 0;
    }

    @Override
    public int update(User account) {
        return jdbcTemplate.update("");
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("");
    }

    @Override
    public User findAccountById(int id) {
        List<User> users = jdbcTemplate.query("SELECT * from User limit 1", new Object[]{}, new BeanPropertyRowMapper(User.class));
        return users.get(0);
    }

    @Override
    public List<User> findAccountList() {
        return jdbcTemplate.query("SELECT * from User", new Object[]{}, new BeanPropertyRowMapper(User.class));
    }
}
