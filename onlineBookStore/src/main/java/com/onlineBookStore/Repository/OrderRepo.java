package com.onlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineBookStore.Model.Order;

public interface OrderRepo  extends JpaRepository<Order, Long>{

}
