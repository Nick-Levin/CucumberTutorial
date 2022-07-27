package todoapp.storage.db;

import todoapp.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    Optional<User> getUserById(UUID id);
    Optional<User> getUserByEmail(String email);
    Optional<User> getUserByUsername(String username);
    Optional<User> getUserByUsernameAndPassword(String username, String password);

    void setUser(User user);
    void updateUserInfo(User user);
    void disableUser(User user);

}
