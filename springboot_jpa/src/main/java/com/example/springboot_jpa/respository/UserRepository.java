package com.example.springboot_jpa.respository;

import com.example.springboot_jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface UserRepository extends JpaRepository<User,Long>{
        public List<User> findAll();
    }


