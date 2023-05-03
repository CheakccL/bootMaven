package com.dao;

import com.dao.JdbcDao;
import com.domain.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcDaoTest extends TestCase {

    @Autowired
    private JdbcDao jdbcDao;

    @Test
    public void findAll() {
        List<User> list = jdbcDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
