package examples.aaronhoskins.com.recyclerviewlistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView tvFirstName;
    TextView tvLastName;
    TextView tvAddress;
    TextView tvCity;
    TextView tvState;
    TextView tvZip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        //Get calling intent
        Intent passedIntent = getIntent();
        //Get passed person from intent
        Person person = passedIntent.getParcelableExtra("person");
        //Bind Views
        tvFirstName = findViewById(R.id.tvFirstName);
        tvLastName = findViewById(R.id.tvLastName);
        tvAddress = findViewById(R.id.tvAddress);
        tvCity = findViewById(R.id.tvCity);
        tvState = findViewById(R.id.tvState);
        tvZip = findViewById(R.id.tvZip);
        //Populate views
        tvFirstName.setText(person.getFirstName());
        tvLastName.setText(person.getLastName());
        tvAddress.setText(person.getStreetAddress());
        tvCity.setText(person.getCity());
        tvState.setText(person.getState());
        tvZip.setText(person.getZip());

    }
}
