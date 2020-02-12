package logic;

import java.util.ArrayList;
import java.util.Collection;

public class Account {
    ArrayList<Account> accounts;
    String name;
    String username;
    private String password;
    private int ID;
    int money;
    int zombiesKilled;
    Collection collection;

    void sortAccounts(){
   //     accounts.sort();
    }
    boolean hasAccount(String name){
 //       accounts.
        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
