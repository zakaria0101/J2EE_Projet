package me.zhulin.shopapi.repository;

import me.zhulin.shopapi.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    // Some category
    List<ProductCategory> findByCategoryTypeInOrderByCategoryTypeAsc(List<Integer> categoryTypes);
    // All category
    List<ProductCategory> findAllByOrderByCategoryType();
    // One category
    ProductCategory findByCategoryType(Integer categoryType);
}
