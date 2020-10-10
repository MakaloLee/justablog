package com.developer.justablog.controller;

import com.developer.justablog.entity.User;

import java.util.List;

/**
 * @author lijiaheng
 * @version 1.0
 * @date 2020/10/10 15:30
 */
public class BaseController {
    /**
     * 登录用户
     */
    protected User loginUser;
    /**
     * 管理员
     */
    protected static List<User> adminUsers;
}
