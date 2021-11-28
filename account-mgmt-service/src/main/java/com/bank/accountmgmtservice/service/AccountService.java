package com.bank.accountmgmtservice.service;

import com.bank.accountmgmtservice.model.Account;
import com.bank.accountmgmtservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }
}
