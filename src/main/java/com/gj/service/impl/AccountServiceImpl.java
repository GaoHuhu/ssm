package com.gj.service.impl;

import com.gj.dao.IAccountDao;
import com.gj.domain.Account;
import com.gj.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public List<Account> getAllAccount() {
        List<Account> accounts=accountDao.getAllAccount();
        return accounts;
    }

    @Override
    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);
    }
}
