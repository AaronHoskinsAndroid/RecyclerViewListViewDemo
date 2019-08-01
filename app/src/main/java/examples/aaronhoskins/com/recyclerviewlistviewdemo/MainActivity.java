package examples.aaronhoskins.com.recyclerviewlistviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Person> personArrayList = new ArrayList<>();
    RecyclerView rvPersonList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPersonList();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        PersonRecyclerViewAdapter personRecyclerViewAdapter = new PersonRecyclerViewAdapter(personArrayList);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
        rvPersonList = findViewById(R.id.rvPersonList);
        rvPersonList.setLayoutManager(layoutManager);
        rvPersonList.setAdapter(personRecyclerViewAdapter);
        rvPersonList.addItemDecoration(dividerItemDecoration);
    }


    private void initPersonList() {
        personArrayList.add(new Person("FirstName", "LastName", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("Aaron", "Hoskins", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("James", "Kirk", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("Luke", "Skywalker", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("Homeless", "Dude", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("The", "Dude", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("Agent", "Smith", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("Neo", "ChoosenOne", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("NO", "NAME", "123 Street Rd", "Atlanta", "GA", "12345"));
        personArrayList.add(new Person("William", "Hoskins", "123 Street Rd", "Atlanta", "GA", "12345"));

    }
}
