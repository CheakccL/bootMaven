package com.service;

import com.dao.JdbcDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private JdbcDao jdbcDao;

    public List<User> findAll(){
        return jdbcDao.findAll();
    }
}
