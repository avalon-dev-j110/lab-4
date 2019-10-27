package ru.avalon.java.dev.j10.labs;

import java.sql.Date;
import java.util.Comparator;
import ru.avalon.java.dev.j10.labs.Equasion.*;
import ru.avalon.java.dev.j10.labs.Object.*;
import ru.avalon.java.dev.j10.labs.Sorters.*;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {
                "main", "line", "system",
                "fear", "class", "rage",
                "road", "lift", "black",
                "beard", "clasp", "style",
                "read", "map", "print",
                "dizzy", "trumpet", "note",
                "zero", "manage"};

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = {
                new Human("Abram", Date.valueOf("1970-01-01")),
                new Human("Bill", Date.valueOf("1970-01-02")),
                new Human("Carl", Date.valueOf("1970-01-03")),
                new Human("Daniel", Date.valueOf("1970-01-04")),
                new Human("Emil", Date.valueOf("1970-01-05")),
                new Human("Filip", Date.valueOf("1970-01-06")),
                new Human("Gill", Date.valueOf("1970-01-07")),
                new Human("Henry", Date.valueOf("1970-01-08")),
                new Human("Ivan", Date.valueOf("1970-01-09")),
                new Human("James", Date.valueOf("1970-01-10")),
                new Human("Ken", Date.valueOf("1970-01-11")),
                new Human("Leopold", Date.valueOf("1970-01-12")),
                new Human("Mike", Date.valueOf("1970-01-13")),
                new Human("Nike", Date.valueOf("1970-01-14")),
                new Human("Oleg", Date.valueOf("1970-01-15")),
                new Human("Peter", Date.valueOf("1970-01-16")),
                new Human("Quentin", Date.valueOf("1970-01-17")),
                new Human("Ron", Date.valueOf("1970-01-18")),
                new Human("Shon", Date.valueOf("1970-01-19")),
                new Human("Tom", Date.valueOf("1970-01-20")),
            };
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new BubbleSort();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new StringComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
    }
}
