package todoapp.storage.db;

import todoapp.model.Todo;

import java.util.Optional;
import java.util.UUID;

public interface TodoRepository {

    Optional<Todo> getTodoById(UUID id);
    Optional<Todo> getTodoByUserId(UUID userId);

    void setTodo(Todo todo);
    void updateTodoInfo(Todo todo);
    void disableTodo(Todo todo);

}
