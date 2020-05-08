package com.gj.service;

import com.gj.domain.Account;

import java.util.List;

public interface IAccountService {
    void saveAccount(Account account);

    List<Account> getAllAccount() throws Exception;

    void deleteAccount(int id);

    int getCount();
}
