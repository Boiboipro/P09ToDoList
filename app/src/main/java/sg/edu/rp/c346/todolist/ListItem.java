package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16020271 on 17/7/2018.
 */

public class ListItem {

    private String thing;
    private Calendar date;

    public ListItem(String name, Calendar date) {
        this.thing = name;
        this.date = date;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String name) {
        this.thing = thing;
    }

    public Calendar getDate() {return date; }

    public void setDate(Calendar date) {this.date = date;}

    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }


    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + thing + '\'' +
                ", date='" + getDateString() +
                '}';
    }

}
