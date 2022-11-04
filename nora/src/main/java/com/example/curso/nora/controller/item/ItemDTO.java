//1 crear el DTO, aca creo vbles y sus getter and setter y el constructor
//2. luego creo la interfaz del service en otro archivo
//3. finalmemte la implementación.

package com.example.curso.nora.controller.item;

import com.example.curso.nora.controller.UserDTO;

public class ItemDTO {

    private String idItem;
    private String descripcion;
    private UserDTO usuario;
    private String prioridad;

    //este es el constructor

    public ItemDTO(String idItem, String descripcion, UserDTO usuario, String prioridad) { 
        this.idItem = idItem; 
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.prioridad = prioridad;
    }

    //esto se trae con getter and setter en la palabra ItemDTO
    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public UserDTO getUsuario() {
        return usuario;
    }
    public void setUsuario(UserDTO usuario) {
        this.usuario = usuario;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

}


