package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	/*
	 * WAITING_PAYMENT, 0
	 * PAID, 			1 
	 * SHIPPED, 		2 
	 * DELIVERED, 		3 
	 * CANCELED; 		4
	 *  
	 * bad option for code maintainability
	 */

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order Status code");
	}

}
