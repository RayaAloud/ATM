package com.atm.atmapp.atm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ATMService {
    
    private List <ATM> accountsList = new ArrayList <>(
        Arrays.asList(
            new ATM("1", "Raya", "0011", 500),
            new ATM("2", "Joud", "0012", 5000),
            new ATM("3", "Halah", "0013", 50000)
        )
    ); 

    public List <ATM> getAccounts() {
        return accountsList;
    }

    public void addAccount(ATM account) {
        accountsList.add(account);
    }

    public void transferMoney(String fromId, String toId, int amount) {
        for (int i = 0; i < accountsList.size(); i++) {
            ATM account = accountsList.get(i);
            if (account.getId().equals(fromId)) {
                account.setBalance(account.getBalance() - amount);
            }
            if (account.getId().equals(toId)) {
                account.setBalance(account.getBalance() + amount);
            }
        }
    }

    public void withdrawMoney(String id, int amount) {
         for (int i = 0; i < accountsList.size(); i++) {
            ATM account = accountsList.get(i);
            if (account.getId().equals(id)) {
                account.setBalance(account.getBalance() - amount);
            }
        }
    }

    public void depositMoney(String id, int amount) {
        for (int i = 0; i < accountsList.size(); i++) {
            ATM account = accountsList.get(i);
            if (account.getId().equals(id)) {
                account.setBalance(account.getBalance() + amount);
            }
        }
    }
}
