package com.mcc.connectMcc.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Stories")
public class Story {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Integer id;
	
	 private UserDto user;
	 
	 private String image;
	 private String caption;
	 private LocalDateTime timestamp;
	 
	 
}
