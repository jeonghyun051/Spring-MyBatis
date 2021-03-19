package com.cos.mybatisex01.repository;

import org.apache.ibatis.annotations.Mapper;

import com.cos.mybatisex01.model.beans.PanmaeBean;

//@Repository // 인터페이스여서 메모리에 뜨지 않는다.
@Mapper // 인터페이스를 구현한 객체를 메모리에 띄운다. product.xml이 뜬다. product.xml은 ProductRepository의 구현체이
public interface PanmaeRepository {

	public PanmaeBean findByIdAndJoin(int id); // 판매 아이디를 받는다.

}
