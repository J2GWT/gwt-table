package ir.moke.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ir.moke.gwt.client.PersonService;
import ir.moke.gwt.shared.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl extends RemoteServiceServlet implements PersonService {

    private static final List<Person> personList = new ArrayList<>();

    public PersonServiceImpl() {
        Person p1 = new Person(1, "Sina", "Mohammadi", 12);
        Person p2 = new Person(2, "Ali", "Ghanbari", 32);
        Person p3 = new Person(3, "Hassan", "Hosseini", 18);
        Person p4 = new Person(4, "Javad", "Ezatti", 45);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
    }

    @Override
    public List<Person> getPersons() {
        return personList;
    }

    @Override
    public void storePerson(Person person) {
        int index = personList.size();
        person.setId(index + 1);
        personList.add(person);
    }
}
