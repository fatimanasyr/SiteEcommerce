package model;

import java.sql.Date;

public class Order {
	
	private int id;
	private Date DateOrder;
	private OrderItem orderItem;

	public Order(int id, Date dateOrder, OrderItem orderItem) {
		this.id = id;
		DateOrder = dateOrder;
		this.orderItem = orderItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOrder() {
		return DateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		DateOrder = dateOrder;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}
}
