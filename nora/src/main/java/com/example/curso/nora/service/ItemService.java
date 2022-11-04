//en este servicio hago con las interfaces y estas funciones las tengo que tener en el serviceimpl.java

package com.example.curso.nora.service;

import java.util.List;

import com.example.curso.nora.controller.item.ItemDTO;

public interface ItemService {

    ItemDTO adicionarItem(ItemDTO item);
    List<ItemDTO> listarItems();
    ItemDTO consultarItem(String idItem); 
    
}

//hacer el controlador y el implementador de tarea
   