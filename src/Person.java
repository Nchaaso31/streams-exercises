import java.util.List;

public class Person {
    private String name;
    private String surname;
    private List<String> emails;

    public Person(String name, String surname, List<String> emails) {
        this.name = name;
        this.surname = surname;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}