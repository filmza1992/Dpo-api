package com.dpo.model;


import java.time.LocalDateTime;
import java.util.UUID;

import com.dpo.constant.CowTypeConstant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tbd_cow_type")
public class TbdCowType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cow_type_id")
	private long cowTypeId;
	
	@Enumerated
	@Column(name = "cow_type_id" ,insertable = false,updatable = false)
	private CowTypeConstant cowTypeConstant;

	@Column(name = "cow_type_uuid")
	private String cowTypeUuid = UUID.randomUUID().toString();

	@Column(name = "cow_type_code")
	private String cowTypeCode;

	@Column(name = "cow_type_name")
	private String cowTypeName;

	@Column(name = "cow_type_date_event")
	private LocalDateTime cowTypeDateEvent;
	
	@Column(name = "time_reg")
	private LocalDateTime timeReg;

}