package dio.diospringsecurityjwt.service;

import dio.diospringsecurityjwt.model.User;
import dio.diospringsecurityjwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;
    public void createUser(User user){
        String pass = user.getPassword();
        // Criptografando senha antes de enviar para o banco
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }
}
