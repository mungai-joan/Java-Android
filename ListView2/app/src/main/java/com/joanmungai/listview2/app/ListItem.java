package com.joanmungai.listview2.app;

/**
 * Created by Student on 9/9/2015.
 */
public class ListItem {
    private String month;
    private String description;

    public ListItem(String month,String description){
        this.month=month;
        this.description=description;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDescription() {
        return description;

    }

    public void setDescription(String description) {
        this.description = description;
    }
}
