package com.cts.microcredential.catalogue.controller;

import com.cts.microcredential.catalogue.model.SKU;
import com.cts.microcredential.catalogue.service.CatalogueService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/catalogue")
public class CatalogueController {

    @Autowired
    private CatalogueService catalogueService;

    @GetMapping("/products/category/{categoryId}")
    public ResponseEntity<List<SKU>> getProductsByCatagory(@PathVariable(name="categoryId") String categoryId) {
        return ResponseEntity.ok().body(catalogueService.getProductsByCatagory(categoryId));
    }

    @GetMapping("/products/subcategory/{subcategoryId}")
    public ResponseEntity<List<SKU>> getProductsBySubCatagory(@PathVariable(name="subcategoryId") String subcategoryId) {
        return ResponseEntity.ok().body(catalogueService.getProductsBySubCatagory (subcategoryId));
    }

    @GetMapping("/product/{skuId}")
    public ResponseEntity<SKU> getProduct(@PathVariable(name="skuId") String skuId) {
        return ResponseEntity.ok().body(catalogueService.getProduct(skuId));
    }

}
