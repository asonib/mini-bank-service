package com.bank.usermgmtservice.repository;

import com.bank.usermgmtservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
