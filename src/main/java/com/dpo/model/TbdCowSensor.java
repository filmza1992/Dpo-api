package com.dpo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Getter @Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tbd_cow_sensor")
public class TbdCowSensor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cow_sensor_id")
	private long cowSensorId;

	@Column(name = "cow_sensor_uuid")
	private String cowSensorUuid = UUID.randomUUID().toString();

	@Column(name = "life_number")
	private String lifeNumber;

	@Column(name = "responder1")
	private String responder1;

	@Column(name = "responder1_image")
	private String responder1Image;

	@Column(name = "responder2")
	private String responder2;

	@Column(name = "responder2_image")
	private String responder2Image;

	@Column(name = "responder3")
	private String responder3;

	@Column(name = "responder3_image")
	private String responder3Image;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cow_id")
	private TbdCow tbdCow;

	@Column(name = "create_at")
	private LocalDateTime createAt = LocalDateTime.now();

}
