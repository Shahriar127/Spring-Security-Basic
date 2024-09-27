package com.shahriar.SpringSecurityEx.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String EmpName);
}
