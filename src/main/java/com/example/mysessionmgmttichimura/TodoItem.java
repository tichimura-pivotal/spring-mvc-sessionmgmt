package com.example.mysessionmgmttichimura;

import java.time.LocalDateTime;

public class TodoItem {
	
	private String description;
	private LocalDateTime createDate;
	
	
	/**
	 * @param description
	 * @param createDate
	 */
	public TodoItem(String description, LocalDateTime createDate) {
//		super();
		this.description = description;
		this.createDate = createDate;
	}
	
	
	
	public TodoItem() {
		// TODO Auto-generated constructor stub
	}


	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	

//    @Override
//    public String toString() {
//        return "TodoItem [description=" + description + ", createDate=" + createDate + "]";
//    }	
	
}
