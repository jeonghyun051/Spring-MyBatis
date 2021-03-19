package com.cos.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cos.mybatisex01.model.Product;

//@Repository // 인터페이스여서 메모리에 뜨지 않는다.
@Mapper // 인터페이스를 구현한 객체를 메모리에 띄운다. product.xml이 뜬다. product.xml은 ProductRepository의 구현체이
public interface ProductRepository {

	public void save(Product product);
	public void deleteById(int id);
	public void update(Product product);
	public List<Product> findAll();
	public Product findById(int id);
}
