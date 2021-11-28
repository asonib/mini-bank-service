package com.bank.accountmgmtservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {
    @Id
    @GeneratedValue
    private Integer id;
    private String accountIdentification;
    private String accountHolderName;
    private String address;
    private String agentId;
    private String userId;
}
