package org.techspark;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping
    public List<String> getProducts() {
        return List.of("Laptop", "Monitor", "Keyboard");
    }

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody String product) {
        return ResponseEntity.ok("Product added: " + product);
    }
}
