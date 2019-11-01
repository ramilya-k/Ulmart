package ru.itpark;

import ru.itpark.model.Product;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

            ProductService service = new ProductService();
            service.addAll(
                    new Product(1, 4, "Микроволновая печь Polaris", "Бытовая техника ", 4_000, true),
                    new Product(2, 5, "Мультиварка Tefal", "Бытовая техника ", 7_720, true),
                    new Product(3, 2, "Чайник Kitford", "Бытовая техника ", 2_900, false),
                    new Product(4, 3, "Наушники беспроводные", "Аксессуары для телефонов ", 6_000, false),
                    new Product(5, 5, "Карта памяти Samsung", "Аксессуары для телефонов ", 1_990, true),
                    new Product(6, 2, "Фен", "Красота и здоровье ", 3_000, true),
                    new Product(7, 4, "Плойка", "Красота и здоровье ", 2_900, true),
                    new Product(8, 3, "Электрическая зубная щетка Oral-B", "Красота и здоровье ", 4_060, true));

            List<Product> results1 = service.searchByName("Фен");
            System.out.println(results1);
            List<Product> results2 = service.searchByCategory("Красота и здоровье ");
            System.out.println(results2);

            System.out.println(service.pageList(Product::compareTo, 0, 2));


        }
    }

