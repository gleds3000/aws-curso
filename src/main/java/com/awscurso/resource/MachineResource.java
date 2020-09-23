package com.awscurso.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awscurso.entity.DetailedMachine;
import com.awscurso.entity.Machine;
import com.awscurso.service.MachineService;

@RestController
@RequestMapping("/machines")
public class MachineResource {
	@Autowired
	private MachineService machineService;
	// get machine method
	@GetMapping("/basic")
	public ResponseEntity<Machine> getMachineInformationEntity(){
		Machine machine = machineService.getMachineInformation();
		return ResponseEntity.ok(machine);
	}
	
	// get detailed method
	@GetMapping("/detailed")
	public ResponseEntity<DetailedMachine> getDetailedMachineInformation(){
		DetailedMachine detailedMachine = machineService.getDetailedMachineInformation();
		return ResponseEntity.ok(detailedMachine);	
	}
}
