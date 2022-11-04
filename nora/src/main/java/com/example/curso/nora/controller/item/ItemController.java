package com.example.curso.nora.controller.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.curso.nora.service.ItemService;

@RestController
@RequestMapping( "/item")
public class ItemController {
    private final ItemService itemService;

    public ItemController( @Autowired ItemService item)
    {
        this.itemService = item;
    }
    @PostMapping
    public ResponseEntity<ItemDTO> adicionar_Items(@RequestBody ItemDTO item){ //addItem es el nombre del método
        return ResponseEntity.ok(itemService.adicionarItem(item)); //añadir item es como lo nombramos en el service
    }

    @GetMapping
    public ResponseEntity<List<ItemDTO>> listar_Items(){
        return ResponseEntity.ok(itemService.listarItems());
    }

    @GetMapping("/{item}")
    public ResponseEntity<ItemDTO> Consultar_ItemxId(@PathVariable String item){
        return ResponseEntity.ok(itemService.consultarItem(item));
    }
}
