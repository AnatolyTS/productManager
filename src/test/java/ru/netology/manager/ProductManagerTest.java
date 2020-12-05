package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    @Test
    void shouldSearchByAuthor() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(1, "Master and Margarita", 100, "M. Bulgakov")};
        Product[] actual = manager.searchBy("M. Bulgakov");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByBookName() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Book(2, "Radiance", 150, "Stephen King")};
        Product[] actual = manager.searchBy("Radiance");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmartphoneName() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(3, "GalaxyS10", 700, "Samsung")};
        Product[] actual = manager.searchBy("GalaxyS10");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchBySmartphoneManufacturer() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product[] expected = {new Smartphone(4, "Honore30i", 800, "Huawei")};
        Product[] actual = manager.searchBy("Huawei");
        assertArrayEquals(expected, actual);
    }

}