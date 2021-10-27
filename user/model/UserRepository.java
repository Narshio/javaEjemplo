public interface UserRepository {
    User create(User user);
    User[] readAll();
}
