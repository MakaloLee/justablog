package com.developer.justablog.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // TODO: 2020/10/10 现在的登陆页、用户名和密码都是用的spring-security默认的 
        http.authorizeRequests().antMatchers("/", "/welcome/*").permitAll()
                .anyRequest().authenticated().and().formLogin();
    }
}
