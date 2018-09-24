package com.cenzhongman.spring.p04JDBCTemplate;

import java.util.List;

public interface IUserDAO {
    int add(User user);

    int update(User user);

    int delete(int id);

    User findAccountById(int id);

    List<User> findAccountList();
}
