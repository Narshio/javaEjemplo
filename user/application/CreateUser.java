public class CreateUser {
    UserRepository repository;

    CreateUser(UserRepository repository){
        this.repository = repository;
    }

    void run (String name, String email) {
        repository.create(new User(name, email));
    }
}

new CreateUser(new UserMySQLREpository()).run('', '')
