package Entities;

import Abstracts.Entity;

public class Campaign implements Entity {
	
 int id;
	private String name;
	private double discount;
	private boolean status;

		//public Campaign() {}
		
	public Campaign(int id, String name, double d, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.discount = d;
		this.status = status;
	}
	
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
	
}
