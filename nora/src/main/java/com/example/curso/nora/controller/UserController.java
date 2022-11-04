package com.example.curso.nora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.curso.nora.service.UserService;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping( "/user")
public class UserController {
    private final UserService userService;

    public UserController( @Autowired UserService userService )
    {
        this.userService =userService;
    }
    @PostMapping
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO user){ //addUser es el nombre del método
        return ResponseEntity.ok(userService.add(user));
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> usuarios(){
        return ResponseEntity.ok(userService.users());
    }

    @GetMapping("/{document}")
    public ResponseEntity<UserDTO> getUserByDocument(@PathVariable String document){
        return ResponseEntity.ok(userService.getUser(document));
    }
}



