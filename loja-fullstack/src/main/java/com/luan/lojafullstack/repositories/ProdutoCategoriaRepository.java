package com.luan.lojafullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luan.lojafullstack.model.ProdutoCategoria;

@RepositoryRestResource(collectionResourceRel = "produtoCategoria", path = "produto-categoria")
public interface ProdutoCategoriaRepository extends JpaRepository<ProdutoCategoria, Integer>{

}
