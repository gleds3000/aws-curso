package com.awscurso.entity;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Data
public class Machine implements Serializable {
	public Machine(String ip) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String ip;
	private String name;
	private String os;
	private String architecture;
	private String osVersion;
		
}
