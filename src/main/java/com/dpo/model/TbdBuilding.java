package com.dpo.model;


import java.time.LocalDateTime;
import java.util.UUID;

import com.dpo.constant.BuilStatus;

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
@Table(name = "tbd_building")
public class TbdBuilding {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "buil_id")
	private long builId;

	@Column(name = "buil_uuid")
	private String builUuid = UUID.randomUUID().toString();

	@Column(name = "buil_code")
	private String builCode;

	@Column(name = "buil_name")
	private String builName;

	@Column(name = "buil_status")
	private BuilStatus builStatus;
	
	@Column(name = "buil_status",insertable = false,updatable = false)
	private String status;

	@Column(name = "buil_sex")
	private String builSex;

	@Column(name = "buil_date_event")
	private LocalDateTime builDateEvent;

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