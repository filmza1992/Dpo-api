package com.dpo.model;


import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tbd_farm")
public class TbdFarm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "farm_id")
	private long farmId;

	@Column(name = "farm_uuid")
	private String farmUuid = UUID.randomUUID().toString();

	@Column(name = "farm_code")
	private String farmCode;

	@Column(name = "farm_name")
	private String farmName;

	@Column(name = "farm_pic")
	private String farmPic;

	@Column(name = "farm_id_card")
	private String farmIdCard;

	@Column(name = "farm_tel")
	private String farmTel;

	@Column(name = "farm_lati")
	private String farmLati;

	@Column(name = "farm_longti")
	private String farmLongti;

	@Column(name = "farm_address")
	private String farmAddress;

	@Column(name = "farm_status")
	private String farmStatus;

	@Column(name = "farm_date_event")
	private LocalDateTime farmDateEvent;

	@Column(name = "farm_province")
	private String farmProvince;

	@Column(name = "farm_postcode")
	private String farmPostcode;

	@Column(name = "farm_district")
	private String farmDistrict;

	@Column(name = "farm_sub_district")
	private String farmSubDistrict;

	@Column(name = "farm_check_address")
	private int farmCheckAddress;

	@Column(name = "farm_check_type")
	private int farmCheckType;

	@Column(name = "farm_type")
	private int farmType;

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private TbMember tbMember;

	@Column(name = "time_reg")
	private LocalDateTime timeReg;

}