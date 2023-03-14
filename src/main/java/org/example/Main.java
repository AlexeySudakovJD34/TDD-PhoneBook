package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.addContact("Alisa", "+79998888888");
        myPhoneBook.addContact("Nikolay", "+79999999999");
        myPhoneBook.addContact("Babushka", "+79991111111");

        myPhoneBook.printAllNames();
    }
}