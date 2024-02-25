package com.mcc.connectMcc.modal;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.GenerationType;

public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private integer id;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="user_id")),
		@AttributeOverride(name="email",column=@Column(name="user_email"))
		
	})
	private userDto user;
	
	private String content;
	
	private Set<userDto> likedByUsers= new HashSet<>{};
	}
