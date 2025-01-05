package com.example.homework_2.__shoppingbasket.service;

import com.example.homework_2.__shoppingbasket.model.Basket;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BasketServiceImp implements BasketService {

    private final Basket shoppingBasket;

    public BasketServiceImp(Basket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public String add(String id) {
        List<Integer> idProducts = Arrays.stream(id.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (Integer element : idProducts) {
            shoppingBasket.add(element);
        }
        return "Товар успешно добавлен в корзину";
    }

    public List<Integer> get() {
        return shoppingBasket.getBasket();
    }
}
