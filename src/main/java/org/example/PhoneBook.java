package org.example;
import java.util.HashMap;
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
        return null;
    }
}
