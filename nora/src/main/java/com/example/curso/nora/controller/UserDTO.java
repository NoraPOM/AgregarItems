//1. Esto es lo 1ro a creas, este es el controlador
package com.example.curso.nora.controller;

public class UserDTO {
    private String name;
    private String lastname;
    private String document;
    private String documentType;
    private String email;
    private String password;  

//este es el constructor

    public UserDTO(String name, String lastname, String document, String documentType, String email, String password) { 
        this.name =name;
        this.lastname = lastname;
        this.document = document;
        this.documentType = documentType;
        this.email = email;
        this.password = password;
    }

    //me paro en UserDTO y control + . y uso opcion generarar Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

