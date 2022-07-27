package todoapp.storage.db;

import todoapp.model.User;

import java.util.Optional;
import java.util.UUID;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public Optional<User> getUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserByUsernameAndPassword(String username, String password) {
        return Optional.empty();
    }

    @Override
    public void setUser(User user) {

    }

    @Override
    public void updateUserInfo(User user) {

    }

    @Override
    public void disableUser(User user) {

    }
}
