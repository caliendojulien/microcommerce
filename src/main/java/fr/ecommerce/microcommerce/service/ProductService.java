package fr.ecommerce.microcommerce.service;

import fr.ecommerce.microcommerce.dto.ProductDto;
import fr.ecommerce.microcommerce.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public List<ProductDto> all() {
        return productRepository
                .findAll()
                .stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }

    public ProductDto one(int id) {
        return modelMapper.map(productRepository.findById(id), ProductDto.class);
    }
}
