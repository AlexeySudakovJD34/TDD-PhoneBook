package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    public Map<String, String> contactsMap = new HashMap<>();

    public int addContact(String name, String number) {
        if (!contactsMap.containsKey(name)) {
            contactsMap.put(name, number);
        }
        return contactsMap.size();
    }
    public String findByNumber(String number) {
        for (String key : contactsMap.keySet()) {
            if (contactsMap.get(key).equals(number)) return key;
        }
        return "No Records Found";
    }
    public String findByName(String name) {
        if (contactsMap.containsKey(name)) return contactsMap.get(name);
        else return "No Records Found";
    }

}
