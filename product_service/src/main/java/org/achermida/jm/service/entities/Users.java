package org.achermida.jm.service.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(indexes = @Index(columnList = "email", unique = true))
public class Users {

//	$table->bigIncrements('id');
//    $table->string('name');
//    $table->string('email')->unique();
//    $table->timestamp('email_verified_at')->nullable();
//    $table->string('password');
//    $table->rememberToken();
//    $table->timestamps();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private Long id;
	@NotNull
	private String name;
	@NotNull
	@Email
	private String email;
	@Column(nullable = true)
	private LocalDateTime emailVerifiedAt;
	@Column(nullable = false)
	private String password;
	@NotNull
	private String token;
	@CreationTimestamp
	private LocalDateTime version;
}
