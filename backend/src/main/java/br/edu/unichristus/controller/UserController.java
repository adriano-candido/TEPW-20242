package br.edu.unichristus.controller;

import br.edu.unichristus.data.dto.UserDTO;
import br.edu.unichristus.data.dto.UserLowDTO;
import br.edu.unichristus.data.model.User;
import br.edu.unichristus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public UserDTO create(@RequestBody UserDTO user){
        return service.save(user);
    }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO user){
        return service.save(user);
    }

    @GetMapping("/all")
    public List<UserLowDTO> findAll(){
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }


}
