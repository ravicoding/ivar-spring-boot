package com.ivar.test.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;


@Entity
@Table(name = "ACTVY_LOG")
@Validated
public class Activity {
	public Activity() {
		
	}	
	
	@Id
	@Column(name = "LOG_ID")
	@NotEmpty
	private int id;
	
	@Column(name = "TYPE_TX")
	private String eventType;
	
	@Column(name = "VALUE_TX")
	private String eventValue;
	
	@Column(name = "CRTD_BY")
	private String createBy;	
	
	@Column(name = "CRTD_DT")
	private Date createDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventValue() {
		return eventValue;
	}
	public void setEventValue(String eventValue) {
		this.eventValue = eventValue;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	public String getCreateBy() {
		return this.createBy;
	}
	
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	
	
	
	
}
