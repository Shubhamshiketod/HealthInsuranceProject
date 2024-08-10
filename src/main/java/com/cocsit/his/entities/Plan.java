package com.cocsit.his.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;



@Entity
@Table(name="Plan_tbl")
public class Plan {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer planId;
	
	@Column(name="PLAN_NAME_COL")
	String planName;
	@Column(name="PLAN_START_DATE_COL")
	String planStartDate;
	
	@Column(name="PLAN_END_DATE_COL")
	String PlanEndDate;
	
	@Column(name="PLAN_CATEGORY_COL")
	String planCategory;
	
	
	@Column(name="PLAN_ACTIVESW_COL")
	String activeSw;
	
	@Column(name="created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;
	
	@Column(name="updated_at")
	private LocalDateTime updatedAt;
	
	
	
	public User getCreatedBy() {
		return createdBy;
	}





	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}





	public User getUpdatedBy() {
		return updatedBy;
	}





	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
	
	@ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "updated_by")
    private User updatedBy;
	
	
	
	
	
	
	public Plan(String planName, String planStartDate, String planEndDate, String planCategory, String activeSw,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.planName = planName;
		this.planStartDate = planStartDate;
		PlanEndDate = planEndDate;
		this.planCategory = planCategory;
		this.activeSw = activeSw;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}





	public LocalDateTime getCreatedAt() {
		return createdAt;
	}





	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}





	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}





	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	
	
	@PrePersist
	protected void onCreate() {
		createdAt = LocalDateTime.now();
	}

	@PreUpdate
	protected void onUpdate() {
		updatedAt = LocalDateTime.now();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}
	public String getPlanEndDate() {
		return PlanEndDate;
	}
	public void setPlanEndDate(String planEndDate) {
		PlanEndDate = planEndDate;
	}
	public String getPlanCategory() {
		return planCategory;
	}
	public void setPlanCategory(String planCategory) {
		this.planCategory = planCategory;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	
	

	public Integer getPlanId() {
		return planId;
	}
	
	
	
	
	
	
	

}
