package todoapp.storage.db;

import todoapp.model.Todo;

import java.util.Optional;
import java.util.UUID;

public class TodoRepositoryImpl implements TodoRepository{
    @Override
    public Optional<Todo> getTodoById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<Todo> getTodoByUserId(UUID userId) {
        return Optional.empty();
    }

    @Override
    public void setTodo(Todo todo) {

    }

    @Override
    public void updateTodoInfo(Todo todo) {

    }

    @Override
    public void disableTodo(Todo todo) {

    }
}
