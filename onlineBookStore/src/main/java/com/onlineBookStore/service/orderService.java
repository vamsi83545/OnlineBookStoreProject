package com.onlineBookStore.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineBookStore.Dto.orderDto;
import com.onlineBookStore.Model.Book;
import com.onlineBookStore.Model.Customer;
import com.onlineBookStore.Model.Order;
import com.onlineBookStore.Repository.BookRepo;
import com.onlineBookStore.Repository.OrderRepo;
import com.onlineBookStore.Repository.customerRepo;

@Service
public class orderService {

	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private customerRepo customerRepo;
	
	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public orderDto findOrderById(long id) {
		
		Order order = orderRepo.findById(id).orElseThrow();
		return modelMapper.map(order, orderDto.class);
	}
	
	public orderDto addOrder(orderDto orderDto,long customerId, long bookId) {
		
		Customer customer = customerRepo.findById(customerId).orElseThrow();
		Book book = bookRepo.findById(bookId).orElseThrow();
		
		Order order = modelMapper.map(orderDto, Order.class);
		
		order.setCustomer(customer);
		order.setBook(book);
		
		Order saveOrder= orderRepo.save(order);
		
		return modelMapper.map(saveOrder, orderDto.class);
	}
	
	public void deleteOrder(long id) {
		Order order = orderRepo.findById(id).orElseThrow();
		orderRepo.delete(order);
		System.out.println("order deleted");
	}
	
	public List<orderDto> getAllOrders() {
		List<Order> orders = orderRepo.findAll();
		return orders.stream().map(order -> modelMapper.map(order, orderDto.class)).collect(Collectors.toList());

	}
	 
	
	
}
