package se.lexicon.leo.data;


import se.lexicon.leo.model.Person;
import se.lexicon.leo.model.Todo;

import java.time.LocalDate;
import java.util.Collection;

public interface TodoItems {

    Todo create(int TODOID, String title, String description, LocalDate deadline, boolean done, Person assignee);

    Collection<Todo> findAll();

    Todo findById(int todoId);

    Collection<Todo> findByDoneStatus(boolean doneStatus);

    Collection<Todo> findByAssignee(int personId);

    Collection<Todo> findByAssignee(Person assignee);

    Collection<Todo> findUnassignedTodoItems();

    Todo update(Todo todoToUpdate);

    boolean deleteById(int todoId);

}
