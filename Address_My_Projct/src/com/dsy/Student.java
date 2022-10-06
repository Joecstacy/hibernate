package com.dsy;
import javax.persistence.*;

@Entity
@Table(name="student")
public class Student{
	static {
		System.out.println("Student1 static block");
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private int sid;
	@Column(name="student_name")
	private String sname;
	@Column(name="student_city")
	private String city;
	@Column(name="total_fee")
	private double totalfee;
	@Column(name="status")
	private String status;
	
	{	
		System.out.println("student Instance Block....");
	}
	public Student() {
		super();
		
	}
	public Student(int sid, String sname, String city, double totalfee, String status) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.totalfee = totalfee;
		this.status = status;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getTotalfee() {
		return totalfee;
	}


	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+","+sid+","+sname+","+city+","+totalfee+","+status;
	}
*/

	

}
