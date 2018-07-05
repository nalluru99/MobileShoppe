package com.Mobile;

public class Mobile {
private int id;
private int cost;
private String OS;
private String Brand;
private String style;
private String display;
private int Quantity;
@Override
public String toString() {
	return "Mobile [id=" + id + ", cost=" + cost + ", OS=" + OS + ", Brand=" + Brand + ", style=" + style + ", display="
			+ display + ", Quantity=" + Quantity + "]";
}

public Mobile(int id, int cost, String oS, String brand, String style, String display, int quantity) {
	super();
	this.id = id;
	this.cost = cost;
	OS = oS;
	Brand = brand;
	this.style = style;
	this.display = display;
	Quantity = quantity;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getOS() {
	return OS;
}
public void setOS(String oS) {
	OS = oS;
}
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public String getStyle() {
	return style;
}
public void setStyle(String style) {
	this.style = style;
}
public String getDisplay() {
	return display;
}
public void setDisplay(String display) {
	this.display = display;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
	result = prime * result + ((OS == null) ? 0 : OS.hashCode());
	result = prime * result + Quantity;
	result = prime * result + cost;
	result = prime * result + ((display == null) ? 0 : display.hashCode());
	result = prime * result + id;
	result = prime * result + ((style == null) ? 0 : style.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Mobile other = (Mobile) obj;
	if (Brand == null) {
		if (other.Brand != null)
			return false;
	} else if (!Brand.equals(other.Brand))
		return false;
	if (OS == null) {
		if (other.OS != null)
			return false;
	} else if (!OS.equals(other.OS))
		return false;
	if (Quantity != other.Quantity)
		return false;
	if (cost != other.cost)
		return false;
	if (display == null) {
		if (other.display != null)
			return false;
	} else if (!display.equals(other.display))
		return false;
	if (id != other.id)
		return false;
	if (style == null) {
		if (other.style != null)
			return false;
	} else if (!style.equals(other.style))
		return false;
	return true;
}


}
