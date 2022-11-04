//2. Este se crea luego del controlador, ya que es la interfax

package com.example.curso.nora.service;

import java.util.List;

import com.example.curso.nora.controller.UserDTO;

public interface UserService {
   
    UserDTO add(UserDTO user);
    List<UserDTO> users();
    UserDTO getUser(String documentType); 

}
