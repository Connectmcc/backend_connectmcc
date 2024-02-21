package com.mcc.connectMcc.modal;

import java.time.LocalDateTime;

import jakarta.persistence.AttributeOverride;
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
	
	@Embedded
	@AttributeOverrides ( {
		@AttributeOverride(name="id",column=@Column(name="user_id")),
		@AttributeOverride(name="email",column=@Column(name="user_email"))
	})
	
	 private UserDto user;
	
	@NotNull
	 
	 private String image;
	 private String caption;
	 private LocalDateTime timestamp;
	 
	 public Story()   {
		 
	 }
}
