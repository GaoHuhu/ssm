package com.gj.controller;

import com.gj.domain.Account;
import com.gj.exception.SysException;
import com.gj.service.IAccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    private static Logger logger = Logger.getLogger(AccountController.class);

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) throws SysException {
        try {
            List<Account> list = accountService.getAllAccount();
            model.addAttribute("users", list);
            return "list";
        } catch (Exception e) {
            logger.error("find all error", e);
            throw new SysException("查询异常");
        }
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws SysException {
        try {
            accountService.saveAccount(account);
            response.sendRedirect(request.getContextPath() + "/account/findAll");
        } catch (Exception e) {
            logger.error("saveAccount error", e);
            throw new SysException("保存异常");
        }
    }

    @RequestMapping("/deleteAccount")
    public void deleteAccount(int id, HttpServletRequest request, HttpServletResponse response) throws SysException {
        try {
            accountService.deleteAccount(id);
            response.sendRedirect(request.getContextPath() + "/account/findAll");
        } catch (Exception e) {
            logger.error("deleteAccount error", e);
            throw new SysException("删除异常");
        }
    }
}
