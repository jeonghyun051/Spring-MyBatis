package com.cos.mybatisex01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

	private int id;
	private String name; // 상품명
	private String code; // 상품코드
} 
