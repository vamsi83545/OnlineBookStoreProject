package com.onlineBookStore.Dto;

import java.math.BigDecimal;

public class billingDto {
	
	private orderDto orderDto;
	
	private BigDecimal price;

	public orderDto getOrderDto() {
		return orderDto;
	}

	public void setOrderDto(orderDto orderDto) {
		this.orderDto = orderDto;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public billingDto(com.onlineBookStore.Dto.orderDto orderDto, BigDecimal price) {
		super();
		this.orderDto = orderDto;
		this.price = price;
	}

	public billingDto() {
		super();
	}

	@Override
	public String toString() {
		return "billingDto [orderDto=" + orderDto + ", price=" + price + "]";
	}

	

}
