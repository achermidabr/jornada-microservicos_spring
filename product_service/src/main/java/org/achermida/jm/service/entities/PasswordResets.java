package org.achermida.jm.service.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(indexes = @Index(columnList = "email"))
public class PasswordResets {
//	$table->string('email')->index();
//    $table->string('token');
//    $table->timestamp('created_at')->nullable();
	
	@Id
	@Column(name = "token", updatable = false, unique = true, nullable = false)
	private String token;
	@NotNull
	@Email
	private String email;
	@Column(nullable = true)
	private LocalDateTime failedAt;
}
