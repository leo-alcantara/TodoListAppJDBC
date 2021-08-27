package se.lexicon.leo.model;

import java.time.LocalDate;
import java.util.Objects;

public class Todo {

    private int todoId;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private Person assignee;


    public Todo(int todoId, String title, String description, LocalDate deadline, boolean done, Person assignee) {
        this.todoId = todoId;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.done = done;
        this.assignee = assignee;
    }

    public Todo(String title, String description, LocalDate deadline, boolean done, Person assignee) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.done = done;
        this.assignee = assignee;
    }

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "TODOID=" + todoId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                ", assignee=" + assignee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return getTodoId() == todo.getTodoId() && isDone() == todo.isDone() && getTitle().equals(todo.getTitle()) && Objects.equals(getDescription(), todo.getDescription()) && Objects.equals(getDeadline(), todo.getDeadline()) && Objects.equals(getAssignee(), todo.getAssignee());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTodoId(), getTitle(), getDescription(), getDeadline(), isDone(), getAssignee());
    }
}

