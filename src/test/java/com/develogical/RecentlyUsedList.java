package com.develogical;

import java.util.ArrayList;

/**
 * Created by ape04 on 19/01/2016.
 */
public class RecentlyUsedList {

    private ArrayList<String> list = new ArrayList<String>();
    private int currentIndex = 0

    public int count() {
        return list.size();
    }

    public void add(String element) {
        if (contains(element) == false) {
            list.add(0, element);
        }
    }

    public Boolean contains(String element) {
        return list.contains(element);
    }

    public String read(int index) {
        return list.get(index);
    }

    public boolean hasMoreElements() {

    }
}
