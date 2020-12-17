package com.ziriusassignment.product.dto.mapper;

import com.ziriusassignment.product.dto.ProductDto;
import com.ziriusassignment.product.dto.ReviewGroupDto;
import com.ziriusassignment.product.dto.request.ProductRequest;
import com.ziriusassignment.product.model.Product;

public class ProductMapper {
  
  public static ProductDto toProductDto(Product product, ReviewGroupDto ratings) {
    return new ProductDto().setId(product.getId())
    .setName(product.getName())
    .setOrignalPrice(product.getOrignalPrice())
    .setType(product.getType())
    .setWarranty(product.getWarranty())
    .setReview(ratings)
    .setPrice(product.getPrice())
    .setCurrency(product.getCurrency())
    .setDescription(product.getDescription());
  }
  
  public static Product toProduct(ProductRequest productRequest) {
    Product product = new Product();
    product.setName(productRequest.getName());
    product.setOrignalPrice(productRequest.getOrignalPrice());
    product.setType(productRequest.getType());
    product.setWarranty(productRequest.getWarranty());
    product.setPrice(productRequest.getPrice());
    product.setCurrency(productRequest.getCurrency());
    product.setDescription(productRequest.getDescription());
    return product;
  }

}
