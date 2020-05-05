package com.gj.dao;

import com.gj.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountDaoTest {
    @Test
    public void findAllTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession=factory.openSession();
        IAccountDao dao=sqlSession.getMapper(IAccountDao.class);
        List<Account> allAccount = dao.getAllAccount();

        for(Account account:allAccount){
            System.out.println(account);
        }

    }

    @Test
    public void saveAccountTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession=factory.openSession();
        IAccountDao dao=sqlSession.getMapper(IAccountDao.class);
        Account account=new Account();
        account.setMoney(55);
        account.setName("jack");
        dao.saveAccount(account);
        sqlSession.commit();
    }
}
