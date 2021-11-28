package com.bank.usermgmtservice.service;

import com.bank.usermgmtservice.dto.UserAccountResponse;
import com.bank.usermgmtservice.dto.Account;
import com.bank.usermgmtservice.model.User;
import com.bank.usermgmtservice.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    public Integer generateValue(int limit){
        Random random = new Random();
        return random.nextInt(limit);
    }

    public UserAccountResponse createUser(User user){
        Account accountObj = new Account();
        accountObj.setAccountHolderName(user.getFirstName()+" "+user.getLastName());
        accountObj.setAddress(user.getAddress());
        accountObj.setUserId(user.getId().toString());
        accountObj.setAgentId(generateValue(9999).toString());
        accountObj.setAccountIdentification(generateValue(999999999).toString());
        Account account = restTemplate.postForObject("http://account-mgmt-service/account/createAccount", accountObj, Account.class);
        User userData =  userRepository.save(user);

        UserAccountResponse userAccountResponse = new UserAccountResponse();
        BeanUtils.copyProperties(user, userAccountResponse);
        userAccountResponse.setAccount(account);
        return userAccountResponse;
    }
}
