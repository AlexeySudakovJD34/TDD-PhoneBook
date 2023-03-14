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
        String name = "No Records Found";
        for (String key : contactsMap.keySet()) {
            if (contactsMap.get(key).equals(number)) name = key;
        }
        return name;
    }
    public String findByName(String name) {
        return null;
    }

}
