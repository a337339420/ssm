package cn.service;

import cn.dao.AccountDao;
import cn.domian.Account;

import java.util.List;

public interface AccountService  {
    public List<Account> findAll();

    public void saveAccount(Account account);
}
