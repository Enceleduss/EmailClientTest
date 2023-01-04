package com.personal.emailclient;

import com.personal.emailclient.repository.EmailClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmailClientService {
    @Autowired
    private EmailClientRepository repoObj;

    public EmailClientService() {

    }

    public List<EmailAccount> getAllEmailAccounts() {
        Iterator<EmailAccount> itr = repoObj.findAll().iterator();
        List<EmailAccount> l = new ArrayList<EmailAccount>();
        while(itr.hasNext())
        {
            l.add(itr.next());
        }
        return l;
    }
    public void createEmailAccount(EmailAccount emailAccount){
        repoObj.save(emailAccount);
    }

    public EmailAccount getEmailAccountById(Long id){
        return repoObj.findById(id).get();
    }
    public void updateEmailAccount(EmailAccount emailAccount){
        repoObj.save(emailAccount);
    }
    public void deleteEmailAccount(Long id){
        repoObj.deleteById(id);
    }
}
