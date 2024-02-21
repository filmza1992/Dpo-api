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
@Table(name = "tbd_import_cow")
public class TbdImportCow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "import_cow_type_id")
	private long importCowTypeId;

	@Column(name = "import_cow_type_uuid")
	private String importCowTypeUuid = UUID.randomUUID().toString();

	@Column(name = "import_cow_type_code")
	private String importCowTypeCode;

	@Column(name = "import_cow_type_name")
	private String importCowTypeName;

	@Column(name = "import_cow_type_date_event")
	private LocalDateTime importCowTypeDateEvent;

	@Column(name = "time_reg")
	private LocalDateTime timeReg;

}