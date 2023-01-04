package com.personal.emailclient.repository;

import com.personal.emailclient.EmailAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailClientRepository extends CrudRepository<EmailAccount, Long>{

}
