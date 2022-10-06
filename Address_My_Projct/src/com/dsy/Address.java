package com.dsy;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="student_address")
public class Address {
	static {
		System.out.println("Address SB....");
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int AddressId;
	
	@Column(length=50,name="STREET")
	private String Street;
	@Column(length=100, name="CITY")
	private String city;
	@Column(name="Is_Open")
	private boolean isOpen;
	@Transient
	private double x;
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)//if we want to have nly date but not time. temporal use to formate date
	private Date addedDate;
	@Lob//if we want our image in large format
	private byte[] image;
	
	{
		System.out.println("Address Instance Block....");
	}
	
	public Address() {
		super();
	}

	public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		AddressId = addressId;
		Street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public int getAddressId() {
		return AddressId;
	}

	public void setAddressId(int addressId) {
		AddressId = addressId;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

}
 