package com.gj.dao;

import com.gj.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountDaoTest {
    @Autowired
    private IAccountDao accountDao;
    @Test
    public void findAllTest() throws Exception {

//        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession=factory.openSession();
//        IAccountDao dao=sqlSession.getMapper(IAccountDao.class);
        List<Account> allAccount = accountDao.getAllAccount();

        for(Account account:allAccount){
            System.out.println(account);
        }

    }

    @Test
    public void saveAccountTest() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession=factory.openSession();
//        IAccountDao dao=sqlSession.getMapper(IAccountDao.class);
        Account account=new Account();
        account.setMoney(55);
        account.setName("jack");
        accountDao.saveAccount(account);
        //sqlSession.commit();
    }
}
