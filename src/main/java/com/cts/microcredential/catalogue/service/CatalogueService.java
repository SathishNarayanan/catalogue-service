package com.cts.microcredential.catalogue.service;

import com.cts.microcredential.catalogue.model.SKU;
import com.cts.microcredential.catalogue.repository.CatalogueSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CatalogueService {

    @Autowired
    private CatalogueSearchRepository searchRepo;

    public List<SKU> getProductsByCatagory(String categoryId) {
        return searchRepo.findByCategoryId(categoryId);
    }

    public List<SKU> getProductsBySubCatagory(String subCategoryId) {
        return searchRepo.findBySubCategoryId(subCategoryId);
    }

    public SKU getProduct(String skuId) {
        return searchRepo.findBySku(skuId);
    }
}
