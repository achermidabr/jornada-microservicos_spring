package org.achermida.jm.service.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class FailedJobs {
//	$table->bigIncrements('id');
//    $table->text('connection');
//    $table->text('queue');
//    $table->longText('payload');
//    $table->longText('exception');
//    $table->timestamp('failed_at')->useCurrent();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID id;

	private String connection;
	private String queue;
	@Lob
	private String payload;
	@Lob
	private String exception;
	@CreationTimestamp
	private LocalDateTime failedAt;
}
