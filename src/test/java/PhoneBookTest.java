import org.example.PhoneBook;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook sut;
    @BeforeEach
    public void startedEach() {
        System.out.println("test started");
        sut = new PhoneBook();
    }
    @BeforeAll
    public static void startedAll() {
        System.out.println("tests started");
    }
    @AfterEach
    public void finishedEach() {
        System.out.println("test completed");
        sut = null;
    }
    @AfterAll
    public static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testAddContact() {
        //arrange
        String expectedNumber = "+79999999999";
        int expectedEntries = 2;
        //act
        int resultEntries1 = sut.addContact("Nikolay", "+79999999999");
        int resultEntries2 = sut.addContact("Alisa", "+79998888888");
        String resultNumber = sut.contactsMap.get("Nikolay");
        //assert
        assertEquals(expectedNumber, resultNumber);
        assertEquals(expectedEntries, resultEntries2);
    }
    @Test
    public void testFindByNumber() {
        //arrange
        String expectedName = "Alisa";
        sut.addContact("Alisa", "+79998888888");
        //act
        String resultName = sut.findByNumber("+79998888888");
        //assert
        assertEquals(expectedName, resultName);
    }

}
