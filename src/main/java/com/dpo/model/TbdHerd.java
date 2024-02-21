package com.dpo.model;


import java.time.LocalDateTime;
import java.util.UUID;

import com.dpo.constant.HerdStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Table;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Getter @Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tbd_herd")
public class TbdHerd {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "herd_id")
	private long herdId;

	@Column(name = "herd_uuid")
	private String herdUuid = UUID.randomUUID().toString();

	@Column(name = "herd_code")
	private String herdCode;

	@Column(name = "herd_name")
	private String herdName;

	@Column(name = "herd_status")
	private HerdStatus herdStatus;

	@Column(name = "herd_status" ,insertable = false,updatable = false)
	private String status;
	
	@Column(name = "herd_sex")
	private String herdSex;

	@Column(name = "herd_date_event")
	private LocalDateTime herdDateEvent;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "farm_id")
	private TbdFarm tbdFarm;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private TbMember tbMember;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	private TbEmployees tbEmployees;

	@Column(name = "time_reg")
	private LocalDateTime timeReg;

}