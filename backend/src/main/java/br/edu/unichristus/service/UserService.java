package br.edu.unichristus.service;

import br.edu.unichristus.data.dto.UserDTO;
import br.edu.unichristus.data.model.User;
import br.edu.unichristus.dozer.DozerConverter;
import br.edu.unichristus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO save(UserDTO user){
        if(user.getName().length() > 150){
            System.out.println("Limite de caracteres de nome atingido");
            return null;
        }
        //Converte UserDTO em User
        var entity = DozerConverter.parseObject(user, User.class);

        //Recebe retorno do save (User)
        var entityDTO = repository.save(entity);

        //Converte e retorna o User em UserDTO
        return DozerConverter.parseObject(entityDTO, UserDTO.class);
    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
