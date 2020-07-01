package com.awscurso.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

public class Machine {
	private String ip;
	private String name;
	private String os;
	private String architecture;
	private String osVersion;
		
}
