package com.gj.service;

import com.gj.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountServiceTest {
    @Autowired
    private IAccountService accountService;
    @Test
    public void getAllAccountTest(){
        List<Account> allAccount = accountService.getAllAccount();
        for(Account account:allAccount){
            System.out.println(account);
        }
    }
}
