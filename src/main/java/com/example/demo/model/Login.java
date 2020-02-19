package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LOGIN")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Login {

	@Id
	 int id;
	 String name, password;
}
