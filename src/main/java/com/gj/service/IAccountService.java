package com.gj.service;

import com.gj.domain.Account;

import java.util.List;

public interface IAccountService {
    void saveAccount(Account account);

    List<Account> getAllAccount();

    void deleteAccount(int id);
}
