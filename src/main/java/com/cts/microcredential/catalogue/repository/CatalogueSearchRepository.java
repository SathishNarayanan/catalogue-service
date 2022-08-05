package com.cts.microcredential.catalogue.repository;

import com.cts.microcredential.catalogue.model.SKU;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogueSearchRepository extends CrudRepository<SKU, String> {

    public SKU findBySku(String id);

    public List<SKU> findByCategoryId(String categoryId);

    public List<SKU> findBySubCategoryId(String subCatgId);
}
