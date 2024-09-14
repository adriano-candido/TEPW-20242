package br.edu.unichristus.service;

import br.edu.unichristus.data.model.User;
import br.edu.unichristus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User save(User user){
        if(user.getName().length() > 150){
            System.out.println("Limite de caracteres de nome atingido");
            return null;
        }

        var entity = repository.save(user);
        return entity;
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
