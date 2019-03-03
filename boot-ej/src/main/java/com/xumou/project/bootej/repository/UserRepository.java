package com.xumou.project.bootej.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xumou.project.bootej.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
