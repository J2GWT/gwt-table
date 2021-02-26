package ir.moke.gwt.client;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.rpc.AsyncCallback;
import ir.moke.gwt.shared.Person;

import java.util.List;

public class PersonAsyncCallBack implements AsyncCallback<List<Person>> {

    private final CellTable<Person> personTable;

    public PersonAsyncCallBack(CellTable<Person> personTable) {
        this.personTable = personTable;
    }

    @Override
    public void onFailure(Throwable caught) {

    }

    @Override
    public void onSuccess(List<Person> result) {
        personTable.setRowData(result);
    }
}
