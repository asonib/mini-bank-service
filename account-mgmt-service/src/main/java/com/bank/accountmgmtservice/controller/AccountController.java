package com.bank.accountmgmtservice.controller;

import com.bank.accountmgmtservice.model.Account;
import com.bank.accountmgmtservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/createAccount")
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }
}
