package com.onlineBookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineBookStore.Dto.orderDto;
import com.onlineBookStore.service.orderService;

@RestController
public class orderController {

	@Autowired
	private orderService orderService;

	@GetMapping("/order/{id}")

	public orderDto getOrder(@PathVariable(value = "id") long id) {

		return orderService.findOrderById(id);
	}

	@PostMapping("/order/save/{customerId}/{bookId}")
	public orderDto saveOrder(@RequestBody orderDto orderDto, @PathVariable(value = "customerId") long customerId,
			@PathVariable(value = "bookId") long bookId) {
		return orderService.addOrder(orderDto, customerId, bookId);
	}

	@GetMapping("/order/all")
	public List<orderDto> getOrder() {

		return orderService.getAllOrders();
	}
	
	@DeleteMapping("/order/delete/{id}")
	public void deleteOrderbyId(long id) {
		orderService.deleteOrder(id);
	}
	
}
