package org.achermida.jm.service.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class ActionEvents {
//	$table->bigIncrements('id');
//    $table->char('batch_id', 36);
//    $table->unsignedInteger('user_id')->index();
//    $table->string('name');
//    $table->string('actionable_type');
//    $table->string('actionable_id');
//    $table->string('target_type');
//    $table->string('target_id');
//    $table->string('model_type');
//    $table->string('model_id')->nullable();
//    $table->text('fields');
//    $table->string('status', 25)->default('running');
//    $table->text('exception');
//    $table->timestamps();
//
//    $table->index(['actionable_type', 'actionable_id']);
//    $table->index(['batch_id', 'model_type', 'model_id']);
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private Long id;

	private char batchId;
	@OneToOne(fetch = FetchType.LAZY)
	private Users user;
	private String name;
	private String actionableType;
	private String actionableId;
	private String targetType;
	private String targetId;
	private String modelType;
	@Column(nullable = true)
	private String modelId;
	@Lob
	private String fields;
	private String status = "running";
	
	@CreationTimestamp
	private LocalDateTime failedAt;
}
