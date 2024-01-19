import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, Long> recoreds;

    PhoneBook() {
        recoreds = new HashMap<>();
    }

    public void fillPhoneBook() {
        recoreds.put("Ivan", 87775552211l);
        recoreds.put("Masha", 87015551212l);
    }

    public void printPhoneBook() {
        System.out.println(recoreds);
    }
}