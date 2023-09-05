package com.example.demo.model;



//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Orderitem_table")
public class OrderItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ord_item_id;
	private int ord_id;
	private int quantity;
	private int unitprice;
	public OrderItem(int ord_item_id, int ord_id, int quantity, int unitprice) {
		super();
		this.ord_item_id = ord_item_id;
		this.ord_id = ord_id;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrd_item_id() {
		return ord_item_id;
	}
	public void setOrd_item_id(int ord_item_id) {
		this.ord_item_id = ord_item_id;
	}
	public int getOrd_id() {
		return ord_id;
	}
	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}
}
	//@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="fk_orderid")
	//private List<Order> or;

	