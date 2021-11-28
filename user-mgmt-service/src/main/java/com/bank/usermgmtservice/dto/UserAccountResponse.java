package com.bank.usermgmtservice.dto;

import com.bank.usermgmtservice.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountResponse extends User{
    private Account account;
}
