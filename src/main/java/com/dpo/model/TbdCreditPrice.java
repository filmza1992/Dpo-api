package com.dpo.model;


import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Getter @Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tbd_credit_price")
public class TbdCreditPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tbd_credit_price_id")
	private long tbdCreditPriceId;

	@Column(name = "tbd_credit_name")
	private String tbdCreditName;

	@Column(name = "tbd_credit_price")
	private int tbdCreditPrice;

	@Column(name = "tbd_credit_count_day")
	private int tbdCreditCountDay;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

}