//3. Para crear el implementador
//En class agrego implements y con control + . me agregar los override

package com.example.curso.nora.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.curso.nora.controller.UserDTO;
import com.example.curso.nora.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    HashMap<String, UserDTO> users = new HashMap<String, UserDTO>();

    @Override
    public UserDTO add(UserDTO user) {
        users.put(user.getDocument(), user);
        return user;
    }

    @Override
    public List<UserDTO> users() {
        List<UserDTO> listUser = new ArrayList<>();
        for(String key: users.keySet()){
            UserDTO user = users.get(key);
            listUser.add(user);
            //list.add(users.get(key)); reemplaza las lineas anteriores
            //System.out.println(key);
        }

        return listUser;
    }

    @Override
    public UserDTO getUser(String document) {
        UserDTO user = users.get(document);
        return user;
    }
    
}