package sg.edu.rp.c346.todolist;

import android.content.Context;

import java.util.ArrayList;
import java.util.Calendar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by 16020271 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ListItem> thingList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ListItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        thingList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvThing = rowView.findViewById(R.id.textViewThing);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        ListItem currentItem = thingList.get(position);
        String thing = currentItem.getThing();
        String date = currentItem.getDateString();
        tvThing.setText(thing);
        tvDate.setText(date);
        return rowView;
    }
}

