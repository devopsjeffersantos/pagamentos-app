package br.com.fiap.pagamentos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/pagamentos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class PagamentosController {

/*
    private final ProductService productService;

    private static final Logger logger = Logger.getLogger(ProductController.class.getName());

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasAuthority('SCOPE_ADMIN')")
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAnyAuthority('SCOPE_ADMIN', 'SCOPE_USER')")
    //@PreAuthorize("hasRole('TESTE')")
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();

    }
*/

}
