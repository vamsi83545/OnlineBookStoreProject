package com.onlineBookStore.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineBookStore.Dto.customerDto;
import com.onlineBookStore.Model.Customer;
import com.onlineBookStore.Repository.customerRepo;

@Service
public class customerService {

	@Autowired
	private customerRepo customerRepo;

	@Autowired
	private ModelMapper modelMapper;

	public customerDto getCustomerById(long id) {

		Customer customer = customerRepo.findById(id).orElseThrow();

		return modelMapper.map(customer, customerDto.class);
	}

	public List<customerDto> getAllCustomers() {

		List<Customer> customers = customerRepo.findAll();

		return customers.stream().map(customer -> modelMapper.map(customers, customerDto.class))
				.collect(Collectors.toList());
	}

	public customerDto addCustomer(customerDto customerDto) {

		Customer customer = modelMapper.map(customerDto, Customer.class);

		Customer savedCustomer = customerRepo.save(customer);

		return modelMapper.map(savedCustomer, customerDto.class);
	}

	public List<customerDto> addCustomers(List<customerDto> customerDtos) {
		List<Customer> customers = customerDtos.stream().map(customer -> modelMapper.map(customerDtos, Customer.class))
				.collect(Collectors.toList());

		List<Customer> savedCustomer = customerRepo.saveAll(customers);

		return savedCustomer.stream().map(customer -> modelMapper.map(savedCustomer, customerDto.class))
				.collect(Collectors.toList());
	}

	public void deleteCustomer(long id) {

		customerRepo.deleteById(id);
		System.out.println("customer Deleted");
	}
	
	public customerDto updateCustomer(customerDto dto) {
		
		long customerId = dto.getId();
		
		Customer customer = customerRepo.findById(customerId).orElseThrow();
		
		Customer updatedCustomer = customerRepo.save(customer);
		
		return modelMapper.map(updatedCustomer, customerDto.class);
		
		
				
	}
}
