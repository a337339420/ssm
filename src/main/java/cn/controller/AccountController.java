package cn.controller;

import cn.domian.Account;
import cn.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("testAccount")
    public String testAccount(Model model){
        List<Account> list = accountService.findAll();
       /* Account account = new Account();
        account.setId(1);
        account.setName("aa");
        account.setMoney(888.00);
        model.addAttribute("account",account );*/
        model.addAttribute("account",list.get(0));
        return "success";
    }
}
