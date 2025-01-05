package com.example.homework_2.__shoppingbasket.controller;

import com.example.homework_2.__shoppingbasket.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService service;

    public BasketController(BasketService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public String addProduct(@RequestParam String id) {
        return service.add(id);
    }

    @GetMapping("/get")
    public Collection<Integer> getAll() {
        return service.get();
    }
}

