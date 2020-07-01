package com.awscurso.service;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.awscurso.entity.DetailedMachine;
import com.awscurso.entity.Machine;
@Component
@Service
public class MachineService {
	
	// buscar informacao basica 
	// get machine information
	public Machine getMachineInformation()  {
		try {
			Inet4Address address = (Inet4Address) InetAddress.getLocalHost();
			String ip = address.getHostAddress();
			String name = address.getHostName();
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String osVersion = System.getProperty("os.version");
			
			Machine machine = new Machine(ip, name, os, arch, osVersion);
					
			return machine;
		} catch (UnknownHostException e) {
			 e.printStackTrace();
			 return null;
		}
	}
	
	
	// get detailed 
	public DetailedMachine getDetailedMachineInformation()    {
		try {
			Inet4Address address = (Inet4Address) InetAddress.getLocalHost();
			String ip = address.getHostAddress();
			String name = address.getHostName();
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String osVersion = System.getProperty("os.version");
			String javaVersion = System.getProperty("java.version");
			String javaVendor = System.getProperty("java.vendor");
			String javaVendorUrl = System.getProperty("java.vendor.url");
			
			DetailedMachine detailedMachine = new DetailedMachine(ip, name, os, arch, osVersion, javaVersion,
					javaVendor, javaVendorUrl);
			
			return detailedMachine;
		}catch (UnknownHostException e ) {
			e.printStackTrace();
			return null;
			
		}
	}
}
