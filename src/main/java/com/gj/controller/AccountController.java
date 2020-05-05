package com.gj.controller;

import com.gj.domain.Account;
import com.gj.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> list = accountService.getAllAccount();
        model.addAttribute("users",list);
        return "list";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }

    @RequestMapping("/deleteAccount")
    public void saveAccount(int id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.deleteAccount(id);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
