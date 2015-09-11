package com.intelemage.vista.api.model;

import java.util.Date;
import java.util.List;

public class Visit {

	private Long id;
	private Integer visitSortIndex;
	private Date creationDate;
	private Long statusId;
	private String name;
	private Long statusIdPriorToVoid;
	private Date visitDate;
	private Long subjectId;
	private Long minDays;
	private Long maxDays;
	private Date qcDatePass;
	private Date qcDateFail;
	private Long defVisit;
	private List<VerticalDataItem> trackedItems;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getVisitSortIndex() {
		return visitSortIndex;
	}
	public void setVisitSortIndex(Integer visitSortIndex) {
		this.visitSortIndex = visitSortIndex;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Long getStatusId() {
		return statusId;
	}
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getStatusIdPriorToVoid() {
		return statusIdPriorToVoid;
	}
	public void setStatusIdPriorToVoid(Long statusIdPriorToVoid) {
		this.statusIdPriorToVoid = statusIdPriorToVoid;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public Long getMinDays() {
		return minDays;
	}
	public void setMinDays(Long minDays) {
		this.minDays = minDays;
	}
	public Long getMaxDays() {
		return maxDays;
	}
	public void setMaxDays(Long maxDays) {
		this.maxDays = maxDays;
	}
	public Date getQcDatePass() {
		return qcDatePass;
	}
	public void setQcDatePass(Date qcDatePass) {
		this.qcDatePass = qcDatePass;
	}
	public Date getQcDateFail() {
		return qcDateFail;
	}
	public void setQcDateFail(Date qcDateFail) {
		this.qcDateFail = qcDateFail;
	}
	public Long getDefVisit() {
		return defVisit;
	}
	public void setDefVisit(Long defVisit) {
		this.defVisit = defVisit;
	}
	public List<VerticalDataItem> getTrackedItems() {
		return trackedItems;
	}
	public void setTrackedItems(List<VerticalDataItem> trackedItems) {
		this.trackedItems = trackedItems;
	}
	
}
