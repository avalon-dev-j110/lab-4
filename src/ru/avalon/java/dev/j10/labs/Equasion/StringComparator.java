package ru.avalon.java.dev.j10.labs.Equasion;

import java.util.Comparator;

public class StringComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        String a = (String) o1;
        String b = (String) o2;
        if ((a.compareTo(b)) > 0) {
            return 1;
        } else if ((a.compareTo(b)) < 0) {
            return -1;
        }
        return 0;

    }

}
