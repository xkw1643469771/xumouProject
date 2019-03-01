package com.xumou.project.test.repository;

import com.xumou.project.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 */
public interface UserRepository extends JpaRepository<User, Long> , JpaSpecificationExecutor<User>{



}