package com.example.homework_2.__shoppingbasket.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Component
@SessionScope
public class Basket {
    private List<Integer> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public void add(int idProduct) {
        this.basket.add(idProduct);
    }

    public List<Integer> getBasket() {
        return Collections.unmodifiableList(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket1 = (Basket) o;
        return Objects.equals(basket, basket1.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(basket);
    }

    @Override
    public String toString() {
        return '{' + "корзина покупок =" + basket +
                '}';
    }
}
