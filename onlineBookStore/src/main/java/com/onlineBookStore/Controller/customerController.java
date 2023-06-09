package com.onlineBookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineBookStore.Dto.customerDto;
import com.onlineBookStore.service.customerService;

@RestController
public class customerController {

	@Autowired
	private customerService customerService;
	
	@GetMapping("/cus/{id}")
	public customerDto getCustomerById(@PathVariable(value = "id") Long id) {
		return customerService.getCustomerById(id);
	}
	
	@GetMapping("/cus/all")
	
	public List<customerDto> getAllCustomers(){
		
		return customerService.getAllCustomers();
	}
	
	@PostMapping("/cus/add")
	
	public customerDto addCustomer(@RequestBody customerDto customerDto) {
		
		return customerService.addCustomer(customerDto);
	}
	
	@PostMapping("/cus/addcuss")
	
	public List<customerDto> addCustomers(@RequestBody List<customerDto> dto){
		return customerService.addCustomers(dto);
	}
	
	@PutMapping("/cus/update")
	
	public customerDto updateCustomer(@RequestBody  customerDto customerDto) {
		return customerService.updateCustomer(customerDto);
	}
	
	@DeleteMapping("/cus/del")
	public void deleteCustomer(@PathVariable long id) {
		customerService.deleteCustomer(id);
	}
}
