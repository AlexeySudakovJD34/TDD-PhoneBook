package org.example;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    public Map<String, String> contactsMap = new TreeMap<>();

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
    public void printAllNames() {
        System.out.println("Phonebook contains following names:");
        for (String key : contactsMap.keySet()) {
            System.out.println(key);
        }
    }
}
