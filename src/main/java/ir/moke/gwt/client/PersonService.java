package ir.moke.gwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ir.moke.gwt.shared.Person;

import java.util.List;

@RemoteServiceRelativePath("person")
public interface PersonService extends RemoteService {

    List<Person> getPersons();

    void storePerson(Person person);
}
