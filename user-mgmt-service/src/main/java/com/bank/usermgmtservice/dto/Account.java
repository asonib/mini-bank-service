package com.bank.usermgmtservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private String accountIdentification;
    private String accountHolderName;
    private String address;
    private String agentId;
    private String userId;
}
