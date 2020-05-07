package com.gj.dao;

import com.gj.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface IAccountDao {
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);

    @Select("select * from account")
    List<Account> getAllAccount() throws Exception;

    @Delete("delete from account where id=#{id}")
    void deleteAccount(int id);
}
