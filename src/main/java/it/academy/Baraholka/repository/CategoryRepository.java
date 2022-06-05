package it.academy.Baraholka.repository;

import it.academy.Baraholka.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
