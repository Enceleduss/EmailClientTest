package com.personal.emailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailClientController {
    @Autowired
    private EmailClientService ser;
    @RequestMapping("/")
    private List<EmailAccount> getAllEmailAccounts(){
        return ser.getAllEmailAccounts();
    }


}
