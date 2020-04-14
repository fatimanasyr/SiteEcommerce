package model;

import java.sql.Date;
import java.util.List;

public class Order {
	
	private int id;
	private Date DateOrder;
	private OrderItem orderItem;
	private List<OrderItem> listOrderItem;

	public Order(int id, List<OrderItem> listOrderItem, Date dateOrder) {
		this.id = id;
		DateOrder = dateOrder;
		this.listOrderItem = listOrderItem;
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

	public List<OrderItem> getListOrderItem() {
		return listOrderItem;
	}

	public void setListOrderItem(List<OrderItem> listOrderItem) {
		this.listOrderItem = listOrderItem;
	}
}
