package ir.moke.gwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ir.moke.gwt.shared.Person;

import java.util.List;


public interface PersonServiceAsync {
    void getPersons(AsyncCallback<List<Person>> personAsyncCallback);

    void storePerson(Person person, AsyncCallback<Person> personAsyncCallback);
}
