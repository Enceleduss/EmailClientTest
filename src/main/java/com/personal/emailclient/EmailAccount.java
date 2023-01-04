package com.personal.emailclient;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EmailAccount {
    @Id
    @Column(updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long accountId;
    @Column
    private String title;
    @Column
    private String friendlyName;
    @Column
    private String popProvider,popServer,popUser,smtpServer;
    @Column
    private int popPort,smtpPort;
    @Column
    private boolean isSSL,smtpAuth,isTLS;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getPopProvider() {
        return popProvider;
    }

    public void setPopProvider(String popProvider) {
        this.popProvider = popProvider;
    }

    public String getPopServer() {
        return popServer;
    }

    public void setPopServer(String popServer) {
        this.popServer = popServer;
    }

    public String getPopUser() {
        return popUser;
    }

    public void setPopUser(String popUser) {
        this.popUser = popUser;
    }

    public String getSmtpServer() {
        return smtpServer;
    }

    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    public int getPopPort() {
        return popPort;
    }

    public void setPopPort(int popPort) {
        this.popPort = popPort;
    }

    public int getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
    }

    public boolean isSSL() {
        return isSSL;
    }

    public void setSSL(boolean SSL) {
        isSSL = SSL;
    }

    public boolean isSmtpAuth() {
        return smtpAuth;
    }

    public void setSmtpAuth(boolean smtpAuth) {
        this.smtpAuth = smtpAuth;
    }

    public boolean isTLS() {
        return isTLS;
    }

    public void setTLS(boolean TLS) {
        isTLS = TLS;
    }

    public EmailAccount(String title, String friendlyName) {
        this.title = title;
        this.friendlyName = friendlyName;
    }

}
