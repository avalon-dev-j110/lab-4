package ru.avalon.java.dev.j10.labs.Object;

import java.util.Date;
import ru.avalon.java.dev.j10.labs.Person;

/**
 *
 * @author hp
 */
public class Human implements Person {

    private String name;
    private Date bD;

    public Human(String name, Date bD) {
        this.name = name;
        this.bD = bD;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return bD;
    }

}