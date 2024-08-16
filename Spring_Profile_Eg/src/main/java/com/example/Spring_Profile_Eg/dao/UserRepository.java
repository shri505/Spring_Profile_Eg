package com.example.Spring_Profile_Eg.dao;

import com.example.Spring_Profile_Eg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {



}
