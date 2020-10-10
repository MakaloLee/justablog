package com.developer.justablog.service.impl;

import com.developer.justablog.dao.UserMapper;
import com.developer.justablog.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintServiceImpl implements PrintService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String printHello() {
        return userMapper.getUserName();
    }
}
