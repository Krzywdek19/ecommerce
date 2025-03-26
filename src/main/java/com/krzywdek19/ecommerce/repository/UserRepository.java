package com.krzywdek19.ecommerce.repository;

import com.krzywdek19.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
