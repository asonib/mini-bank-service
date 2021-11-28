package com.bank.accountmgmtservice.repository;

import com.bank.accountmgmtservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
