package com.example.curso.nora.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.curso.nora.controller.item.ItemDTO;
import com.example.curso.nora.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
   
    HashMap<String, ItemDTO> items = new HashMap<String, ItemDTO>();

    //agregar item
    @Override
    public ItemDTO adicionarItem(ItemDTO item) {
        items.put(item.getIdItem(), item);
        return item;
    }

    //consultar lista de items
    @Override
    public List<ItemDTO> listarItems() {
        List<ItemDTO> listItem = new ArrayList<>();
        for(String key: items.keySet()){
            ItemDTO item = items.get(key);
            listItem.add(item);
            //list.add(users.get(key)); reemplaza las lineas anteriores
            //System.out.println(key);
        }
        return listItem;
    }

    //para consulta item x id
    @Override
    public ItemDTO consultarItem(String idItem) {
        ItemDTO item = items.get(idItem);
        return item;
    }

}
