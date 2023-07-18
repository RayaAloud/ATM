package com.atm.atmapp.atm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ATMController {
    
    @Autowired
    private ATMService atmService;


    @RequestMapping ("/accounts")
    public List <ATM> allAccounts() {
        return atmService.getAccounts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/accounts")
    public void addAccount(@RequestBody ATM account) {
        atmService.addAccount(account);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/accounts/{fromId}/transfer/{toId}/{amount}")
    public void transferMoney (@PathVariable String fromId, @PathVariable String toId, @PathVariable int amount) {
        atmService.transferMoney(fromId, toId, amount);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/accounts/{id}/withdraw/{amount}")
    public void withdrawMoney(@PathVariable String id, @PathVariable int amount) {
        atmService.withdrawMoney(id, amount);
    }

    @RequestMapping (method = RequestMethod.PUT, value = "/accounts/{id}/deposit/{amount}")
    public void depositMoney(@PathVariable String id, @PathVariable int amount) {
        atmService.depositMoney(id, amount);
    }

}
