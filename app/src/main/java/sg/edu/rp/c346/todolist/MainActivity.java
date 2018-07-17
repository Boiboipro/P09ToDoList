package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ListItem> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);

        alToDoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();

        date1.set(2018,7,1);





        ListItem item1 = new ListItem("MSA", date1);
        ListItem item2 = new ListItem("Get haircut", date1);
        alToDoList.add(item1);
        alToDoList.add(item2);

        caToDo = new CustomAdapter(this, R.layout.list_item, alToDoList);

        lvToDo.setAdapter(caToDo);

    }
}
