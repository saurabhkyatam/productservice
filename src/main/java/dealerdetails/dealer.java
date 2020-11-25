package dealerdetails;

public class dealer {
	String name,address;
	int shopno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getShopno() {
		return shopno;
	}
	public void setShopno(int shopno) {
		this.shopno = shopno;
	}
	public dealer(String name, String address, int shopno) {
		super();
		this.name = name;
		this.address = address;
		this.shopno = shopno;
	}

}
