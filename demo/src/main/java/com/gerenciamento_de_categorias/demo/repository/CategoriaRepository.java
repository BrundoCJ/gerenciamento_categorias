package com.gerenciamento_de_categorias.demo.repository;

import com.gerenciamento_de_categorias.demo.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}