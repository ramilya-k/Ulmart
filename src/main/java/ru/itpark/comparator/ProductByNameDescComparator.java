package ru.itpark.comparator;

import ru.itpark.model.Product;

import java.util.Comparator;

public class ProductByNameDescComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
