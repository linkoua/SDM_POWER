package com.sandbox.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TABLE_TEST")
@Getter
@Setter
public class TestClass {
	@Id
	@Column(name = "DATE_J")
	private Date dateJ;
	@Column(name = "CODE_RE")
	private String code;
}
