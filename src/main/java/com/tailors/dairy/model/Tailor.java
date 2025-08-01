package com.tailors.dairy.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
public class Tailor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(unique=true)
	private String email;

	@Column(unique=true, nullable=false)
	private String phone;

	@Column(nullable=false)
	private String password;

	@Column(nullable=false)
	private String shopName;

	private LocalDateTime registeredAt = LocalDateTime.now();

}
