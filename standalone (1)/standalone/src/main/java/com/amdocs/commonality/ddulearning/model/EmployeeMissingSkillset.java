package com.amdocs.commonality.ddulearning.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeMissingSkillset {
	String empId;
	List<String> missingskills = new ArrayList<>();
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public List<String> getMissingskills() {
		return missingskills;
	}
	public void setMissingskills(List<String> missingskills) {
		this.missingskills = missingskills;
	}

}
