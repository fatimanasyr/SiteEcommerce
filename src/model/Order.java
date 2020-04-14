package model;

import java.sql.Date;
import java.util.List;

public class Order {
	
	private int id;
	private Date dateOrder;
	private OrderItem orderItem;
	private List<OrderItem> listOrderItem;

	public Order(int id ,  Date dateOrder) {
		this.id = id;
		this.dateOrder = dateOrder;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public List<OrderItem> getListOrderItem() {
		return listOrderItem;
	}

	public void setListOrderItem(List<OrderItem> listOrderItem) {
		this.listOrderItem = listOrderItem;
	}
}
