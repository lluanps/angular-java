package com.luan.lojafullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luan.lojafullstack.model.Produto;

@RepositoryRestResource(collectionResourceRel = "produto", path = "produtos")
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
