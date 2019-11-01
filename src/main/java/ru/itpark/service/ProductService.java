package ru.itpark.service;

import ru.itpark.model.Product;

import java.util.*;

public class ProductService {
    private final Collection<Product> items = new LinkedList<>();

    public void add(Product item) {
        items.add(item);
    }

    public void addAll(Product... items) {
        Collections.addAll(this.items, items);
    }

    public void addAll(Collection<Product> items) {
        this.items.addAll(items);
    }

    public List<Product> searchByName(String name) {
        List<Product> listByName = new ArrayList<>();
        for (Product product : items) {
            if (product.getName().equals(name)) {
                listByName.add(product);
            }
        }
        Collections.sort(listByName);
        return listByName;
    }

    public List<Product> searchByCategory(String category) {
        List<Product> listByCategory = new ArrayList<>();
        for (Product product : items) {
            if (product.getCategory().equals(category)) {
                listByCategory.add(product);
            }
        }
        Collections.sort(listByCategory);
        return listByCategory;
    }


    public List<Product> pageList(Comparator<Product> list, int firstIndex, int lastIndex) {
        List<Product> result = new ArrayList<>(items);
        result.sort(Product::compareTo);
        return result;
    }

}

