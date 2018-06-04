package se.thinkcode;

import java.util.HashMap;
import java.util.Map;

class TheCourt {
    private Map<String, Integer> accounts = new HashMap<>();

    void swipe(String guest, Integer currentTab) {
        if (currentTab < 0) {
            currentTab = 0;
        }

        Integer balance = accounts.get(guest);
        if (balance == null) {
            balance = currentTab;
        }

        accounts.put(guest, balance);
    }

    Integer getBalance(String guest) {
        return accounts.get(guest);
    }
}
