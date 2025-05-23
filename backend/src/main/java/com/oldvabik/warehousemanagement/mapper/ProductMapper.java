package com.oldvabik.warehousemanagement.mapper;

import com.oldvabik.warehousemanagement.dto.ProductDto;
import com.oldvabik.warehousemanagement.model.Category;
import com.oldvabik.warehousemanagement.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDto toDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setQuantity(product.getQuantity());
        productDto.setCategoryName(product.getCategory().getName());
        return productDto;
    }

    public Product toEntity(ProductDto productDto, Category category) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());
        if (productDto.getCategoryName() != null) {
            product.setCategory(category);
        }
        return product;
    }

}
