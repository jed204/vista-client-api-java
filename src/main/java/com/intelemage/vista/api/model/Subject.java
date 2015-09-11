package com.intelemage.vista.api.model;

import java.util.Date;

public class Subject {

	private Long id;
	private Date creationDate;
	private String name;
	private String screeningNumber;
	private Long statusId;
	private Long statusIdPriorToVoid;
	private Long enrollmentStatusId;
	private String statusText;
	private Long siteId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScreeningNumber() {
		return screeningNumber;
	}
	public void setScreeningNumber(String screeningNumber) {
		this.screeningNumber = screeningNumber;
	}
	public Long getStatusId() {
		return statusId;
	}
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	public Long getStatusIdPriorToVoid() {
		return statusIdPriorToVoid;
	}
	public void setStatusIdPriorToVoid(Long statusIdPriorToVoid) {
		this.statusIdPriorToVoid = statusIdPriorToVoid;
	}
	public Long getEnrollmentStatusId() {
		return enrollmentStatusId;
	}
	public void setEnrollmentStatusId(Long enrollmentStatusId) {
		this.enrollmentStatusId = enrollmentStatusId;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	
}
