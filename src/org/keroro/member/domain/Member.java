package org.keroro.member.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Data
@Log4j
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	
	private String mid;
	private String mpw;
	private double grade;
	private Date regdate;
	private Date updateDate;
	
}
