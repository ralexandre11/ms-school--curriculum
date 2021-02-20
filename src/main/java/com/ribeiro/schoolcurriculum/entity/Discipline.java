package com.ribeiro.schoolcurriculum.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_descipline")
@Data
@NoArgsConstructor
public class Discipline implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id")
	private Long id;
	
	@JsonInclude(Include.NON_EMPTY)
	@Column(name = "name")
	private String name;
	
	@Column(name = "hours")
	private int hours;
	
	@JsonInclude(Include.NON_EMPTY)
	@Column(name = "code")
	private String codeDiscipline;
	
	@Column(name = "frequency")
	private int frequency;
	
	

}
