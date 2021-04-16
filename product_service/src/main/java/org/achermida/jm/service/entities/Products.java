package org.achermida.jm.service.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Products {
//	$table->uuid('id')->primary();
//    $table->string('name');
//    $table->string('description');
//    $table->float('price');
//    $table->integer('qtd_available');
//    $table->integer('qtd_total');
//    $table->timestamps();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID id;

	@NotNull
	private String name;
	@NotNull
	private String description;
	@NotNull
	@Min(0)
	private BigDecimal price;
	@NotNull
	@Min(0)
	private Integer qtdAvailable;
	@NotNull
	@Min(0)
	private Integer qtdTotal;
	@CreationTimestamp
	private LocalDateTime version;
}
