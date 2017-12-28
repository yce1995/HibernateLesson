package cn.et.hibernate.dao;

/**
 * Foods entity. @author MyEclipse Persistence Tools
 */

public class Foods implements java.io.Serializable {

	// Fields

	private Integer foodid;
	private String foodname;
	private Double price;

	// Constructors

	/** default constructor */
	public Foods() {
	}

	/** full constructor */
	public Foods(String foodname, Double price) {
		this.foodname = foodname;
		this.price = price;
	}

	// Property accessors

	public Integer getFoodid() {
		return this.foodid;
	}

	public void setFoodid(Integer foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return this.foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}