package com.mcc.connectMcc.modal;
 
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mcc.connectMcc.dto.UserDto;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String caption;
	
	private String image;
	private String location;
	private LocalDateTime createdAt;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="user_id")),
		@AttributeOverride(name="email",column=@Column(name="user_email"))
		
	})
	private UserDto user;
	
	@OneToMany
	private List<Comments> comments=new ArrayList<Comments>();
    private Set<UserDto>
	
	
}
