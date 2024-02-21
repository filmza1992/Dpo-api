package com.dpo.model;

import java.time.LocalDateTime;
import java.util.UUID;

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
@Table(name = "tb_employees")
public class TbEmployees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private long employeeId;

	@Column(name = "employee_uuid")
	private String employeeUuid = UUID.randomUUID().toString();

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "employee_surname")
	private String employeeSurname;

	@Column(name = "employee_username")
	private String employeeUsername;

	@Column(name = "employee_password")
	private String employeePassword;

	@Column(name = "employee_line_id")
	private String employeeLineId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "farm_id")
	private TbdFarm tbdFarm;

	@Column(name = "employee_email")
	private String employeeEmail;

	@Column(name = "employee_tel")
	private String employeeTel;

	@Column(name = "employee_address")
	private String employeeAddress;

	@Column(name = "employee_province")
	private String employeeProvince;

	@Column(name = "employee_amphoe")
	private String employeeAmphoe;

	@Column(name = "employee_tumbon")
	private String employeeTumbon;

	@Column(name = "employee_zipcode")
	private String employeeZipcode;

	@Column(name = "employee_image")
	private String employeeImage;

	@Column(name = "employee_status")
	private String employeeStatus;

	@Column(name = "employee_remember")
	private String employeeRemember;

	@Column(name = "time_reg")
	private LocalDateTime timeReg;

}