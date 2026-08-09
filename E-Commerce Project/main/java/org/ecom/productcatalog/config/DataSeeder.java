// Use data seeder and command liner to insert data
package org.ecom.productcatalog.config;

import org.ecom.productcatalog.model.Category;
import org.ecom.productcatalog.Product;
import org.ecom.productcatalog.repository.CategoryRepository;
import org.ecom.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        // Clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        // Create categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(
                Arrays.asList(electronics, clothing, home)
        );

        // -------------------------
        // Create products
        // -------------------------

        // 1. Smartphone
        Product smartPhone = new Product();
        smartPhone.setName("Smart Phone");
        smartPhone.setDescription("Latest model Samsung smart phone.");
        smartPhone.setImageUrl("https://placehold.co/600x400");
        smartPhone.setPrice(15000);
        smartPhone.setCategory(electronics); 

        // 2. Laptop
        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop suitable for work and entertainment.");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(65000);
        laptop.setCategory(electronics);

        // 3. Winter Jacket
        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("Warm, lightweight winter jacket for everyday use.");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(3500);
        jacket.setCategory(clothing);

        // 4. Blender
        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("High speed blender for smoothies and more.");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(2500);
        blender.setCategory(home);

        // 5. Headphones
        Product headphones = new Product();
        headphones.setName("Wireless Headphones");
        headphones.setDescription("Wireless headphones with high quality sound and comfortable ear cushions.");
        headphones.setImageUrl("https://placehold.co/600x400");
        headphones.setPrice(2000);
        headphones.setCategory(electronics);

        // 6. Smart Watch
        Product smartWatch = new Product();
        smartWatch.setName("Smart Watch");
        smartWatch.setDescription("Smart watch with fitness tracking, notifications and heart rate monitoring.");
        smartWatch.setImageUrl("https://placehold.co/600x400");
        smartWatch.setPrice(4500);
        smartWatch.setCategory(electronics);

        // 7. Tablet
        Product tablet = new Product();
        tablet.setName("Tablet");
        tablet.setDescription("Portable tablet with a high resolution display for entertainment and productivity.");
        tablet.setImageUrl("https://placehold.co/600x400");
        tablet.setPrice(25000);
        tablet.setCategory(electronics);

        // 8. T-Shirt
        Product tshirt = new Product();
        tshirt.setName("Cotton T-Shirt");
        tshirt.setDescription("Soft and comfortable cotton T-shirt suitable for everyday wear.");
        tshirt.setImageUrl("https://placehold.co/600x400");
        tshirt.setPrice(999);
        tshirt.setCategory(clothing);

        // 9. Sneakers
        Product sneakers = new Product();
        sneakers.setName("Running Sneakers");
        sneakers.setDescription("Lightweight running sneakers designed for comfort and daily exercise.");
        sneakers.setImageUrl("https://placehold.co/600x400");
        sneakers.setPrice(2999);
        sneakers.setCategory(clothing);

        // 10. Coffee Maker
        Product coffeeMaker = new Product();
        coffeeMaker.setName("Coffee Maker");
        coffeeMaker.setDescription("Easy to use coffee maker for preparing fresh coffee at home.");
        coffeeMaker.setImageUrl("https://placehold.co/600x400");
        coffeeMaker.setPrice(3500);
        coffeeMaker.setCategory(home);

        // Save all products
        productRepository.saveAll(
                Arrays.asList(
                        smartPhone,
                        laptop,
                        jacket,
                        blender,
                        headphones,
                        smartWatch,
                        tablet,
                        tshirt,
                        sneakers,
                        coffeeMaker
                )
        );
    }
}