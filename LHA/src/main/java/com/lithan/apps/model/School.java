package com.lithan.apps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_school")
public class School {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Column(name="school_code", nullable = false, unique = true)
    private String 	schoolCode;
	
	@Column(name="school_name", nullable = false)
	private String schoolName;
	
	@Column(name="addr_l1", nullable = true)
	private String addrLine1;
	
	@Column(name="addr_l2",nullable = true)
	private String addrLine2;

	@Column(name ="city", nullable = true)
	private String city;
	
	@Column(name ="country", nullable = true)
	private String country;
	
	@Column(name = "school_status", nullable = true)
	private String schoolStatus;
	
	@Column(name = "logo_path", nullable = true)
	private String logoPath;
	
	@Column(name = "remarks", nullable = true)
	private String remarks;
	
	@Column(name = "created_by", nullable = true)
	private String createdBy;
	
	@Column(name = "updated_by", nullable = true)
	private String updatedBy;

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddrLine1() {
		return addrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return addrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSchoolStatus() {
		return schoolStatus;
	}

	public void setSchoolStatus(String schoolStatus) {
		this.schoolStatus = schoolStatus;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public long getId() {
		return id;
	}
	

	
	
}
