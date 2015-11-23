/*
 * Definitely it is the most simplest code snippet in the tutorial. But it requires the most high attention. The JpaRepository interface contains the basic operations which can be performed with any entity (CRUD operations). More information you can find on the official documentation page.
 * 
 * */

package com.spr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spr.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
