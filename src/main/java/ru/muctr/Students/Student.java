package ru.muctr.Students;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgenia Skichko
 */

@Data
@AllArgsConstructor
public class Student{
    String surname;
    int reiting;
    int groupNumber;
}
