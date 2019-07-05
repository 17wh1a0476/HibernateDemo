package com.gp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Student_Details")
class Student
{
	@Id@GeneratedValue
	@Column(name="stno",length=20)
	int sno;
	@Column(name="sname",length=20)
	String sname;

	@Column(name="addr" ,length=20)
	//@Transient //it does not involve the column in persistance
	String addr;

	public void setSno(Integer x)
	{
		sno=x;
	}

	public Integer getSno()
	{
		return sno;
	}
	public void setSname(String y)
	{
		sname=y;
	}

	//@Transient
	public String getSname()
	{
		return sname;
	}
	public void setAddr(String z)
	{
		addr=z;
	}
	public String getAddr()
	{
		return addr;
	}
}
