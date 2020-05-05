package com.gj.dao;

import com.gj.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface IAccountDao {
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    @Select("select * from account")
    public List<Account> getAllAccount();
}
