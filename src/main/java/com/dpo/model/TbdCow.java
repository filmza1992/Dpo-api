package com.dpo.model;


import java.time.LocalDateTime;
import java.util.UUID;

import com.dpo.constant.CowStatus;
import com.dpo.constant.CowTypeConstant;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;


@Getter @Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tbd_cow")
public class TbdCow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cow_id")
	private long cowId;

	@Column(name = "cow_uuid")
	private String cowUuid = UUID.randomUUID().toString();

	@Column(name = "cow_code")
	private String cowCode = "";

	@Column(name = "zyan_code")
	private String zyanCode;

	@Column(name = "farm_code")
	private String farmCode = "";

	@Column(name = "nid_code")
	private String nidCode= "";

	@Column(name = "rfid_code")
	private String rfidCode;

	@Column(name = "dpo_code")
	private String dpoCode = "";

	@Column(name = "cow_ear_code")
	private String cowEarCode = "";

	@Column(name = "cow_fa_code")
	private String cowFaCode = "";

	@Column(name = "cow_fa_zyan_code")
	private String cowFaZyanCode = "";

	@Column(name = "cow_fa_nid")
	private String cowFaNid = "";

	@Column(name = "cow_fa_rfid")
	private String cowFaRfid = "";

	@Column(name = "cow_fa_dpo")
	private String cowFaDpo = "";

	@Column(name = "cow_ma_code")
	private String cowMaCode = "";

	@Column(name = "cow_ma_zyan_code")
	private String cowMaZyanCode = "";

	@Column(name = "cow_ma_nid")
	private String cowMaNid = "";

	@Column(name = "cow_ma_rfid")
	private String cowMaRfid = "";

	@Column(name = "cow_ma_dpo")
	private String cowMaDpo = "";

	@Column(name = "cow_name")
	private String cowName = "";

	@Column(name = "cow_birth")
	private String cowBirth = "";

	@Column(name = "cow_sex")
	private String cowSex = "";

	@Column(name = "cow_date_event")
	private String cowDateEvent = "";

	@Column(name = "cow_date_event_detail")
	private String cowDateEventDetail = "ไม่มีรายการทำกิจกรรม";

	@Enumerated
	@Column(name = "cow_status")
	private CowStatus cowStatus;

	@Column(name = "cow_gestation")
	private String cowGestation = "ไม่ท้อง";

	@Column(name = "cow_im_ges")
	private int cowImGes = 0;

	@Column(name = "cow_img")
	private String cowImg = "cowDemo.jpg";

	@Column(name = "cow_qrcode")
	private String cowQrcode = "";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buil_id")
	private TbdBuilding tbdBuilding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "herd_id")
	private TbdHerd tbdHerd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "breed_id")
	private TbdBreed tbdBreed;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cow_type_id")
	private TbdCowType tbdCowType;

	@Enumerated
	@Column(name = "cow_type_id" ,insertable = false,updatable = false)
	private CowTypeConstant cowTypeConstant;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "import_cow_type_id")
	private TbdImportCow tbdImportCow;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "farm_id")
	private TbdFarm tbdFarm;

	@Column(name = "expiration_date_cow")
	private LocalDateTime expirationDateCow;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "credit_price_id")
	private TbdCreditPrice tbdCreditPrice;

	@OneToOne
	@JoinColumn(name = "cow_sensor_id")
	private TbdCowSensor tbdCowSensor;

	@Column(name = "time_reg")
	private LocalDateTime timeReg = LocalDateTime.now();

}
