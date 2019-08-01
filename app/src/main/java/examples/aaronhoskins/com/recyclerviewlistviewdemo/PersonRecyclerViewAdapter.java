package examples.aaronhoskins.com.recyclerviewlistviewdemo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonRecyclerViewAdapter extends RecyclerView.Adapter<PersonRecyclerViewAdapter.ViewHolder> {
    ArrayList<Person> personArrayList;

    public PersonRecyclerViewAdapter(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person currentPerson = personArrayList.get(position);
        holder.setPersonDataForItem(currentPerson);
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvFirstName;
        TextView tvLastName;
        TextView tvAddress;
        TextView tvCity;
        TextView tvState;
        TextView tvZip;
        Person thisItemsPerson;
        public ViewHolder(View itemView) {
            super(itemView);
            tvFirstName = itemView.findViewById(R.id.tvFirstName);
            tvLastName = itemView.findViewById(R.id.tvLastName);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            tvCity = itemView.findViewById(R.id.tvCity);
            tvState = itemView.findViewById(R.id.tvState);
            tvZip = itemView.findViewById(R.id.tvZip);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), DetailsActivity.class);
                    intent.putExtra("person", thisItemsPerson);
                    view.getContext().startActivity(intent);
                }
            });
        }

        public void setPersonDataForItem(Person person) {
            tvFirstName.setText(person.getFirstName());
            tvLastName.setText(person.getLastName());
            tvAddress.setText(person.getStreetAddress());
            tvCity.setText(person.getCity());
            tvState.setText(person.getState());
            tvZip.setText(person.getZip());
            thisItemsPerson = person;
        }
    }
}
