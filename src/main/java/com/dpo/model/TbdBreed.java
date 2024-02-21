package com.dpo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.dpo.constant.BreedStatus;
import com.dpo.constant.BreedStatusEdit;

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
@Table(name = "tbd_breed")
public class TbdBreed {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "breed_id")
	private long breedId;

	@Column(name = "breed_uuid")
	private String breedUuid = UUID.randomUUID().toString();

	@Column(name = "breed_code")
	private String breedCode;

	@Column(name = "breed_name")
	private String breedName;

	@Column(name = "breed_date_event")
	private LocalDateTime breedDateEvent;

	@Enumerated
	@Column(name = "status")
	private BreedStatus breedStatus;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "farm_id")
	private TbdFarm tbdFarm;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private TbMember tbMember;

	@Column(name = "codad_ref")
	private Integer codadRef;

	@Column(name = "time_reg")
	private LocalDateTime timeReg = LocalDateTime.now();

	@Column(name = "semen_ref")
	private String semenRef;
	
	@Enumerated
	@Column(name = "status_edit")
	private BreedStatusEdit breedStatusEdit;
	
	@Column(name = "breed_id_string")
	private String breedIdString;

}