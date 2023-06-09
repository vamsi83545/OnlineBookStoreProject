package com.onlineBookStore.service;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineBookStore.Dto.billingDto;
import com.onlineBookStore.Model.Bill;
import com.onlineBookStore.Model.Order;
import com.onlineBookStore.Repository.OrderRepo;
import com.onlineBookStore.Repository.billingRepo;

@Service
public class billingService {

	@Autowired
	private billingRepo billingRepo;
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private BigDecimal calculateTotalAmount(Order order) {
      
        BigDecimal totalAmount =order.getBook().getPrice();
        
        return totalAmount;
        
      
    }
	
	public billingDto generateBill(long orderId) {
		
		Order order = orderRepo.findById(orderId).orElseThrow();
		
		Bill bill =new Bill();
		bill.setOrder(order);
		bill.setPrice(calculateTotalAmount(order));
		
		
		return modelMapper.map(bill, billingDto.class);
		
		
	}
}
