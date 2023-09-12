package com.amdocs.commonality.ddulearning.standalone.service;
import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.Service;

import com.amdocs.commonality.ddulearning.model.EmployeeMissingSkillset;
import com.amdocs.commonality.ddulearning.model.EmployeeSkillset;

@Service
public class ValidateSkillsApplicationService {

	
	EmployeeMissingSkillset employeeMissingSkillset;
	
	public EmployeeMissingSkillset validateSkills(EmployeeSkillset employeeSkillset)
	{
		employeeMissingSkillset.setEmpId(employeeSkillset.getEmpId());
		employeeSkillset.getRequiredSkills()
.removeIf(skill -> employeeSkillset.getActualSkills().stream().anyMatch(skill2 -> skill2.equalsIgnoreCase(skill)));
		employeeMissingSkillset.setMissingskills(employeeSkillset.getRequiredSkills());

	return employeeMissingSkillset;
	}
}
