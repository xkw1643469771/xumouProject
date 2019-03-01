package com.xumou.project.test.controller;

import com.xumou.project.test.entity.User;
import com.xumou.project.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 */
@RestController
public class TestController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("test")
    public Object test(){
        Example<User> example = Example.of(new User());
        example.getProbe().setId(1L);
        return userRepository.findAll(example);
    }

    @GetMapping("insert")
    public void test(User user) {
        User one = userRepository.findOne(user.getId());
        if (one == null){
            userRepository.saveAndFlush(user);
        }else {
            one.setName(user.getName());
            userRepository.saveAndFlush(one);
        }
    }

}