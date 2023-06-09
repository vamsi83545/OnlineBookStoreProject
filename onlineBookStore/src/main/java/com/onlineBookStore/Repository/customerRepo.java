package com.onlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineBookStore.Model.Customer;

public interface customerRepo extends JpaRepository<Customer , Long> {


}
