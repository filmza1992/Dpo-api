package com.dpo.model;


import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tb_member")
public class TbMember {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private long memberId;

	@Column(name = "member_uuid")
	private String memberUuid = UUID.randomUUID().toString();

	@Column(name = "member_name")
	private String memberName;

	@Column(name = "member_surname")
	private String memberSurname;

	@Column(name = "member_email")
	private String memberEmail;

	@Column(name = "member_password")
	private String memberPassword;
	
	@Column(name = "member_hashed_password")
	private String memberHashedPassword;

	@Column(name = "member_tel")
	private String memberTel;

	@Column(name = "member_line_id")
	private String memberLineId;

	@Column(name = "indairy")
	private int indairy;

	@Column(name = "inemarket")
	private int inemarket;

	@Column(name = "invet")
	private int invet;

	@Column(name = "intrace")
	private int intrace;

	@Column(name = "inperf")
	private int inperf;

	@Column(name = "inhealth")
	private int inhealth;

	@Column(name = "register_from")
	private String registerFrom;

	@Column(name = "member_addr")
	private String memberAddr;

	@Column(name = "member_province")
	private String memberProvince;

	@Column(name = "member_postcode")
	private String memberPostcode;

	@Column(name = "member_personal_id")
	private String memberPersonalId;

	@Column(name = "member_personal_card_img")
	private String memberPersonalCardImg;

	@Column(name = "member_personal_card_selfie_img")
	private String memberPersonalCardSelfieImg;

	@Column(name = "member_bank_account")
	private String memberBankAccount;

	@Column(name = "member_bank_account_img")
	private String memberBankAccountImg;

	@Column(name = "member_lat")
	private String memberLat;

	@Column(name = "member_long")
	private String memberLong;

	@Column(name = "member_confirm")
	private int memberConfirm;

	@Column(name = "admin_confirm")
	private int adminConfirm;

	@Column(name = "member_tos_accept")
	private int memberTosAccept;

	@Column(name = "member_remember")
	private String memberRemember;

	@Column(name = "member_facebook_id")
	private String memberFacebookId;

	@Column(name = "time_reg")
	private LocalDateTime timeReg;

	
	//Zyanwoa App
	@Column(name = "zw_id_card")
	private String zwIdCard;
	
	@Column(name = "zw_kyc_temp_uuid")
	private String zwKycTempUuid;
	
	
	@JsonBackReference
	@OneToOne(mappedBy = "tbMember", fetch = FetchType.LAZY)
	@ToString.Exclude
	private TbdFarm tbdFarm;
}
