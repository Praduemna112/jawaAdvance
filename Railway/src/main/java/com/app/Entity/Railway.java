package com.app.Entity;

import java.time.LocalTime;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "Rail")
public class Railway {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(nullable = false)
	private LocalTime Start_time;
	@Column(nullable = false)
	private LocalTime end_time;
	@Column(nullable = false)
	private String Sourse;
	@Column(nullable = false)
	private String Destiation;
	@Column(nullable = false)
	private int station_code;
	@Column(nullable = false)
	private int Distance;
	@Column(nullable = false)
	private String Frequence;

}
