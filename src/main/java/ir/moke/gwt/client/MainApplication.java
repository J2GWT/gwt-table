package ir.moke.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.RootPanel;
import ir.moke.gwt.shared.Person;

public class MainApplication implements EntryPoint {

    private static final PersonServiceAsync personServiceAsync = GWT.create(PersonService.class);

    @Override
    public void onModuleLoad() {
        CellTable<Person> personTable = getPersonTable();
        PersonAsyncCallBack personAsyncCallBack = new PersonAsyncCallBack(personTable);
        personServiceAsync.getPersons(personAsyncCallBack);
        RootPanel.get().add(personTable);
    }

    private CellTable<Person> getPersonTable() {
        CellTable<Person> cellTable = new CellTable<>();

        TextColumn<Person> id = new TextColumn<Person>() {
            @Override
            public String getValue(Person person) {
                return String.valueOf(person.getId());
            }
        };

        TextColumn<Person> name = new TextColumn<Person>() {
            @Override
            public String getValue(Person person) {
                return person.getName();
            }
        };

        TextColumn<Person> family = new TextColumn<Person>() {
            @Override
            public String getValue(Person person) {
                return person.getFamily();
            }
        };

        TextColumn<Person> age = new TextColumn<Person>() {
            @Override
            public String getValue(Person person) {
                return String.valueOf(person.getAge());
            }
        };

        cellTable.addColumn(id, "ID");
        cellTable.addColumn(name, "NAME");
        cellTable.addColumn(family, "FAMILY");
        cellTable.addColumn(age, "AGE");
        return cellTable;
    }
}
