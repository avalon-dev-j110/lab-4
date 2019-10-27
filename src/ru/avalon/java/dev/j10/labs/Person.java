package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 * Абстрактное представление о человеке.
 *
 * <p>С точки зрения модели, человек описывается именем и
 * датой рождения.
 *
 * <p>При сравнении одного человека с другим следует
 * учитывать, что больше будет тот человек, чьё имя должно
 * быть ниже в списке имён, отсортированном по возрастанию.
 * Из двух людей с одним и тем же именем больше будет тот,
 * который старше.
 */
public interface Person extends Comparable {

    /**
     * Возвращает имя человека.
     *
     * @return имя человека в виде строки
     */
    String getName();

    /**
     * Возвращает дату рождения человека.
     *
     * @return дата рождения в виде экземпляра типа
     * {@link Date}
     */
    Date getBirthDate();
    
    default int compareTo(Object o) {
        if (o instanceof Person) {
            Person that = (Person) o;
            if (getName().compareTo(that.getName()) < 0) {
                return -1;
            } else if (getName().compareTo(that.getName()) > 0) {
                return 1;
            } else if (getName().compareTo(that.getName()) == 0) {
                if (getBirthDate().compareTo(that.getBirthDate()) > 0) {
                    return -1;
                } else {
                    return 1;
                }
            }

        }
        return 1;
}
