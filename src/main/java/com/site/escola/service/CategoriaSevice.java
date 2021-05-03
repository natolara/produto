package com.site.escola.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.escola.domain.Categoria;
import com.site.escola.repositories.CategoriaRepository;

@Service
public class CategoriaSevice {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow();
		}

}
